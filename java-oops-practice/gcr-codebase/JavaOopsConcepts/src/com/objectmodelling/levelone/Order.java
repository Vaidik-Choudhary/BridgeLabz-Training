package com.objectmodelling.levelone;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void showProducts() {
        for (Product p : products) {
            System.out.println(p.productName);
        }
    }
}

