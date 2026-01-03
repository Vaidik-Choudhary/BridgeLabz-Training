package com.mybank;

//Interface for transaction operations
public interface ITransaction {

 void deposit(double amount);

 void withdraw(double amount);

 void checkBalance();
}
