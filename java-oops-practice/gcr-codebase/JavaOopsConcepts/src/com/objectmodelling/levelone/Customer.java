package com.objectmodelling.levelone;

public class Customer {

    String name;
    int balance;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

