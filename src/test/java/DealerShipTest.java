import Behaviours.WarrantyDetail;
import Cars.ElectricCar;
import Cars.PetrolCar;
import Cars.Vehicle;
import Components.Engine;
import Components.Radio;
import Components.Tyres;
import Dealership.Dealership;
import Peoples.Customer;
import Peoples.Dealer;
import Dealership.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class DealerShipTest {

    Dealership dealership;
    ArrayList<Vehicle> stock;
    Dealer dealer;
    Customer customer;
    PetrolCar petrolCar;
    ElectricCar electricCar;
    Till till;
    Tyres tyres;
    Radio radio;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres("Firestone", "Rubber");
        radio = new Radio("Hiatchi", "Hitachi Holding Group", WarrantyDetail.GOLD);
        engine = new Engine("Big", "Thirty");
        petrolCar = new PetrolCar(tyres, radio, engine, 5 ,400, 30000, "Black" );
        tyres = new Tyres("Firestone", "Rubber");
        radio = new Radio("Hiatchi", "Hitachi Holding Group", WarrantyDetail.GOLD);
        engine = new Engine("Big", "Thirty");
        electricCar = new ElectricCar(tyres, radio, engine, 5, 20000, 2000, "Silver", 210);
        stock = new ArrayList<Vehicle>();
        stock.add(petrolCar);
        stock.add(electricCar);
        dealer = new Dealer("Bob", 30, 5, 4);
        customer = new Customer("Fred", 20, 4000, "Black");
        dealership = new Dealership(stock, "Crap Cars", till, dealer, customer);
    }

    @Test
    public void canHaveStockOfCars(){
        assertEquals(2, dealership.getStock());
    }

}
