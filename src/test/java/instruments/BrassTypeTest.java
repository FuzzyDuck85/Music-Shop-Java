package instruments;

import org.junit.Before;
import org.junit.Test;
import products.instruments.BrassType;


import static org.junit.Assert.assertEquals;

public class BrassTypeTest {

    private BrassType brassType;

    @Before
    public void before(){
        brassType = new BrassType("Trombone", "Startone", 100, 115, "brass", "gold", 0);
    }

    @Test
    public void canHaveProductName(){
        assertEquals("Trombone", brassType.getProductName());
    }

    @Test
    public void canHaveManufacturer()
    {
        assertEquals("Startone", brassType.getManufacturer());
    }

    @Test
    public void canHaveRetailerPrice(){
        assertEquals(100, brassType.getRetailerPrice(),0.01);
    }

    @Test
    public void canHaveCustomerPrice(){
        assertEquals(115, brassType.getCustomerPrice(),0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(15, brassType.calculateMarkup(), 0.01);
    }

    @Test
    public void canHaveMaterial(){
        assertEquals("brass", brassType.getMaterial());
    }

    @Test
    public void canHaveAColour(){
        assertEquals("gold", brassType.getColour());
    }

    @Test
    public void hasAnAmountOfValves(){
        assertEquals(0, brassType.getNumberOfValves());
    }

    @Test
    public void canPlayANoise(){
        assertEquals("Purse your lips, blow and manipulate the values to make loud noises!", brassType.play());
    }

}
