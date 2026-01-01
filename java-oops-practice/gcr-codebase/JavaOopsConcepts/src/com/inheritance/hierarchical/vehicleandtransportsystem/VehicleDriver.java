package com.inheritance.hierarchical.vehicleandtransportsystem;

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(160, "Petrol", true);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            System.out.println();
        }
    }
}

