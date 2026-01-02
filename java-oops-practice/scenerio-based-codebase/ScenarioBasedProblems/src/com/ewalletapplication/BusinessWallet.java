package com.ewalletapplication;

public class BusinessWallet extends Wallet {

    private double transactionTax = 0.02; 

    public BusinessWallet(double balance) {
        super(balance);
    }

    public BusinessWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * transactionTax;
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Business wallet transfer successful (Tax applied)");
        } else {
            System.out.println("Insufficient balance after tax");
        }
    }
}

