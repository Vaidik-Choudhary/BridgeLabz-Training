package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantDriver {
    public static void main(String[] args) {

        Worker w1 = new Chef("Ramesh", 101);
        Worker w2 = new Waiter("Suresh", 102);

        w1.performDuties();
        System.out.println();
        w2.performDuties();
    }
}

