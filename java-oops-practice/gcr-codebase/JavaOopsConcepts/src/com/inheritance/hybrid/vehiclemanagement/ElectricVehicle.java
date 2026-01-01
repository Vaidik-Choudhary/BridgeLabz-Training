package com.inheritance.hybrid.vehiclemanagement;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        displayVehicle();
        System.out.println("Vehicle Type: Electric");
        System.out.println("Action: Charging battery");
    }
}

