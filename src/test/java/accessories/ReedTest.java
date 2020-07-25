package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.Reed;

import static org.junit.Assert.assertEquals;

public class ReedTest {
    Reed reed;

    @Before
    public void before(){
        reed = new Reed("Chanter Reed", "Thomann", 1.20, 1.80, "Plastic");
    }

    @Test
    public void hasProductName(){
        assertEquals("Chanter Reed", reed.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Thomann", reed.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(1.20, reed.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(1.80, reed.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(0.60, reed.calculateMarkup(), 0.01);
    }

    @Test
    public void reedHasMeterial(){
        assertEquals("Plastic", reed.getMaterial());
    }


}
