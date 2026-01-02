package com.ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            System.out.println("Personal wallet transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

