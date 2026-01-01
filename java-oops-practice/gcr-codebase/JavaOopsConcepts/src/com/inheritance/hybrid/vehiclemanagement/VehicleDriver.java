package com.inheritance.hybrid.vehiclemanagement;

public class VehicleDriver {
    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 200);

        Refuelable pv =
                new PetrolVehicle("Honda City", 180);

        ev.charge();
        System.out.println();
        pv.refuel();
    }
}

