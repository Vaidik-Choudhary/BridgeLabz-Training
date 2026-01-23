package com.hospitalqueuemanagement;

public class HospitalQueueManagementMain {

	public static void main(String[] args) {

        HospitalQueue hospital = new HospitalQueue();

        hospital.root = hospital.registerPatient(hospital.root, 900, "Ravi");
        hospital.root = hospital.registerPatient(hospital.root, 830, "Raghav");
        hospital.root = hospital.registerPatient(hospital.root, 1000, "Saurav");
        hospital.root = hospital.registerPatient(hospital.root, 915, "Shivam");
        hospital.root = hospital.registerPatient(hospital.root, 1100, "Ashish");

        System.out.println("Patient Queue (Sorted by Check-In Time):");
        hospital.displayQueue(hospital.root);

        hospital.root = hospital.dischargePatient(hospital.root, 900);

        System.out.println("\nAfter Discharging Patient at 900:");
        hospital.displayQueue(hospital.root);
    }
}

