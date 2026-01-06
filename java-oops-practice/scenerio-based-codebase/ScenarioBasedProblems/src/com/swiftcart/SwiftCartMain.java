package com.swiftcart;

import java.util.*;

public class SwiftCartMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product milk = new PerishableProduct("Milk", 50, "Dairy");
        Product rice = new NonPerishableProduct("Rice", 80, "Grains");

        Cart cart = new Cart();

        cart.addProduct(milk, 2);
        cart.addProduct(rice, 3);

        cart.applyDiscount();
        cart.generateBill();
        
        sc.close();
    }
}
