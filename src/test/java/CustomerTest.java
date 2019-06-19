import Peoples.Customer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Dawn", 30, 6000, "red");

    }


    @Test
    public void canGetName(){
        assertEquals("Dawn", customer.getName());
    }

    @Test
    public void canGetPreference(){
        assertEquals("red", customer.getPreference());
    }

    @Test
    public void canGetWalletVal(){
        assertEquals(6000, customer.getWallet(), 00);
    }


}
