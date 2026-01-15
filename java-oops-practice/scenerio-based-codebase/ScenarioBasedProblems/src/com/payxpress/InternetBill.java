package com.payxpress;

public class InternetBill extends Bill {

    public InternetBill(double amount) {
        super("Internet", amount);
    }

    @Override
    public void pay() {
        markPaid();
        System.out.println("Internet bill paid: ₹" + amount);
    }

    @Override
    public void sendReminder() {
        System.out.println("Internet Bill Reminder: Service may be disconnected.");
    }
}

