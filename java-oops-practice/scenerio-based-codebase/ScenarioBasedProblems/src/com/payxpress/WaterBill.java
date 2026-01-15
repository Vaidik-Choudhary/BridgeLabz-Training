package com.payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount) {
        super("Water", amount);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Water bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Water Bill Reminder: Please clear dues soon.");
    }
}
