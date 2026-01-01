package com.encapsulation.vehiclerentalsystem;

public abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}
