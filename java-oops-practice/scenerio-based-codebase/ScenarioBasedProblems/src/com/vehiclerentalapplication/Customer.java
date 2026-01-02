package com.vehiclerentalapplication;

public class Customer {

    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Rentable vehicle, int days) {
        System.out.println("Total Rent for " + days +
                " days: " + vehicle.calculateRent(days));
    }
}

