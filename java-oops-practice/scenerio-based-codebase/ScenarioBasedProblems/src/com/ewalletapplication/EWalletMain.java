package com.ewalletapplication;

public class EWalletMain {

    public static void main(String[] args) {

        Wallet pw = new PersonalWallet(1000, 100);
        Wallet bw = new BusinessWallet(5000);

        User user1 = new User(1, "Rahul", pw);
        User user2 = new User(2, "Anita", bw);

        user1.getWallet().transferTo(user2, 300);
        user2.getWallet().transferTo(user1, 500);

        System.out.println("Rahul Balance: " + user1.getWallet().getBalance());
        System.out.println("Anita Balance: " + user2.getWallet().getBalance());
    }
}

