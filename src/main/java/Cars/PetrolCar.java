package Cars;

import Components.Engine;
import Components.Radio;
import Components.Tyres;

public class PetrolCar extends Vehicle {


    public PetrolCar(Tyres tyres, Radio radio, Engine engine, int doors, double price, double mileage, String colour) {
        super(tyres, radio, engine, doors, price, mileage, colour);
    }
}
