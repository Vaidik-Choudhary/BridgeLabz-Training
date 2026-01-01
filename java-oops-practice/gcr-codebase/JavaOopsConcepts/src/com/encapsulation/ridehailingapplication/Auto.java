package com.encapsulation.ridehailingapplication;

public class Auto extends Vehicle {

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9;
    }
}
