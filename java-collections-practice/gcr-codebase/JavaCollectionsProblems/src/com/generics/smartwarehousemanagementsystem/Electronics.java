package com.generics.smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {

    private int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics Item: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("-----------------------------");
    }
}

