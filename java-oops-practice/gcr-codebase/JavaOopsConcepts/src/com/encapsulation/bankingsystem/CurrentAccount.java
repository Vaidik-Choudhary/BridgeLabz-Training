package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}
