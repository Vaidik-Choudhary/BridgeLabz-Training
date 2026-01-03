package com.mybank;

//SavingsAccount class
public class SavingsAccount extends Account {

 private static final double INTEREST_RATE = 4.0;

 // Constructor
 public SavingsAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 // Interest calculation (polymorphism)
 @Override
 public void calculateInterest() {
     double interest = getBalance() * INTEREST_RATE / 100;
     System.out.println("Savings Account Interest: ₹" + interest);
 }
}
