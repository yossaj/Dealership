import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TyreTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("5000", "Michelin");
    }

    @Test
    public void canHaveModel(){
        assertEquals("5000", tyres.getModel());
    }

    @Test
    public void canHaveBrand(){
        assertEquals("Michelin", tyres.getBrand());
    }

}
