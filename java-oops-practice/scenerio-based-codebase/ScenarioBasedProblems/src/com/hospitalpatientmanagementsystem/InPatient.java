package com.hospitalpatientmanagementsystem;

public class InPatient extends Patient {

    private int wardNo;
    private int bedNo;

    public InPatient(int patientId, String name, int age,
                     String history, int wardNo, int bedNo) {
        super(patientId, name, age, history);
        this.wardNo = wardNo;
        this.bedNo = bedNo;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() +
                ", Ward No: " + wardNo +
                ", Bed No: " + bedNo);
    }
}
