package com.encapsulation.ridehailingapplication;

public class Car extends Vehicle implements GPS {

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    public String getCurrentLocation() {
        return "City Center";
    }

    public void updateLocation(String location) {
        System.out.println("Car location updated");
    }
}
