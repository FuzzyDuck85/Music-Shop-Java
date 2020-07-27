import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Before;
import org.junit.Test;
import products.accessories.StringBow;
import products.instruments.StringsType;
import products.instruments.InstrumentTypes;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    StringsType viola;
    StringBow bow;

    @Before
    public void before(){
        bow = new StringBow("Bow Cello", "Egidius Dörfler", 1750, 2180, "4/4","Ebony", true);
        viola = new StringsType("Viola", "Klaus Heffler", 4000, 4369, "maple", "maroon", InstrumentTypes.STRING, 4);
        customer = new Customer("Donald", 40000.00);
    }
    @Test
    public void canGetCustomerName(){
        assertEquals("Donald", customer.getName());
    }

    @Test
    public void canGetCustomerMoney(){
        assertEquals(40000.00, customer.getMoney(), 0.01);
    }

    @Test
    public void canGetProductCount(){
        assertEquals(0, customer.getProductCount());
    }

    @Test
    public void canAddCar(){
        customer.addProduct(viola);
        customer.addProduct(bow);
        assertEquals(2, customer.getProductCount());
    }

    @Test
    public void canBuyProducts(){
        customer.buyProduct(bow);
        customer.buyProduct(viola);
        assertEquals(2, customer.getProductCount());
        assertEquals(33451.00, customer.getMoney(), 0.01);
    }
}
