package darkorg.sereneseasonsphc2crops;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("sereneseasonsphc2crops")
public class SereneSeasonsPHC2Crops {
    public static final String MOD_ID = "sereneseasonsphc2crops";

    public SereneSeasonsPHC2Crops() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
