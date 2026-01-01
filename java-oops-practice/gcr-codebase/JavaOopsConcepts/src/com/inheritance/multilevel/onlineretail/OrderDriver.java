package com.inheritance.multilevel.onlineretail;

public class OrderDriver {
    public static void main(String[] args) {

        Order o1 =
            new Order(101, "01-01-2026");

        Order o2 =
            new ShippedOrder(102, "02-01-2026", "TRK123");

        Order o3 =
            new DeliveredOrder(103, "03-01-2026", "TRK456", "05-01-2026");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}

