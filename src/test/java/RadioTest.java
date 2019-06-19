import Behaviours.WarrantyDetail;
import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Z11", "Bose", WarrantyDetail.GOLD);
    }

    @Test
    public void canHaveModel(){
        assertEquals("Z11", radio.getModel());
    }

    @Test
    public void canHaveBrand(){
        assertEquals("Bose", radio.getBrand());
    }

    @Test
    public void canHaveAWarranty(){
        assertEquals(WarrantyDetail.GOLD, radio.getWarrantyDetail());
    }

    @Test
    public void canHaveAWarrantyValue(){
        assertEquals(4, radio.getWarrantyDetail().getValue());
    }
}
