package com.artify;

public class ArtifyMain {

	public static void main(String[] args) {
		User buyer = new User("Vaidik Choudhary",50000);
		
		Artwork art1 = new DigitalArt("The First 5000 Days","Beeple",500,"Commercial License",true); 
	 
		Artwork art2 = new PrintArt("The Great Wave off Kanagawa","Katsushika Hokusai",10000,"Single-Use");
		
		System.out.println("=======================================================");
		art1.purchase(buyer);
        art1.license();
       
        System.out.println("-------------------------------------------------------");
        System.out.println("Wallet Balance: " + buyer.getWalletBalance());
        System.out.println("=======================================================\n\n");
        
        
        System.out.println("=======================================================");
        art2.purchase(buyer);
        art2.license();
        System.out.println("-------------------------------------------------------");
        System.out.println("Wallet Balance: " + buyer.getWalletBalance());
        System.out.println("=======================================================");
	}
}
