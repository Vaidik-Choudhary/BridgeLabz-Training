package com.artify;

public class User {

	public String name;
	private double walletBalance;
	
	public User (String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public void deductBalance(double amount) {
	        walletBalance -= amount;
	}
	
	public double getWalletBalance () {
		return walletBalance;
	}
}
