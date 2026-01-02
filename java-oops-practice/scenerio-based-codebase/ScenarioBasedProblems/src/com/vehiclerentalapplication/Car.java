package com.vehiclerentalapplication;

public class Car extends Vehicle implements Rentable {

    private double acCharge = 500;

    public Car(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + acCharge;
    }
}
