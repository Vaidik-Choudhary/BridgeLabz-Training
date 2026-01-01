package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle {

    public Bike(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
