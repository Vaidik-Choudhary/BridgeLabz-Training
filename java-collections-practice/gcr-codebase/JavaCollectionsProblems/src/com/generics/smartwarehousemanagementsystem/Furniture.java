package com.generics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture Item: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Material: " + material);
        System.out.println("-----------------------------");
    }
}
