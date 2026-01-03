package com.mybank;

//CurrentAccount class
public class CurrentAccount extends Account {

 private static final double INTEREST_RATE = 1.5;

 // Constructor
 public CurrentAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 // Interest calculation (polymorphism)
 @Override
 public void calculateInterest() {
     double interest = getBalance() * INTEREST_RATE / 100;
     System.out.println("Current Account Interest: ₹" + interest);
 }
}
