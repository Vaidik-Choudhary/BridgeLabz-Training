package com.artify;

public abstract class Artwork {

	protected String title;
	protected String artist;
	protected double price;
	protected String licenseType;
    protected boolean previewAvailable;
	
	public Artwork (String title, String artist, double price, String licenseType) {
	
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.previewAvailable = false;
	}
	
	public Artwork (String title, String artist, double price, String licenseType, boolean previewAvailable) {
		this(title,artist,price,licenseType);
		this.previewAvailable = previewAvailable;
	}
	public void purchase(User user) {
		 if (user.getWalletBalance() >= price) {
	            user.deductBalance(price);
	            System.out.println(user.name + " purchased " + title);
	        } else {
	            System.out.println("Insufficient wallet balance.");
	        }
	}
	protected abstract void license();
}
