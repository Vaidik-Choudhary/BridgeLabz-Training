package com.lambdaexpression.customsorting;

import java.util.*;

public class ProductSort {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Phone", 30000, 4.5, 10),
            new Product("Laptop", 70000, 4.8, 15),
            new Product("Headphones", 2000, 4.1, 5)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.ratings, p1.ratings));

        // Sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
    }
}