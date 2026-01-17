package com.icecreamrush;

import java.util.ArrayList;
import java.util.List;

public class FlavorBoard {

    private List<Integer> salesList;

    public FlavorBoard() {
        salesList = new ArrayList<>();
    }

    public void addSales(int sales) {
        salesList.add(sales);
    }

    public void sortSales() {

        int n = salesList.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (salesList.get(j) > salesList.get(j + 1)) {

                    int temp = salesList.get(j);
                    salesList.set(j, salesList.get(j + 1));
                    salesList.set(j + 1, temp);
                }
            }
        }
    }

    public void displaySales() {
        for (int sale : salesList) {
            System.out.println("Flavor Sold Count: " + sale);
        }
    }
}
