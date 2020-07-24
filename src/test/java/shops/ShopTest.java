//package shops;
//
//import org.junit.Before;
//import org.junit.Test;
//import sellableitems.accessories.DrumSticks;
//import sellableitems.accessories.GuitarPick;
//import sellableitems.instruments.Guitar;
//import sellableitems.instruments.InstrumentVariations;
//import sellableitems.instruments.Piano;
//
//import static org.junit.Assert.assertEquals;
//
//public class ShopTest {
//
//    private Shop shop;
//    private Guitar guitar;
//    private Piano piano;
//    private DrumSticks drumSticks;
//    private GuitarPick guitarPick;
//
//    @Before
//    public void before(){
//        shop = new Shop("Musicool");
//        guitar = new Guitar(50, 100, "Fender", "wood", "brown", InstrumentVariations.ACOUSTIC, 6);
//        piano = new Piano(800, 1000, "Roland", "wood", "black", InstrumentVariations.ELECTRIC, 5);
//        drumSticks = new DrumSticks(3, 10, "Vic Firth", "2B", "wood");
//        guitarPick = new GuitarPick(0.1, 1, "Gibson", 0.6);
//    }
//
//    @Test
//    public void canGetShopName(){
//        assertEquals("Musicool", shop.getName());
//    }
//
//    @Test
//    public void shopStockBeginsEmpty(){
//        assertEquals(0, shop.getStock().size());
//    }
//
//    @Test
//    public void canAddInstrumentsAndAccessoriesToStock(){
//        shop.addStock(guitar);
//        shop.addStock(drumSticks);
//        assertEquals(2, shop.getStock().size());
//    }
//
//    @Test
//    public void canRemoveItemsFromStock(){
//        shop.addStock(guitar);
//        shop.addStock(piano);
//        shop.addStock(drumSticks);
//        shop.addStock(guitarPick);
//        shop.removeStock(piano);
//        shop.removeStock(drumSticks);
//        assertEquals(2, shop.getStock().size());
//    }
//
//    @Test
//    public void canCalculateTotalPotentialProfit(){
//        shop.addStock(guitar);
//        shop.addStock(piano);
//        shop.addStock(drumSticks);
//        shop.addStock(guitarPick);
//        assertEquals(257.9, shop.calculateProfit(), 0.01);
//    }
//}
