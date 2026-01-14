package com.smartcheckout;

public class SmartCheckoutMain {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.addItem(101, "Milk", 50.0, 100);
        inventory.addItem(102, "Bread", 30.0, 200);

        Customer c1 = new Customer(1, "Vaidik");
        c1.addItem(new Item(101, 2));
        c1.addItem(new Item(102, 3));

        Customer c2 = new Customer(2, "Ravi");
        c2.addItem(new Item(101, 1));

        Checkout counter = new Checkout(inventory);

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processBilling();
        counter.processBilling();
    }
}
