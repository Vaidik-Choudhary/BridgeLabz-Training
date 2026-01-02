package com.hospitalpatientmanagementsystem;

public class Bill implements Payable {

    private double baseAmount;
    private double tax;
    private double discount;

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
        this.tax = baseAmount * 0.05;
        this.discount = baseAmount * 0.10;
    }

    @Override
    public double calculatePayment() {
        return baseAmount + tax - discount;
    }
}


