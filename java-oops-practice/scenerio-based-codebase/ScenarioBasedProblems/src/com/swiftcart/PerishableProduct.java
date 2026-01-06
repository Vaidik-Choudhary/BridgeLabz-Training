package com.swiftcart;

public class PerishableProduct extends Product {

    PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.10;
    }
}
