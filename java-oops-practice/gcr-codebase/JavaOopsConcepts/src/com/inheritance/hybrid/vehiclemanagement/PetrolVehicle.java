package com.inheritance.hybrid.vehiclemanagement;

public class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        displayVehicle();
        System.out.println("Vehicle Type: Petrol");
        System.out.println("Action: Refueling petrol");
    }
}
