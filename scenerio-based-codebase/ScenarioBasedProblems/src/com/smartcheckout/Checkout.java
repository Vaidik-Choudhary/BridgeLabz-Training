package com.smartcheckout;

import java.util.LinkedList;
import java.util.Queue;

class Checkout {
    private Queue<Customer> customerQueue;
    private Inventory inventory;

    public Checkout(Inventory inventory) {
        this.inventory = inventory;
        this.customerQueue = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        System.out.println("Customer added to queue: " + customer.getName());
        customerQueue.add(customer);
    }

    public void processBilling() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        double totalBill = 0;

        System.out.println("\nProcessing billing for: " + customer.getName());

        for (Item item : customer.getItems()) {
            String itemName = inventory.getItemName(item.getItemId());
            double price = inventory.getPrice(item.getItemId());
            double cost = price * item.getQuantity();

            inventory.updateStock(item.getItemId(), item.getQuantity());
            totalBill += cost;

            System.out.println(
                "Item: " + itemName + " | Quantity: " + item.getQuantity() + " | Cost: ₹" + cost);
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }
}
