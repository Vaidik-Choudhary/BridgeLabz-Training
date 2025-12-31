package com.objectmodelling.levelone;

public class Bank {

    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    // main method inside Bank class
    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Rohan", 5000);

        bank.openAccount(c1);
        c1.viewBalance();
    }
}

