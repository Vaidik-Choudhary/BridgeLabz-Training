package com.encapsulation.hospitalpatientmanagement;

public class HospitalDriver {
    public static void main(String[] args) {

        Patient[] patients = new Patient[2];

        patients[0] = new InPatient(1, "Ravi", 30, 5);
        patients[1] = new OutPatient(2, "Neha", 25);

        for (int i = 0; i < patients.length; i++) {
            patients[i].getPatientDetails();
            System.out.println();
        }
    }
}

