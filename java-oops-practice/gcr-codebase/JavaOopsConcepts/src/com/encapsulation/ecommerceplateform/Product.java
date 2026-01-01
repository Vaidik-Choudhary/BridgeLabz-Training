package com.encapsulation.ecommerceplateform;

public abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    protected double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice(double tax) {
        return price + tax - calculateDiscount();
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
    }
}
