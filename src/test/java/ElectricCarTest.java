import Behaviours.WarrantyDetail;
import Cars.ElectricCar;
import Cars.PetrolCar;
import Components.Engine;
import Components.Radio;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Radio radio;
    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Firestone", "Rubber");
        radio = new Radio("Hiatchi", "Hitachi Holding Group", WarrantyDetail.GOLD);
        engine = new Engine("Big", "Thirty");
        electricCar = new ElectricCar(tyres, radio, engine, 5, 20000, 2000, "Silver", 210);
    }

    @Test
    public void canGetNumOfDoors(){
        assertEquals(5, electricCar.getDoors());
    }


}
