package com.tailorshop;

import java.util.ArrayList;
import java.util.List;

public class OrderBoard {

    private List<Integer> deadlines;

    public OrderBoard() {
        deadlines = new ArrayList<>();
    }

    public void addOrder(int deadline) {

        int i = deadlines.size() - 1;
        deadlines.add(0);

        while (i >= 0 && deadlines.get(i) > deadline) {
            deadlines.set(i + 1, deadlines.get(i));
            i--;
        }

        deadlines.set(i + 1, deadline);
    }
    
    public void displayOrders() {
        for (int d : deadlines) {
            System.out.println("Delivery Deadline: Day " + d);
        }
    }
}

