import org.junit.Before;
import org.junit.Test;
import products.accessories.DrumSticks;
import products.accessories.GuitarPick;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest{

    GuitarPick guitarPick;

    @Before
    public void before(){
        guitarPick = new GuitarPick("Guitar Picks", "Gibson", 2.72, 3.49, 12, "Thin");
    }

    @Test
    public void hasProductName(){
        assertEquals("Guitar Picks", guitarPick.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Gibson", guitarPick.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(2.72, guitarPick.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(3.49, guitarPick.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(0.77, guitarPick.calculateMarkup(), 0.01);
    }

    @Test
    public void hasThickness(){
        assertEquals("Thin", guitarPick.getThickness());
    }
}