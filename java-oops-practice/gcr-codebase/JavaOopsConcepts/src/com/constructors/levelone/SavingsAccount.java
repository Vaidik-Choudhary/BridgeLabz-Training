package com.constructors.levelone;

public class SavingsAccount extends BankAccount1 {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void show() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println(getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1018965, "Samuel", 2000000);
        s.show();
    }
}
