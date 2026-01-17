package com.artexpo;

import java.util.ArrayList;
import java.util.List;

public class RegistrationBoard {

    private List<Integer> registrationTimes;

    public RegistrationBoard() {
        registrationTimes = new ArrayList<>();
    }

    public void addRegistrationTime(int time) {

        int i = registrationTimes.size() - 1;
        registrationTimes.add(0);

        while (i >= 0 && registrationTimes.get(i) > time) {
            registrationTimes.set(i + 1, registrationTimes.get(i));
            i--;
        }

        registrationTimes.set(i + 1, time);
    }

    public void displayBoard() {
        for (int time : registrationTimes) {
            System.out.println("Registration Time: " + time);
        }
    }
}

