package com.smartcheckout;

import java.util.HashMap;

class Inventory {
    private HashMap<Integer, String> itemNameMap;
    private HashMap<Integer, Double> priceMap;
    private HashMap<Integer, Integer> stockMap;

    public Inventory() {
        itemNameMap = new HashMap<>();
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }

    public void addItem(int itemId, String itemName, double price, int stock) {
        itemNameMap.put(itemId, itemName);
        priceMap.put(itemId, price);
        stockMap.put(itemId, stock);
    }

    public String getItemName(int itemId) {
        return itemNameMap.get(itemId);
    }

    public double getPrice(int itemId) {
        return priceMap.get(itemId);
    }

    public void updateStock(int itemId, int quantity) {
        int currentStock = stockMap.get(itemId);
        stockMap.put(itemId, currentStock - quantity);
    }
}
