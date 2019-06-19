package Peoples;

import Cars.Vehicle;

public class Customer extends Person {

    private double wallet;
    private String preference;

    public Customer(String name, int age, double wallet, String preference){
        super(name, age);
        this.wallet = wallet;
        this.preference = preference;
    }


    public double getWallet() {
        return wallet;
    }

    public String getPreference() {
        return preference;
    }

    public void payForCar(Vehicle vehicle){
        if(this.wallet > vehicle.getPrice()){
            this.wallet -= vehicle.getPrice();
        }
    }
}
