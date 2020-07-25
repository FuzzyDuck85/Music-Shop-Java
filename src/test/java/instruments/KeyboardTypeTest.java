package instruments;


import org.junit.Before;
import org.junit.Test;
import products.instruments.InstrumentTypes;
import products.instruments.KeyboardType;

import static org.junit.Assert.assertEquals;

public class KeyboardTypeTest {

    private KeyboardType keyboardType;

    @Before
    public void before(){
        keyboardType = new KeyboardType("Electronic Keyboard", "Yamaha", 200, 250, "plastic", "black", 88);
    }

    @Test
    public void canHaveProductName(){
        assertEquals("Electronic Keyboard", keyboardType.getProductName());
    }

    @Test
    public void canHaveManufacturer()
    {
        assertEquals("Yamaha", keyboardType.getManufacturer());
    }

    @Test
    public void canHaveRetailerPrice(){
        assertEquals(200, keyboardType.getRetailerPrice(),0.01);
    }

    @Test
    public void canHaveCustomerPrice(){
        assertEquals(250, keyboardType.getCustomerPrice(),0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(50, keyboardType.calculateMarkup(), 0.01);
    }

    @Test
    public void canHaveMaterial(){
        assertEquals("plastic", keyboardType.getMaterial());
    }

    @Test
    public void canHaveAColour(){
     assertEquals("black", keyboardType.getColour());
    }

    @Test
    public void canHaveNumberOfKeys(){
        assertEquals(88, keyboardType.getNumberOfKeys());
    }


}
