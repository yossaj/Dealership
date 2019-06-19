package Cars;

import Components.Engine;
import Components.Radio;
import Components.Tyres;

public class ElectricCar extends PetrolCar {

    private double distancePerCharge;

    public ElectricCar(Tyres tyres, Radio radio, Engine engine, int doors, double price, double mileage, String colour, double distancePerCharge) {
        super(tyres, radio, engine, doors, price, mileage, colour);
        this.distancePerCharge = distancePerCharge;
    }
}
