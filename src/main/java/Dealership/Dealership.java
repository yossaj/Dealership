package Dealership;


import Cars.Vehicle;
import Peoples.Customer;
import Peoples.Dealer;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private String name;
    private Till till;
    private Dealer dealer;
    private Customer customer;

    public Dealership(ArrayList<Vehicle> stock, String name, Till till, Dealer dealer, Customer customer){
        this.stock = stock;
        this.name = name;
        this.till = till;
        this.dealer = dealer;
        this.customer = customer;
    }

    public ArrayList<Vehicle> Stock() {
        return stock;
    }

    public int getStock(){
        return stock.size();
    }

    public String getName() {
        return name;
    }

    public Till getTill() {
        return till;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle sellVehicle(Customer customer){
        Vehicle vehicle = stock.get(0);
        customer.payForCar(vehicle);
    }
}
