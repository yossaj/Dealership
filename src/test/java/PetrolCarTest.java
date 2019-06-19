import Behaviours.WarrantyDetail;
import Cars.PetrolCar;
import Components.Engine;
import Components.Radio;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
    Radio radio;
    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Firestone", "Rubber");
        radio = new Radio("Hiatchi", "Hitachi Holding Group", WarrantyDetail.GOLD);
        engine = new Engine("Big", "Thirty");
        petrolCar = new PetrolCar(tyres, radio, engine, 4 );
    }

    @Test
    public void canHaveTyres(){
        assertEquals(tyres, petrolCar.getTyres());
    }

    @Test
    public void canHaveRadio(){
        assertEquals(radio, petrolCar.getRadio());
    }

    @Test
    public void canHaveEngine(){
        assertEquals(engine, petrolCar.getEngine());
    }

    @Test
    public void canHaveDoors(){
        assertEquals(4, petrolCar.getDoors());
    }



}
