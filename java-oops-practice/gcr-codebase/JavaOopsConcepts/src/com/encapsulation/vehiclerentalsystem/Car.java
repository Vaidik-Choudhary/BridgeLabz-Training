package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    public Car(String number, double rate) {
        super(number, rate);
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}
