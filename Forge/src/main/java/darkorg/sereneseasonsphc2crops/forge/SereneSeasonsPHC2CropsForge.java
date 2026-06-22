package darkorg.sereneseasonsphc2crops.forge;

import darkorg.sereneseasonsphc2crops.common.SereneSeasonsPHC2CropsCommon;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(SereneSeasonsPHC2CropsCommon.MOD_ID)
public class SereneSeasonsPHC2CropsForge {
    public SereneSeasonsPHC2CropsForge() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
