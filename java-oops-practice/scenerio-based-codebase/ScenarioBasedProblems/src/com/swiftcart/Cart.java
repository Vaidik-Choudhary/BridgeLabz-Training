package com.swiftcart;

import java.util.*;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Empty cart constructor
    Cart() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    // Pre-filled cart constructor
    Cart(List<Product> initialProducts) {
        this();
        for (Product product : initialProducts) {
            addProduct(product, 1);
        }
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        updateTotal(product.getPrice() * quantity);
    }

    private void updateTotal(double amount) {
        totalPrice += amount;
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product product : products) {
            discount += product.applyDiscount(product.getPrice());
        }

        totalPrice -= discount;
    }

    @Override
    public void generateBill() {
        System.out.println("\n------ SwiftCart Bill ------");
        for (Product product : products) {
            System.out.println(product.getName() + " : ₹" + product.getPrice());
        }
        System.out.println("Total Amount : ₹" + totalPrice);
    }
}
