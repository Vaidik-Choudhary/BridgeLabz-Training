package com.fleetmanager;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {

    public List<Integer> mergeSchedules(List<Integer> depotA, List<Integer> depotB) {

        List<Integer> masterSchedule = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < depotA.size() && j < depotB.size()) {
            if (depotA.get(i) <= depotB.get(j)) {
                masterSchedule.add(depotA.get(i));
                i++;
            } else {
                masterSchedule.add(depotB.get(j));
                j++;
            }
        }

        while (i < depotA.size()) {
            masterSchedule.add(depotA.get(i));
            i++;
        }

        while (j < depotB.size()) {
            masterSchedule.add(depotB.get(j));
            j++;
        }

        return masterSchedule;
    }
}

