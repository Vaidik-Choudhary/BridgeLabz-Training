package com.ewalletapplication;

public abstract class Wallet implements Transferrable {

    private double balance;

    // Normal wallet
    public Wallet(double balance) {
        this.balance = balance;
    }

    // Wallet with referral bonus
    public Wallet(double balance, double referralBonus) {
        this.balance = balance + referralBonus;
    }

    protected void addBalance(double amount) {
        balance = balance + amount;
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

