package com.encapsulation.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {
    private int days;

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.days = days;
    }

    public double calculateBill() {
        return days * 2000;
    }

    public void addRecord(String record) {
        System.out.println("Record added: " + record);
    }

    public void viewRecords() {
        System.out.println("Viewing inpatient records");
    }
}

