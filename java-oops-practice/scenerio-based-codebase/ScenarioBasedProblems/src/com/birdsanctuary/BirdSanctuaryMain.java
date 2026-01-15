package com.birdsanctuary;

public class BirdSanctuaryMain {
	    public static void main(String[] args) {
	        Sanctuary s = new Sanctuary();

	        s.addBird(new Eagle("Raghav", "B1"));
	        s.addBird(new Duck("Akshat", "B2"));
	        s.addBird(new Penguine("Shivam", "B3"));
	        s.addBird(new Ostrich("Asish", "B4"));

	        System.out.println("===================================");
	        s.displayAll();
	        System.out.println("-----------------------------------");
	        s.displayFlyable();
	        System.out.println("-----------------------------------");
	        s.displaySwimmable();
	        System.out.println("-----------------------------------");
	        s.report();
	        System.out.println("===================================");
	    }
}

