package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.AccessoryTypes;
import products.accessories.DrumSticks;
import products.instruments.InstrumentTypes;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drumsticks", "Zildjian", 5, 9, 50, "Nylon");
    }

    @Test
    public void hasProductName(){
        assertEquals("Drumsticks", drumSticks.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Zildjian", drumSticks.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(5, drumSticks.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(9, drumSticks.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(4, drumSticks.calculateMarkup(), 0.01);
    }

    @Test
    public void hasWeight(){
        assertEquals(50, drumSticks.getWeight());
    }

    @Test
    public void hasTipType(){
        assertEquals("Nylon", drumSticks.getTipType());
    }


}
