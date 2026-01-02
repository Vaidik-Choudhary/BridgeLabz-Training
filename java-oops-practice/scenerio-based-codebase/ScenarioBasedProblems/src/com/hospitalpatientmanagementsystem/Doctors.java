package com.hospitalpatientmanagementsystem;

public class Doctors {

    private int doctorId;
    private String name;
    private String specialization;

    public Doctors(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void reviewPatient(Patient patient) {
        System.out.println("Reviewing medical history: "
                + patient.getMedicalHistory());
    }

    public void displayInfo() {
        System.out.println("Doctor ID: " + doctorId +
                ", Name: " + name +
                ", Specialization: " + specialization);
    }
}
