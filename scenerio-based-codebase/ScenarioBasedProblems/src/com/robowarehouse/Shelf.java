package com.robowarehouse;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private List<Integer> weights;

    public Shelf() {
        weights = new ArrayList<>();
    }

    public void insertWeight(int newWeight) {

        int i = weights.size() - 1;
        weights.add(0);

        while (i >= 0 && weights.get(i) > newWeight) {
            weights.set(i + 1, weights.get(i));
            i--;
        }

        weights.set(i + 1, newWeight);
    }

    public void displayShelf() {
        for (int weight : weights) {
            System.out.println("Weight: " + weight + "kg");
        }
    }
}

