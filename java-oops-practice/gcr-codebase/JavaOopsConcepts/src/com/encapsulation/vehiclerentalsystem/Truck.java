package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    public Truck(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }

    public double calculateInsurance() {
        return 1500;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}
