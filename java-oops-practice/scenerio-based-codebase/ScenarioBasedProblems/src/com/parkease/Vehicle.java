package com.parkease;

public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
