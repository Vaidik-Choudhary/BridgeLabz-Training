package com.encapsulation.vehiclerentalsystem;

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("CAR101", 1000);
        vehicles[1] = new Bike("BIKE201", 500);
        vehicles[2] = new Truck("TRK301", 2000);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Rental Cost: " +
                vehicles[i].calculateRentalCost(3));

            if (vehicles[i] instanceof Insurable) {
                System.out.println("Insurance: " +
                    ((Insurable) vehicles[i]).calculateInsurance());
            }
            System.out.println();
        }
    }
}
