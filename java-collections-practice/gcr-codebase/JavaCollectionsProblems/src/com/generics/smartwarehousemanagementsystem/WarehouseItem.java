package com.generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {

    protected String name;
    protected double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void displayDetails();
}

