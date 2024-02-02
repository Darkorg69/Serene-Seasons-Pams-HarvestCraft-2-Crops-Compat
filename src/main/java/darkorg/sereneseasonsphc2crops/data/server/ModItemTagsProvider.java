package darkorg.sereneseasonsphc2crops.data.server;

import darkorg.sereneseasonsphc2crops.SereneSeasonsPHC2Crops;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import sereneseasons.init.ModTags;

import static com.pam.pamhc2crops.setup.ItemRegistration.*;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator pDataGenerator, BlockTagsProvider pBlockTagsProvider, ExistingFileHelper pExistingFileHelper) {
        super(pDataGenerator, pBlockTagsProvider, SereneSeasonsPHC2Crops.MOD_ID, pExistingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Items.SPRING_CROPS).add(
                aloeitem.get(),
                aloeseeditem.get(),
                asparagusitem.get(),
                asparagusseeditem.get(),
                barleyitem.get(),
                barleyseeditem.get(),
                barrelcactusitem.get(),
                barrelcactusseeditem.get(),
                beanitem.get(),
                beanseeditem.get(),
                broccoliitem.get(),
                broccoliseeditem.get(),
                brusselsproutitem.get(),
                brusselsproutseeditem.get(),
                cabbageitem.get(),
                cabbageseeditem.get(),
                calabashitem.get(),
                calabashseeditem.get(),
                canolaitem.get(),
                canolaseeditem.get(),
                caulifloweritem.get(),
                cauliflowerseeditem.get(),
                celeryitem.get(),
                celeryseeditem.get(),
                chiaitem.get(),
                chiaseeditem.get(),
                chickpeaitem.get(),
                chickpeaseeditem.get(),
                coffeebeanitem.get(),
                coffeebeanseeditem.get(),
                flaxitem.get(),
                flaxseeditem.get(),
                garlicitem.get(),
                garlicseeditem.get(),
                jicamaitem.get(),
                jicamaseeditem.get(),
                kaleitem.get(),
                kaleseeditem.get(),
                kohlrabiitem.get(),
                kohlrabiseeditem.get(),
                leekitem.get(),
                leekseeditem.get(),
                lentilitem.get(),
                lentilseeditem.get(),
                lettuceitem.get(),
                lettuceseeditem.get(),
                nettlesitem.get(),
                nettlesseeditem.get(),
                oatsitem.get(),
                oatsseeditem.get(),
                onionitem.get(),
                onionseeditem.get(),
                papyrusitem.get(),
                papyrusseeditem.get(),
                parsnipitem.get(),
                parsnipseeditem.get(),
                peasitem.get(),
                peasseeditem.get(),
                quinoaitem.get(),
                quinoaseeditem.get(),
                rhubarbitem.get(),
                rhubarbseeditem.get(),
                scallionitem.get(),
                scallionseeditem.get(),
                sorghumitem.get(),
                sorghumseeditem.get(),
                spinachitem.get(),
                spinachseeditem.get(),
                strawberryitem.get(),
                strawberryseeditem.get(),
                sweetpotatoitem.get(),
                sweetpotatoseeditem.get(),
                tealeafitem.get(),
                tealeafseeditem.get(),
                truffleitem.get(),
                truffleseeditem.get(),
                turnipitem.get(),
                turnipseeditem.get(),
                yuccaitem.get(),
                yuccaseeditem.get(),
                zucchiniitem.get(),
                zucchiniseeditem.get()
        );

        tag(ModTags.Items.AUTUMN_CROPS).add(
                alfalfaitem.get(),
                alfalfaseeditem.get(),
                amaranthitem.get(),
                amaranthseeditem.get(),
                arrowrootitem.get(),
                arrowrootseeditem.get(),
                artichokeitem.get(),
                artichokeseeditem.get(),
                blackberryitem.get(),
                blackberryseeditem.get(),
                bokchoyitem.get(),
                bokchoyseeditem.get(),
                canolaitem.get(),
                canolaseeditem.get(),
                cloudberryitem.get(),
                cloudberryseeditem.get(),
                cornitem.get(),
                cornseeditem.get(),
                cranberryitem.get(),
                cranberryseeditem.get(),
                eggplantitem.get(),
                eggplantseeditem.get(),
                elderberryitem.get(),
                elderberryseeditem.get(),
                gingeritem.get(),
                gingerseeditem.get(),
                grapeitem.get(),
                grapeseeditem.get(),
                greengrapeitem.get(),
                greengrapeseeditem.get(),
                guaranaitem.get(),
                guaranaseeditem.get(),
                huckleberryitem.get(),
                huckleberryseeditem.get(),
                jicamaitem.get(),
                jicamaseeditem.get(),
                juniperberryitem.get(),
                juniperberryseeditem.get(),
                kohlrabiitem.get(),
                kohlrabiseeditem.get(),
                lettuceitem.get(),
                lettuceseeditem.get(),
                lotusitem.get(),
                lotusseeditem.get(),
                nopalesitem.get(),
                nopalesseeditem.get(),
                oatsitem.get(),
                oatsseeditem.get(),
                onionitem.get(),
                onionseeditem.get(),
                peasitem.get(),
                peasseeditem.get(),
                quinoaitem.get(),
                quinoaseeditem.get(),
                rutabagaitem.get(),
                rutabagaseeditem.get(),
                ryeitem.get(),
                ryeseeditem.get(),
                spinachitem.get(),
                spinachseeditem.get(),
                sweetpotatoitem.get(),
                sweetpotatoseeditem.get(),
                tealeafitem.get(),
                tealeafseeditem.get(),
                tomatilloitem.get(),
                tomatilloseeditem.get(),
                whitemushroomitem.get(),
                whitemushroomseeditem.get(),
                wintersquashitem.get(),
                wintersquashseeditem.get()
        );

        tag(ModTags.Items.SUMMER_CROPS).add(
                agaveitem.get(),
                agaveseeditem.get(),
                alfalfaitem.get(),
                alfalfaseeditem.get(),
                amaranthitem.get(),
                amaranthseeditem.get(),
                barleyitem.get(),
                barleyseeditem.get(),
                barrelcactusitem.get(),
                barrelcactusseeditem.get(),
                beanitem.get(),
                beanseeditem.get(),
                bellpepperitem.get(),
                bellpepperseeditem.get(),
                blueberryitem.get(),
                blueberryseeditem.get(),
                bokchoyitem.get(),
                bokchoyseeditem.get(),
                cactusfruititem.get(),
                cactusfruitseeditem.get(),
                calabashitem.get(),
                calabashseeditem.get(),
                candleberryitem.get(),
                candleberryseeditem.get(),
                cantaloupeitem.get(),
                cantaloupeseeditem.get(),
                cassavaitem.get(),
                cassavaseeditem.get(),
                cattailitem.get(),
                cattailseeditem.get(),
                chiaitem.get(),
                chiaseeditem.get(),
                chilipepperitem.get(),
                chilipepperseeditem.get(),
                cloudberryitem.get(),
                cloudberryseeditem.get(),
                coffeebeanitem.get(),
                coffeebeanseeditem.get(),
                cornitem.get(),
                cornseeditem.get(),
                cottonitem.get(),
                cottonseeditem.get(),
                cucumberitem.get(),
                cucumberseeditem.get(),
                gingeritem.get(),
                gingerseeditem.get(),
                grapeitem.get(),
                grapeseeditem.get(),
                greengrapeitem.get(),
                greengrapeseeditem.get(),
                juteitem.get(),
                juteseeditem.get(),
                kenafitem.get(),
                kenafseeditem.get(),
                kiwiitem.get(),
                kiwiseeditem.get(),
                kohlrabiitem.get(),
                kohlrabiseeditem.get(),
                lotusitem.get(),
                lotusseeditem.get(),
                milletitem.get(),
                milletseeditem.get(),
                mulberryitem.get(),
                mulberryseeditem.get(),
                mustardseedsitem.get(),
                mustardseedsseeditem.get(),
                nopalesitem.get(),
                nopalesseeditem.get(),
                okraitem.get(),
                okraseeditem.get(),
                onionitem.get(),
                onionseeditem.get(),
                papyrusitem.get(),
                papyrusseeditem.get(),
                peanutitem.get(),
                peanutseeditem.get(),
                peasitem.get(),
                peasseeditem.get(),
                pineappleitem.get(),
                pineappleseeditem.get(),
                radishitem.get(),
                radishseeditem.get(),
                raspberryitem.get(),
                raspberryseeditem.get(),
                riceitem.get(),
                riceseeditem.get(),
                sesameseedsitem.get(),
                sesameseedsseeditem.get(),
                sisalitem.get(),
                sisalseeditem.get(),
                soybeanitem.get(),
                soybeanseeditem.get(),
                spiceleafitem.get(),
                spiceleafseeditem.get(),
                sweetpotatoitem.get(),
                sweetpotatoseeditem.get(),
                taroitem.get(),
                taroseeditem.get(),
                tealeafitem.get(),
                tealeafseeditem.get(),
                tomatilloitem.get(),
                tomatilloseeditem.get(),
                tomatoitem.get(),
                tomatoseeditem.get(),
                truffleitem.get(),
                truffleseeditem.get(),
                waterchestnutitem.get(),
                waterchestnutseeditem.get(),
                wolfberryitem.get(),
                wolfberryseeditem.get(),
                yuccaitem.get(),
                yuccaseeditem.get()
        );
    }
}