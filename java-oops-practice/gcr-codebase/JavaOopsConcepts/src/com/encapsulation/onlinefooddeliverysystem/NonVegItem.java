package com.encapsulation.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (price * quantity) + 50;
    }

    public double applyDiscount() {
        return 30;
    }

    public String getDiscountDetails() {
        return "Flat ₹30 discount";
    }
}

