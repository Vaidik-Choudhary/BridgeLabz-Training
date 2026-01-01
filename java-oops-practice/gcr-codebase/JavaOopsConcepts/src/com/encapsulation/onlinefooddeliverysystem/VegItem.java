package com.encapsulation.onlinefooddeliverysystem;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }
}
