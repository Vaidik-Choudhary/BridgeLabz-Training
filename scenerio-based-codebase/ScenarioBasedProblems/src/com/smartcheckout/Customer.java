package com.smartcheckout;

import java.util.*;

class Customer {
    private int customerId;
    private String name;
    private List<Item> items;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }
}
