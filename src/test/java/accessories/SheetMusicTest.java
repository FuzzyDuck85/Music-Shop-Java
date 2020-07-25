package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("All Brass Solo Album", "Fentone Music", 4.55, 9.78, "John Frith","Classical", 8);
    }

    @Test
    public void hasProductName(){
        assertEquals("All Brass Solo Album", sheetMusic.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Fentone Music", sheetMusic.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(4.55, sheetMusic.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(9.78, sheetMusic.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(5.23, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void sheetMusicHasAuthor(){
        assertEquals("John Frith", sheetMusic.getAuthor());
    }

    @Test
    public void sheetMusicHasGenre(){
        assertEquals("Classical", sheetMusic.getGenre());
    }

    @Test
    public void sheetMusicHasPages(){
        assertEquals(8, sheetMusic.getNumOfPages());
    }
}
