package instruments;

import org.junit.Before;
import org.junit.Test;
import products.instruments.InstrumentTypes;
import products.instruments.PercussionType;

import static org.junit.Assert.assertEquals;

public class PercussionTypeTest {

    PercussionType percussionType;

    @Before
    public void before(){
        percussionType = new PercussionType("Drum Kit", "Pearl", 2570, 3099, "maple", "blue",  InstrumentTypes.PERCUSSION,true);
    }

    @Test
    public void canHaveProductName(){
        assertEquals("Drum Kit", percussionType.getProductName());
    }

    @Test
    public void canHaveManufacturer()
    {
        assertEquals("Pearl", percussionType.getManufacturer());
    }

    @Test
    public void canHaveRetailerPrice(){
        assertEquals(2570, percussionType.getRetailerPrice(),0.01);
    }

    @Test
    public void canHaveCustomerPrice(){
        assertEquals(3099, percussionType.getCustomerPrice(),0.01);
    }

    @Test
    public void sellingMakesProfit(){
        assertEquals(529, percussionType.calculateMarkup(), 0.01);
    }

    @Test
    public void canHaveMaterial(){
        assertEquals("maple", percussionType.getMaterial());
    }

    @Test
    public void canHaveAColour(){
        assertEquals("blue", percussionType.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentTypes.PERCUSSION, percussionType.getType());
    }

    @Test
    public void canRequireSticks(){
        assertEquals(true, percussionType.isRequiresStick());
    }

    @Test
    public void canPlayANoise(){
        assertEquals("Clash, Boom, Bang, Ting!", percussionType.play());
    }
}
