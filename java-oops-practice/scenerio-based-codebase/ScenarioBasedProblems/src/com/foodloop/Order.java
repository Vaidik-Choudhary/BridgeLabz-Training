package com.foodloop;

import java.util.ArrayList;

public class Order implements IOrderable {

    protected ArrayList<FoodItem> items;
    protected double total;

    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            total += item.price;
            item.reduceStock();
        }
    }

    protected void applyDiscount() {
        if (total >= 1000) {
            total -= 200;
        } else if (total >= 500) {
            total -= 100;
        }
    }

    @Override
    public void placeOrder() {

        System.out.println("\n------ FOODLOOP ORDER SUMMARY ------");
        System.out.println("Items Ordered:");

        for (FoodItem item : items) {
            System.out.println("- " + item.name + " (₹" + item.price + ")");
        }

        System.out.println("\ntotal: ₹" + total);

        double beforeDiscount = total;
        applyDiscount();
        double discount = beforeDiscount - total;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Payable Amount: ₹" + total);
        System.out.println("-----------------------------------");
    }


    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}
