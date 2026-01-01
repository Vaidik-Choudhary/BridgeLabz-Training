package com.encapsulation.onlinefooddeliverysystem;

public class FoodDriver {
    public static void main(String[] args) {

        FoodItem[] order = new FoodItem[2];

        order[0] = new VegItem("Paneer", 200, 2);
        order[1] = new NonVegItem("Chicken", 300, 1);

        for (int i = 0; i < order.length; i++) {
            order[i].getItemDetails();
        }
    }
}

