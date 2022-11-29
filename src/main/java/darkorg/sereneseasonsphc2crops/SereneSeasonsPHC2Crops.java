package darkorg.sereneseasonsphc2crops;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("sereneseasonsphc2crops")

public class SereneSeasonsPHC2Crops {
    public SereneSeasonsPHC2Crops() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
