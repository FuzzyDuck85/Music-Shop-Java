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
}
