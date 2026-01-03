package com.mybank;

//Base Account class
public abstract class Account implements ITransaction {

 protected String accountNumber;
 private double balance;

 // Constructor with opening balance
 public Account(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Constructor without opening balance
 public Account(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0;
 }

 // Deposit method
 public void deposit(double amount) {
     balance = balance + amount;
     System.out.println("Amount Deposited: ₹" + amount);
 }

 // Withdraw method
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance = balance - amount;
         System.out.println("Amount Withdrawn: ₹" + amount);
     } else {
         System.out.println("Insufficient Balance!");
     }
 }

 // Check balance method
 public void checkBalance() {
     System.out.println("Current Balance: ₹" + balance);
 }

 // Getter for balance (used internally)
 protected double getBalance() {
     return balance;
 }

 // Abstract method for interest calculation
 public abstract void calculateInterest();
}

