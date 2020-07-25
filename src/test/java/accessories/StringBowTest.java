package accessories;

import org.junit.Before;
import org.junit.Test;
import products.accessories.SheetMusic;
import products.accessories.StringBow;

import static org.junit.Assert.assertEquals;

public class StringBowTest {

    StringBow stringBow;

    @Before
    public void before(){
        stringBow = new StringBow("Bow Cello", "Egidius Dörfler", 1750, 2180, "4/4","Ebony", true);
    }

    @Test
    public void hasProductName(){
        assertEquals("Bow Cello", stringBow.getProductName());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Egidius Dörfler", stringBow.getManufacturer());
    }

    @Test
    public void hasRetailerPrice(){
        assertEquals(1750, stringBow.getRetailerPrice(), 0.01);
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(2180, stringBow.getCustomerPrice(), 0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(430, stringBow.calculateMarkup(), 0.01);
    }

    @Test
    public void hasFrogMaterial(){
        assertEquals("Ebony", stringBow.getFrogMaterial());
    }

    @Test
    public void hasNaturalHairString(){
        assertEquals(true, stringBow.isNaturalHair());
    }

    @Test
    public void hasASize(){
        assertEquals("4/4", stringBow.getSize());
    }



}
