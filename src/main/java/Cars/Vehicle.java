package Cars;

import Components.Engine;
import Components.Radio;
import Components.Tyres;

public abstract class Vehicle {

    private Tyres tyres;
    private Radio radio;
    private Engine engine;
    private int doors;
    private double price;
    private double mileage;
    private String colour;

    public Vehicle(Tyres tyres, Radio radio, Engine engine, int doors,double price, double mileage, String colour){
        this.tyres = tyres;
        this.radio = radio;
        this.engine = engine;
        this.doors = doors;
        this.price = price;
        this.mileage = mileage;
        this.colour = colour;
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

    public double getPrice() {
        return price;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColour() {
        return colour;
    }
}
