# AGENTS.md — Serene Seasons + Pam's HarvestCraft 2: Crops Compat

## Build Commands

```bash
# Full clean build (all modules)
.\gradlew.bat clean build

# Build without clean
.\gradlew.bat build

# Regenerate IntelliJ run configs (Forge only — NeoGradle uses 'idea')
.\gradlew.bat :Forge:genIntellijRuns

# Run tasks (ForgeGradle)
.\gradlew.bat :Forge:Client
.\gradlew.bat :Forge:Server
.\gradlew.bat :Forge:Data

# Run tasks (NeoGradle)
.\gradlew.bat :NeoForge:runClient
.\gradlew.bat :NeoForge:runServer
.\gradlew.bat :NeoForge:runData
```

## Project Structure

Multi-platform Minecraft mod supporting both **Forge** and **NeoForge** from a single repo.
Modeled after the BetterLevelingPrivate multi-loader pattern.

```
settings.gradle          — Includes Common, Forge, NeoForge; plugin repos
gradle.properties        — ALL version properties and CurseMaven file IDs
build.gradle             — Root subprojects block with shared repos

Common/
  build.gradle           — Simple java-library, no loader dependencies
  src/main/java/...      — MOD_ID constant only (common code lives here)
  src/main/resources/    — pack.mcmeta (pack_format 22 for 1.20.4)

Forge/
  build.gradle           — ForgeGradle + Parchment, CurseMaven deps with fg.deobf()
  src/main/java/...      — @Mod entry point, ModEvents (data gen), tag providers
  src/main/resources/    — META-INF/mods.toml (modId="forge" for loader dep)

NeoForge/
  build.gradle           — NeoGradle userdev 7.0.97, CurseMaven deps (no fg.deobf())
  src/main/java/...      — @Mod entry point (IEventBus), ModEvents, tag providers
  src/main/resources/    — META-INF/mods.toml (modId="neoforge" for loader dep)
```

## Key Design Decisions

### Common Module Pattern
Common source is compiled INTO each loader module via `tasks.withType(JavaCompile).configureEach { source(project(":Common").sourceSets.main.allSource) }`. This avoids needing a shared library jar at runtime. The Common module only contains the `MOD_ID` constant.

### CurseMaven Dependency IDs
CurseMaven file IDs are **different per loader** (e.g., GlitchCore: Forge=5088441, NeoForge=5088442).
Always verify file IDs on CurseForge before updating. The project ID for each mod is in the CurseMaven string (e.g., `glitchcore-955399`).

### Forge vs NeoForge Dependencies
- **Forge** CurseMaven deps need `fg.deobf()` wrapper
- **NeoForge** CurseMaven deps do NOT need `fg.deobf()`
- NeoForge mods.toml uses `modId="neoforge"` (not `"forge"`) for the loader dependency

### Forge Run Configs
- Do NOT add `source project(':Common').sourceSets.main` to the ForgeGradle `mods {}` block. This creates a separate Java module on the module path, causing `ResolutionException: Modules main and sereneseasonsphc2crops export package ...` because both export the same package.
- Common's source is already compiled into Forge's source set, so it doesn't need to be listed separately.
- The `sourceSets.each` block in Forge/build.gradle redirects all output to the same directory — keep this.

### NeoForge @Mod Constructor
NeoForge 1.20.4 `@Mod` constructors take `IEventBus modEventBus` as a parameter. Forge 1.20.4 constructors are parameterless.

## Dependency Compatibility Matrix (MC 1.20.4)

| Dependency | CurseForge Project ID | Forge File ID | NeoForge File ID | Version | Notes |
|---|---|---|---|---|---|
| Serene Seasons | 291874 | 5206531 | 5206533 | 9.3.0.24 | Latest for 1.20.4. Requires GlitchCore >= 1.0.0.54 |
| Pam's HC2 Crops | 361385 | 5195161 | 5530087 | — | CurseMaven file IDs differ per loader |
| GlitchCore | 955399 | 5088441 | 5088442 | 1.0.0.59 | Required >= 1.0.0.54 by Serene Seasons |

### GlitchCore Version Constraints
- **All** Serene Seasons 1.20.4 versions (including 9.3.0.19) require GlitchCore `[1.0.0.54,)`
- GlitchCore 1.0.0.52 introduced `MixinGuiGraphics` (broken mixin — see below)
- GlitchCore 1.0.0.51 is the last version WITHOUT the broken mixin, but it's too old for Serene Seasons
- **There is no version combination that avoids the broken mixin while satisfying Serene Seasons**
- GlitchCore 1.0.0.49 (CurseMaven 5023388/5023389) does NOT satisfy the version range

### Forge Version
- Forge 49.0.53 and 49.2.7 both work for compilation
- Both have the same upstream mixin issues in the dev environment
- The version range in mods.toml is `[49,)` so either works at runtime

## Known Issues — Dev Environment Only

These bugs affect **only the ForgeGradle/NeoGradle dev environment**. The compiled mod jars work fine in a real Minecraft installation.

### Serene Seasons MixinBlockStateBase (Forge Server)
```
InvalidInjectionException: @Inject annotation on onRandomTick could not find any targets
matching 'BlockBehaviour$BlockStateBase;m_222972_(ServerLevel;BlockPos;RandomSource;)V'
Using refmap sereneseasons.refmap.json
```
**Cause**: Serene Seasons' mixin refmap targets SRG method name `m_222972_` (randomTick), but ForgeGradle dev uses Mojang names. The refmap is not remapped for the dev environment.

### GlitchCore MixinGuiGraphics (Forge Client)
```
MixinBakeryException: Mixin [glitchcore.mixins.json:MixinGuiGraphics from mod glitchcore]
failed in net.minecraft.client.gui.GuiGraphics: @ModifyVariable was not found because
target method m_280497_ was not found
```
**Cause**: GlitchCore's mixin refmap targets SRG method name `m_280497_` (renderTooltipInternal), same mapping issue as above. Client-only mixin.

### NeoForge ANTLR/ASM Module Conflict
```
ResolutionException: Module org.antlr.antlr4.runtime reads more than one module
named org.objectweb.asm.tree
```
**Cause**: NeoGradle module system conflict between ASM library versions. Upstream NeoGradle issue.

## Upgrading Checklist

When updating Minecraft version or dependencies:

1. Update `gradle.properties` versions (Minecraft, Forge, NeoForge, CurseMaven file IDs)
2. Verify CurseMaven file IDs on CurseForge (they differ per loader!)
3. Check that Serene Seasons + GlitchCore version requirements are still compatible
4. Update `pack_format` in `Common/src/main/resources/pack.mcmeta` if Minecraft version changed
5. Update version ranges in both `mods.toml` files
6. Run `.\gradlew.bat clean build` to verify compilation
7. Regenerate run configs: `.\gradlew.bat :Forge:genIntellijRuns`
8. Test both Forge and NeoForge server/client

## Tips

- Always run `clean` before `build` after changing dependency versions
- Forge run config regeneration via `genIntellijRuns` must be re-run after any `build.gradle` changes
- NeoGradle uses `.\gradlew.bat :NeoForge:idea` instead of `genIntellijRuns`
- The `sourceSets.each` output redirection in both Forge and NeoForge `build.gradle` is intentional — it merges Common output into the loader's output directory to avoid module conflicts
