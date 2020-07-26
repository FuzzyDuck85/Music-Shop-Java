package instruments;

import org.junit.Before;
import org.junit.Test;
import products.instruments.InstrumentTypes;
import products.instruments.StringsType;

import static org.junit.Assert.assertEquals;

public class StringsTypeTest {

    StringsType stringsType;

    @Before
    public void before(){
        stringsType = new StringsType("Viola", "Klaus Heffler", 4000, 4369, "maple", "maroon", InstrumentTypes.STRING, 4);
    }

    @Test
    public void canHaveProductName(){
        assertEquals("Viola", stringsType.getProductName());
    }

    @Test
    public void canHaveManufacturer()
    {
        assertEquals("Klaus Heffler", stringsType.getManufacturer());
    }

    @Test
    public void canHaveRetailerPrice(){
        assertEquals(4000, stringsType.getRetailerPrice(),0.01);
    }

    @Test
    public void canHaveCustomerPrice(){
        assertEquals(4369, stringsType.getCustomerPrice(),0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(369, stringsType.calculateMarkup(), 0.01);
    }

    @Test
    public void canHaveMaterial(){
        assertEquals("maple", stringsType.getMaterial());
    }

    @Test
    public void canHaveAColour(){
        assertEquals("maroon", stringsType.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentTypes.STRING, stringsType.getType());
    }

    @Test
    public void hadNoOfStrings(){
        assertEquals(4, stringsType.getNumberOfStrings());
    }
    @Test
    public void canPlayANoise(){
        assertEquals("Pluck and squeeze my strings to make sweet music!", stringsType.play());
    }
}
