package com.cinemahouse;

import java.util.ArrayList;
import java.util.List;

public class ShowBoard {

    private List<Integer> showTimes;

    public ShowBoard() {
        showTimes = new ArrayList<>();
    }

    public void addShowTime(int time) {
        showTimes.add(time);
    }

    public void sortShowTimes() {
        int n = showTimes.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (showTimes.get(j) > showTimes.get(j + 1)) {
                    int temp = showTimes.get(j);
                    showTimes.set(j, showTimes.get(j + 1));
                    showTimes.set(j + 1, temp);
                }
            }
        }
    }
    public void displayShowTimes() {
        for (int time : showTimes) {
            System.out.println("Show Time: " + time + ":00");
        }
    }
}
