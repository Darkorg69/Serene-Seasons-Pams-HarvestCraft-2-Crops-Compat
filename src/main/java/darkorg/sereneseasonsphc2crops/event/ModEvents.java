package darkorg.sereneseasonsphc2crops.event;

import darkorg.sereneseasonsphc2crops.SereneSeasonsPHC2Crops;
import darkorg.sereneseasonsphc2crops.data.server.ModBlockTagsProvider;
import darkorg.sereneseasonsphc2crops.data.server.ModItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SereneSeasonsPHC2Crops.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(generator, existingFileHelper);
        ModItemTagsProvider itemTagsProvider = new ModItemTagsProvider(generator, blockTagsProvider, existingFileHelper);

        generator.addProvider(blockTagsProvider);
        generator.addProvider(itemTagsProvider);
    }
}
