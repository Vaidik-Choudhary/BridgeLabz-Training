package com.hospitalpatientmanagementsystem;

public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;

    // Normal admission
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Emergency admission
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.age = 0;
        this.medicalHistory = "Emergency Case";
    }

    // Public summary
    public String getSummary() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age;
    }

    // Protected access
    protected String getMedicalHistory() {
        return medicalHistory;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}
