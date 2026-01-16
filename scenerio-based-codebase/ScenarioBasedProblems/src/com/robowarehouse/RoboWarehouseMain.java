package com.robowarehouse;

public class RoboWarehouseMain {

	    public static void main(String[] args) {

	        Shelf shelf = new Shelf();

	        shelf.insertWeight(15);
	        shelf.insertWeight(5);
	        shelf.insertWeight(25);
	        shelf.insertWeight(10);

	        System.out.println("=== Shelf After Robot Loading ===");
	        shelf.displayShelf();
	    }
	}

