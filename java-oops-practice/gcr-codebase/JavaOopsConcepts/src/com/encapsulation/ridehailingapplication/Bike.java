package com.encapsulation.ridehailingapplication;

public class Bike extends Vehicle {

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.8;
    }
}

