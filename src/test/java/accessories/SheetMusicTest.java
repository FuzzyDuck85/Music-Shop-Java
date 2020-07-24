//package accessories;
//
//import org.junit.Before;
//import org.junit.Test;
//import sellableitems.accessories.SheetMusic;
//
//import static org.junit.Assert.assertEquals;
//
//public class SheetMusicTest {
//
//    private SheetMusic sheetMusic;
//
//    @Before
//    public void before(){
//        sheetMusic = new SheetMusic(0.5, 5, "Best of Queen", "piano", 50);
//    }
//
//    @Test
//    public void canGetAllProperties(){
//        assertEquals(0.5, sheetMusic.getPurchasePrice(), 0.01);
//        assertEquals(5, sheetMusic.getSellPrice(), 0.01);
//        assertEquals("Best of Queen", sheetMusic.getDescription());
//        assertEquals("piano", sheetMusic.getInstrument());
//        assertEquals(50, sheetMusic.getNumOfPages());
//    }
//
//    @Test
//    public void canCalculateMarkup(){
//        assertEquals(4.5, sheetMusic.calculateMarkup(), 0.01);
//    }
//}
