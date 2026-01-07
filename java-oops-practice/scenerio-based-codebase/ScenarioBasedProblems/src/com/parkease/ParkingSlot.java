package com.parkease;

import java.util.ArrayList;

public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    private ArrayList<String> bookingLogs = new ArrayList<>();

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean assignSlot(Vehicle vehicle) {

        if (!isOccupied &&
            vehicle.getClass().getSimpleName()
                    .equals(vehicleTypeAllowed)) {

            isOccupied = true;
            bookingLogs.add("Slot " + slotId +
                    " booked for " + vehicleTypeAllowed);
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLogs.add("Slot " + slotId + " released");
    }

    public void showLogs() {
        System.out.println("\nBooking Logs:");
        for (String log : bookingLogs) {
            System.out.println(log);
        }
    }
}

