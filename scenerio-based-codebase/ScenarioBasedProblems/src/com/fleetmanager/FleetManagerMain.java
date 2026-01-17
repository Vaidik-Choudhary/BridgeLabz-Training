package com.fleetmanager;

import java.util.Arrays;
import java.util.List;

public class FleetManagerMain {

    public static void main(String[] args) {

        FleetManager manager = new FleetManager();

        List<Integer> depotA = Arrays.asList(1200, 2500, 4000, 6000);
        List<Integer> depotB = Arrays.asList(1500, 3000, 4500, 7000);

        List<Integer> masterSchedule =
                manager.mergeSchedules(depotA, depotB);

        System.out.println("=== Master Maintenance Schedule ===");
        for (int mileage : masterSchedule) {
            System.out.println("Mileage: " + mileage);
        }
    }
}

