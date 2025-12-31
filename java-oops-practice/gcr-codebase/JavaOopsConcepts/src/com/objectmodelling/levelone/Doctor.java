package com.objectmodelling.levelone;

public class Doctor {

    String name;

    public Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println("Dr. " + name + " consulting " + patient.name);
    }
}
