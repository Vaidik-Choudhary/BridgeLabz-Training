package com.foodloop;

public class ComboOrder extends Order {

    private double comboDiscount;

    public ComboOrder(double comboDiscount) {
        super();
        this.comboDiscount = comboDiscount;
    }

    @Override
    protected void applyDiscount() {
        total -= comboDiscount;  
        if (total < 0) {
            total = 0;
        }
    }
}

