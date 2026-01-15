package com.payxpress;

public class PayXpressMain {
    public static void main(String[] args) {

        Bill b1 = new ElectricityBill(1200,"12-05-2026");
        Bill b2 = new InternetBill(999);

        b1.sendReminder();
        b1.pay();

        b2.sendReminder();
        b2.pay();
    }
}
