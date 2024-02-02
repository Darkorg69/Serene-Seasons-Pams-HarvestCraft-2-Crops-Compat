package darkorg.sereneseasonsphc2crops.event;

import darkorg.sereneseasonsphc2crops.SereneSeasonsPHC2Crops;
import darkorg.sereneseasonsphc2crops.data.server.ModBlockTagsProvider;
import darkorg.sereneseasonsphc2crops.data.server.ModItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = SereneSeasonsPHC2Crops.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(packOutput, lookupProvider, existingFileHelper);
        ModItemTagsProvider itemTagsProvider = new ModItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper);

        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), itemTagsProvider);
    }
}
