package com.swiftcart;

public class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.05;
    }
}
