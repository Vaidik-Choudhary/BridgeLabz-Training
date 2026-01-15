package com.payxpress;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public Bill(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dueDate = "Next Month";
        this.isPaid = false;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    protected void markPaid() {
        isPaid = true;
    }

    protected boolean isPaid() {
        return isPaid;
    }
}

