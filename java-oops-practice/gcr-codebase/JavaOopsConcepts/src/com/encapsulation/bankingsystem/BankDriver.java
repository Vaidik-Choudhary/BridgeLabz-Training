package com.encapsulation.bankingsystem;

public class BankDriver {
    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[2];

        accounts[0] =
            new SavingsAccount("SA101", "Rohit", 50000);
        accounts[1] =
            new CurrentAccount("CA201", "Aman", 80000);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Interest: " +
                accounts[i].calculateInterest());
        }
    }
}
