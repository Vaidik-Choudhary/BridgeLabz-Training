package com.foodloop;

public class FoodLoopMain {

    public static void main(String[] args) {

        FoodItem pizza = new VegItem("Pizza", 350, 5);
        FoodItem burger = new NonVegItem("Burger", 250, 5);
        FoodItem pasta = new VegItem("Pasta", 450, 5);

        // Combo meal order
        Order combo = new ComboOrder(150);

        combo.addItem(pizza);
        combo.addItem(burger);
        combo.addItem(pasta);

        combo.placeOrder();
    }
}

