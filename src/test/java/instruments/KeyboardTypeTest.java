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


}
