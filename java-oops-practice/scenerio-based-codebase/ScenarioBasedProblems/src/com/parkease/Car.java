package com.parkease;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 50;
        double penalty = (hours > 5) ? 100 : 0;

        return (baseRate * hours) + penalty;
    }
}
