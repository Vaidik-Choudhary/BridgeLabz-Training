package com.parkease;

public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot slot1 =
                new ParkingSlot("A1", "Car");

        Vehicle vehicle = new Car("MP09AB1234");

        if (slot1.assignSlot(vehicle)) {

            int hours = 6;
            double charges =
                    vehicle.calculateCharges(hours);

            System.out.println("Parking successful");
            System.out.println("Charges for " +
                    hours + " hours: " + charges);

            slot1.releaseSlot();
        } else {
            System.out.println("Slot not available");
        }

        slot1.showLogs();
    }
}

