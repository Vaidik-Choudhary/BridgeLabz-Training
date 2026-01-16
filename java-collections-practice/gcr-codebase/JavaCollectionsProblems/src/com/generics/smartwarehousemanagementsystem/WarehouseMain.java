package com.generics.smartwarehousemanagementsystem;

public class WarehouseMain {

	    public static void main(String[] args) {

	        Storage<Electronics> electronicsStorage = new Storage<>();
	        Storage<Groceries> groceriesStorage = new Storage<>();
	        Storage<Furniture> furnitureStorage = new Storage<>();

	        electronicsStorage.addItem(new Electronics("Laptop", 55000, 2));
	        electronicsStorage.addItem(new Electronics("Smartphone", 25000, 1));

	        groceriesStorage.addItem(new Groceries("Rice", 1200, "12-2026"));
	        groceriesStorage.addItem(new Groceries("Milk", 50, "02-2025"));

	        furnitureStorage.addItem(new Furniture("Chair", 3000, "Wood"));
	        furnitureStorage.addItem(new Furniture("Table", 8000, "Metal"));

	        System.out.println("=== Electronics Storage ===");
	        Storage.displayAllItems(electronicsStorage.getItems());

	        System.out.println("=== Groceries Storage ===");
	        Storage.displayAllItems(groceriesStorage.getItems());

	        System.out.println("=== Furniture Storage ===");
	        Storage.displayAllItems(furnitureStorage.getItems());
	    }
	}

