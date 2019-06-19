package Cars;

import Components.Engine;
import Components.Radio;
import Components.Tyres;

public abstract class Vehicle {

    private Tyres tyres;
    private Radio radio;
    private Engine engine;
    private int doors;

    public Vehicle(Tyres tyres, Radio radio, Engine engine, int doors){
        this.tyres = tyres;
        this.radio = radio;
        this.engine = engine;
        this.doors = doors;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Radio getRadio() {
        return radio;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }
}
