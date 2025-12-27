package com.constructors.levelone;

public class BankAccount1 {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount1(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
