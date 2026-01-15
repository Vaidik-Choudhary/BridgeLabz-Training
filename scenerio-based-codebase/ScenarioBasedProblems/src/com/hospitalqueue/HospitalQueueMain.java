package com.hospitalqueue;

public class HospitalQueueMain {

    public static void sortPatients(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (patients[j].getCriticality() < patients[j + 1].getCriticality()) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    public static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.getName() + " - Criticality: " + p.getCriticality());
        }
    }

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Amit", 3),
            new Patient("Riya", 8),
            new Patient("Karan", 5),
            new Patient("Neha", 9),
            new Patient("Suresh", 2)
        };

        System.out.println("Before Sorting:");
        display(patients);

        sortPatients(patients);

        System.out.println("\nAfter Sorting (High Criticality First):");
        display(patients);
    }
}