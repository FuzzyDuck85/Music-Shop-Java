//package instruments;
//
//import org.junit.Before;
//import org.junit.Test;
//import sellableitems.instruments.InstrumentVariations;
//import sellableitems.instruments.Trumpet;
//
//import static org.junit.Assert.assertEquals;
//
//public class WoodwindTypeTest {
//
//    private Trumpet trumpet;
//
//    @Before
//    public void before(){
//        trumpet = new Trumpet(150, 200, "Yamaha", "brass", "gold", InstrumentVariations.ACOUSTIC, 3);
//    }
//
//    @Test
//    public void canGetAllProperties(){
//        assertEquals(150, trumpet.getPurchasePrice(), 0.01);
//        assertEquals(200, trumpet.getSellPrice(), 0.01);
//        assertEquals("Yamaha", trumpet.getDescription());
//        assertEquals("brass", trumpet.getMaterial());
//        assertEquals("gold", trumpet.getColour());
//        assertEquals(InstrumentVariations.ACOUSTIC, trumpet.getVariation());
//        assertEquals(3, trumpet.getNumOfValves());
//    }
//
//    @Test
//    public void canGetMarkupPrice(){
//        assertEquals(50, trumpet.calculateMarkup(), 0.01);
//    }
//
//    @Test
//    public void canPlay(){
//        assertEquals("hark hark", trumpet.play());
//    }
//}
