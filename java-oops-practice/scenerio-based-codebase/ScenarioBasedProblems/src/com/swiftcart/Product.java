package com.swiftcart;

public abstract class Product {

    protected String name;
    protected double price;
    protected String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public abstract double applyDiscount(double totalPrice);

    public String getName() {
        return name;
    }
}
