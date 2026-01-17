package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Product<? extends Category>> products;

    public Catalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<? extends Category> product : products) {
            product.display();
        }
    }
}

