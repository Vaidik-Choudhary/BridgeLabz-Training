package com.artify;

public class DigitalArt extends Artwork {

	public DigitalArt (String title, String artist, double price, String licenseType, boolean preview) {
		super(title,artist,price,licenseType,preview);
	}
	
	public void license() {
	    System.out.println("Digital License Applied: " + licenseType);
        System.out.println("Includes personal & commercial usage.");
	}
	
}
