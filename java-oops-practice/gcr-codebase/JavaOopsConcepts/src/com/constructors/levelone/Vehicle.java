package com.constructors.levelone;

public class Vehicle {

    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println(ownerName);
        System.out.println(vehicleType);
        System.out.println(registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Samuel", "Bike");
        Vehicle v2 = new Vehicle("jacy", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
    }
}


