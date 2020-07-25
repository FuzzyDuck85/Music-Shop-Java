package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.Metronome;

import static org.junit.Assert.assertEquals;

public class MetronomeTest {
    Metronome metronome;
    Metronome metronome1;

    @Before
    public void before(){
        metronome = new Metronome("SQ-60 Metronome", "Seiko", 21, 29, true);
        metronome1 = new Metronome("Pyramid Metronome", "Montford", 25, 29, false);

    }

    @Test
    public void hasProductName(){
        assertEquals("SQ-60 Metronome", metronome.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Seiko", metronome.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(21, metronome.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(29, metronome.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(8, metronome.calculateMarkup(), 0.01);
    }

    @Test
    public void isDigital(){
        assertEquals(true, metronome.isDigital());
    }

    @Test
    public void isAnalogue(){
        assertEquals(false, metronome1.isDigital());
    }
}
