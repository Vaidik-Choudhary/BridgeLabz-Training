package com.payxpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Electricity Bill Paid");
        System.out.println("Amount: ₹" + amount);
        System.out.println("Due Date: " + dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Electricity bill due on " + dueDate);
    }
}

