
import org.junit.Before;
import org.junit.Test;
import products.accessories.*;
import products.instruments.*;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private MusicShop musicShop;
    private BrassType trombone;
    private KeyboardType keyboard;
    private PercussionType drums;
    private StringsType viola;
    private WoodwindType bagpipes;
    private CleaningProduct brasso;
    private GuitarPick guitarPick;
    private DrumSticks drumSticks;
    private GuitarPick pick;
    private Metronome metronome;
    private PianoStool pianoStool;
    private Reed reed;
    private SheetMusic sheetMusic;
    private StringBow stringBow;


    @Before
    public void before(){
        musicShop = new MusicShop("Noteworthy", 2467);
        trombone = new BrassType("Trombone", "Startone", 100, 115, "brass", "gold", InstrumentTypes.BRASS, 0);
        keyboard = new KeyboardType("Electronic Keyboard", "Yamaha", 200, 250, "plastic", "black", InstrumentTypes.KEYBOARD, 88);
        drums = new PercussionType("Drum Kit", "Pearl", 2570, 3099, "maple", "blue",  InstrumentTypes.PERCUSSION,true);
        viola = new StringsType("Viola", "Klaus Heffler", 4000, 4369, "maple", "maroon", InstrumentTypes.STRING, 4);
        bagpipes = new WoodwindType("Bagpipes", "Peter Henderson", 5208, 6435, "blackwood", "black", InstrumentTypes.WOODWIND, 8, true);
        brasso = new CleaningProduct("Metal Polish", "Brasso", 4, 4.35, 75);
        drumSticks = new DrumSticks("Drumsticks", "Zildjian", 5, 9, 50, "Nylon");
        pick = new GuitarPick("Guitar Picks", "Gibson", 2.72, 3.49, 12, "Thin");
        metronome = new Metronome("SQ-60 Metronome", "Seiko", 21, 29, true);
        pianoStool = new PianoStool("Deluxe Piano Stool", "Gear4Music", 74.99, 89.99, true, 4, true);
        reed = new Reed("Chanter Reed", "Thomann", 1.20, 1.80, "Plastic");
        sheetMusic = new SheetMusic("All Brass Solo Album", "Fentone Music", 4.55, 9.78, "John Frith","Classical", 8);
        stringBow = new StringBow("Bow Cello", "Egidius Dörfler", 1750, 2180, "4/4","Ebony", true);

    }

    @Test
    public void canGetShopName(){
        assertEquals("Noteworthy", musicShop.getName());
    }

    @Test
    public void shopStockBeginsEmpty(){
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canAddProductsToStock(){
        musicShop.addProductToStock(bagpipes);
        musicShop.addProductToStock(keyboard);
        musicShop.addProductToStock(reed);
        musicShop.addProductToStock(pianoStool);
        assertEquals(4, musicShop.getStock().size());
    }

    @Test
    public void canRemoveProductsFromStock(){
        musicShop.addProductToStock(bagpipes);
        musicShop.addProductToStock(keyboard);
        musicShop.addProductToStock(reed);
        musicShop.addProductToStock(pianoStool);
        musicShop.removeProductFromStock(reed);
        assertEquals(3, musicShop.getStock().size());
    }

    @Test
    public void canCalculateTotalProfit(){
        musicShop.addProductToStock(trombone);
        musicShop.addProductToStock(keyboard);
        musicShop.addProductToStock(drums);
        musicShop.addProductToStock(viola);
        musicShop.addProductToStock(bagpipes);
        musicShop.addProductToStock(brasso);
        musicShop.addProductToStock(drumSticks);
        musicShop.addProductToStock(pick);
        musicShop.addProductToStock(metronome);
        musicShop.addProductToStock(pianoStool);
        musicShop.addProductToStock(reed);
        musicShop.addProductToStock(sheetMusic);
        musicShop.addProductToStock(stringBow);

        assertEquals(2653.95, musicShop.calculateTotalProfits(), 0.01);
    }
}
