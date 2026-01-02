package com.ewalletapplication;

public class Transaction {

    private String sender;
    private String receiver;
    private double amount;

    public Transaction(String sender, String receiver, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    public String getDetails() {
        return sender + " sent " + amount + " to " + receiver;
    }
}
