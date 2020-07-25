package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.Metronome;
import products.accessories.PianoStool;

import static org.junit.Assert.assertEquals;

public class PianoStoolTest {
    PianoStool pianoStool;

    @Before
    public void before(){
        pianoStool = new PianoStool("Deluxe Piano Stool", "Gear4Music", 74.99, 89.99, true, 4, true);

    }

    @Test
    public void hasProductName(){
        assertEquals("Deluxe Piano Stool", pianoStool.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Gear4Music", pianoStool.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(74.99, pianoStool.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(89.99, pianoStool.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(15, pianoStool.calculateMarkup(), 0.01);
    }

    @Test
    public void canYouAdjustStoolHeight(){
        assertEquals(true, pianoStool.isAdjustable());
    }

    @Test
    public void howManyLegs(){
        assertEquals(4, pianoStool.getNoOfLegs());
    }

    @Test
    public void doesStoolHaveStorage(){
        assertEquals(true, pianoStool.isHasStorage());
    }
}
