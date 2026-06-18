package darkorg.sereneseasonsphc2crops;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod("sereneseasonsphc2crops")
public class SereneSeasonsPHC2Crops {
    public static final String MOD_ID = "sereneseasonsphc2crops";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SereneSeasonsPHC2Crops(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
    }
}
