package darkorg.sereneseasonsphc2crops.event;

import darkorg.sereneseasonsphc2crops.SereneSeasonsPHC2Crops;
import darkorg.sereneseasonsphc2crops.data.server.ModBlockTagsProvider;
import darkorg.sereneseasonsphc2crops.data.server.ModItemTagsProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = SereneSeasonsPHC2Crops.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var blockTagsProvider = new ModBlockTagsProvider(
                event.getGenerator().getPackOutput(),
                event.getLookupProvider(),
                event.getExistingFileHelper()
        );
        var itemTagsProvider = new ModItemTagsProvider(
                event.getGenerator().getPackOutput(),
                event.getLookupProvider(),
                blockTagsProvider.contentsGetter(),
                event.getExistingFileHelper()
        );

        event.addProvider(blockTagsProvider);
        event.addProvider(itemTagsProvider);
    }
}
