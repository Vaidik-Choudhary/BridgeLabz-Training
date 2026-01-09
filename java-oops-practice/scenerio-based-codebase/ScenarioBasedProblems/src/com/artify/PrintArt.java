package com.artify;

public class PrintArt extends Artwork{

	public PrintArt (String title, String artist, double price, String licenseType) {
		super(title,artist,price,licenseType);
	}
	public void license() {
	    System.out.println("Print License Applied: " + licenseType);
        System.out.println("Limited reproduction rights.");
	}
}
