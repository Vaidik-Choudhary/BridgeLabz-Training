package com.inheritance.hierarchical.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    private int tenureYears;

    public FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

