package com.hospitalpatientmanagementsystem;

public class HospitalMain {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 30,
                "Fracture", 2, 10);

        Patient p2 = new OutPatient(102, "Anita", 25,
                "Fever", "15-01-2026");

        Doctors d1 = new Doctors(1, "Dr. Sharma", "Orthopedic");

        Bill bill = new Bill(10000);

        d1.displayInfo();
        p1.displayInfo();
        p2.displayInfo();

        d1.reviewPatient(p1);

        System.out.println("Final Bill Amount: " +
                bill.calculatePayment());
    }
}
