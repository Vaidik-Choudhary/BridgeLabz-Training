package com.encapsulation.ecommerceplateform;

public class Clothing extends Product {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}

