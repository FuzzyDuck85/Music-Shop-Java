package instruments;

import org.junit.Before;
import org.junit.Test;
import products.instruments.InstrumentTypes;
import products.instruments.WoodwindType;

import static org.junit.Assert.assertEquals;

public class WoodwindTypeTest {

    private WoodwindType woodwindType;

    @Before
    public void before(){
        woodwindType = new WoodwindType("Bagpipes", "Peter Henderson", 5208, 6435, "blackwood", "black", InstrumentTypes.WOODWIND, 8, true);
    }

    @Test
    public void canHaveProductName(){
        assertEquals("Bagpipes", woodwindType.getProductName());
    }

    @Test
    public void canHaveManufacturer()
    {
        assertEquals("Peter Henderson", woodwindType.getManufacturer());
    }

    @Test
    public void canHaveRetailerPrice(){
        assertEquals(5208, woodwindType.getRetailerPrice(),0.01);
    }

    @Test
    public void canHaveCustomerPrice(){
        assertEquals(6435, woodwindType.getCustomerPrice(),0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(1227, woodwindType.calculateMarkup(), 0.01);
    }

    @Test
    public void canHaveMaterial(){
        assertEquals("blackwood", woodwindType.getMaterial());
    }

    @Test
    public void canHaveAColour(){
        assertEquals("black", woodwindType.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentTypes.WOODWIND, woodwindType.getType());
    }

    @Test
    public void hadNoOfToneholes(){
        assertEquals(8, woodwindType.getNumberOfToneHoles());
    }

    @Test
    public void hasAReed(){
        assertEquals(true, woodwindType.isHasReed());
    }

    @Test
    public void canPlay(){
        assertEquals("Blowing air, splitting it and manipulate use the tone holes to have a hoot!", woodwindType.play());
    }
}
