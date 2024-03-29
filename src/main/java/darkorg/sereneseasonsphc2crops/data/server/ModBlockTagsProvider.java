package darkorg.sereneseasonsphc2crops.data.server;

import darkorg.sereneseasonsphc2crops.SereneSeasonsPHC2Crops;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import sereneseasons.init.ModTags;

import java.util.concurrent.CompletableFuture;

import static com.pam.pamhc2crops.setup.BlockRegistration.*;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, ExistingFileHelper pExistingFileHelper) {
        super(pPackOutput, pLookupProvider, SereneSeasonsPHC2Crops.MOD_ID, pExistingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pLookupProvider) {
        tag(ModTags.Blocks.SPRING_CROPS).add(
                pamaloecrop.get(),
                pamasparaguscrop.get(),
                pambarleycrop.get(),
                pambarrelcactuscrop.get(),
                pambeancrop.get(),
                pambroccolicrop.get(),
                pambrusselsproutcrop.get(),
                pamcabbagecrop.get(),
                pamcalabashcrop.get(),
                pamcanolacrop.get(),
                pamcauliflowercrop.get(),
                pamcelerycrop.get(),
                pamchiacrop.get(),
                pamchickpeacrop.get(),
                pamcoffeebeancrop.get(),
                pamflaxcrop.get(),
                pamgarliccrop.get(),
                pamjicamacrop.get(),
                pamkalecrop.get(),
                pamkohlrabicrop.get(),
                pamleekcrop.get(),
                pamlentilcrop.get(),
                pamlettucecrop.get(),
                pamnettlescrop.get(),
                pamoatscrop.get(),
                pamonioncrop.get(),
                pampapyruscrop.get(),
                pamparsnipcrop.get(),
                pampeascrop.get(),
                pamquinoacrop.get(),
                pamrhubarbcrop.get(),
                pamscallioncrop.get(),
                pamsorghumcrop.get(),
                pamspinachcrop.get(),
                pamstrawberrycrop.get(),
                pamsweetpotatocrop.get(),
                pamtealeafcrop.get(),
                pamtrufflecrop.get(),
                pamturnipcrop.get(),
                pamyuccacrop.get(),
                pamzucchinicrop.get());

        tag(ModTags.Blocks.SUMMER_CROPS).add(pamagavecrop.get(),
                pamalfalfacrop.get(),
                pamamaranthcrop.get(),
                pambarleycrop.get(),
                pambarrelcactuscrop.get(),
                pambeancrop.get(),
                pambellpeppercrop.get(),
                pamblueberrycrop.get(),
                pambokchoycrop.get(),
                pamcactusfruitcrop.get(),
                pamcalabashcrop.get(),
                pamcandleberrycrop.get(),
                pamcantaloupecrop.get(),
                pamcassavacrop.get(),
                pamcattailcrop.get(),
                pamchiacrop.get(),
                pamchilipeppercrop.get(),
                pamcloudberrycrop.get(),
                pamcoffeebeancrop.get(),
                pamcorncrop.get(),
                pamcottoncrop.get(),
                pamcucumbercrop.get(),
                pamgingercrop.get(),
                pamgrapecrop.get(),
                pamgreengrapecrop.get(),
                pamjutecrop.get(),
                pamkenafcrop.get(),
                pamkiwicrop.get(),
                pamkohlrabicrop.get(),
                pamlotuscrop.get(),
                pammilletcrop.get(),
                pammulberrycrop.get(),
                pammustardseedscrop.get(),
                pamnopalescrop.get(),
                pamokracrop.get(),
                pamonioncrop.get(),
                pampapyruscrop.get(),
                pampeanutcrop.get(),
                pampeascrop.get(),
                pampineapplecrop.get(),
                pamradishcrop.get(),
                pamraspberrycrop.get(),
                pamricecrop.get(),
                pamsesameseedscrop.get(),
                pamsisalcrop.get(),
                pamsoybeancrop.get(),
                pamspiceleafcrop.get(),
                pamsweetpotatocrop.get(),
                pamtarocrop.get(),
                pamtealeafcrop.get(),
                pamtomatillocrop.get(),
                pamtomatocrop.get(),
                pamtrufflecrop.get(),
                pamwaterchestnutcrop.get(),
                pamwolfberrycrop.get(),
                pamyuccacrop.get());

        tag(ModTags.Blocks.AUTUMN_CROPS).add(pamalfalfacrop.get(),
                pamamaranthcrop.get(),
                pamarrowrootcrop.get(),
                pamartichokecrop.get(),
                pamblackberrycrop.get(),
                pambokchoycrop.get(),
                pamcanolacrop.get(),
                pamcloudberrycrop.get(),
                pamcorncrop.get(),
                pamcranberrycrop.get(),
                pameggplantcrop.get(),
                pamelderberrycrop.get(),
                pamgingercrop.get(),
                pamgrapecrop.get(),
                pamgreengrapecrop.get(),
                pamguaranacrop.get(),
                pamhuckleberrycrop.get(),
                pamjicamacrop.get(),
                pamjuniperberrycrop.get(),
                pamkohlrabicrop.get(),
                pamlettucecrop.get(),
                pamlotuscrop.get(),
                pamnopalescrop.get(),
                pamoatscrop.get(),
                pamonioncrop.get(),
                pampeascrop.get(),
                pamquinoacrop.get(),
                pamrutabagacrop.get(),
                pamryecrop.get(),
                pamspinachcrop.get(),
                pamsweetpotatocrop.get(),
                pamtealeafcrop.get(),
                pamtomatillocrop.get(),
                pamwhitemushroomcrop.get(),
                pamwintersquashcrop.get()
        );

        //tag(ModTags.Blocks.WINTER_CROPS).add();
    }
}
