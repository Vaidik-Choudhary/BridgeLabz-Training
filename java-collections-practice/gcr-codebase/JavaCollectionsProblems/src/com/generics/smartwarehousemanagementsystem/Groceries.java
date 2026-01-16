package com.generics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem {

    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }


    @Override
    public void displayDetails() {
        System.out.println("Grocery Item: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("-----------------------------");
    }
}
