package com.inheritance.hierarchical.bankaccounttypes;

public class BankDriver {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount a2 = new CheckingAccount("CA201", 30000, 10000);
        BankAccount a3 = new FixedDepositAccount("FD301", 100000, 5);

        ((SavingsAccount) a1).displayAccountType();
        ((CheckingAccount) a2).displayAccountType();
        ((FixedDepositAccount) a3).displayAccountType();
    }
}
