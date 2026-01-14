package com.smartcheckout;

class Item {
    private int itemId;
    private int quantity;

    public Item(int itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }
}
