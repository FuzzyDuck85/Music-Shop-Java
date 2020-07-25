package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.CleaningProduct;

import static org.junit.Assert.assertEquals;

public class CleaningProductTest {
    CleaningProduct brasso;

    @Before
    public void before(){
        brasso = new CleaningProduct("Metal Polish", "Brasso", 4, 4.35, 75);
    }

    @Test
    public void hasProductName(){
        assertEquals("Metal Polish", brasso.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Brasso", brasso.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(4, brasso.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(4.35, brasso.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(0.35, brasso.calculateMarkup(), 0.01);
    }

    @Test
    public void hasWeight(){
        assertEquals(75, brasso.getVolume());
    }
}
