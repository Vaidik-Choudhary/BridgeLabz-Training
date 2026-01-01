package com.encapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient {

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 500;
    }
}

