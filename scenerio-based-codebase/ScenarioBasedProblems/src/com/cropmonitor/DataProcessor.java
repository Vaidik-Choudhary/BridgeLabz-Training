package com.cropmonitor;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    private List<Integer> timestamps;

    public DataProcessor() {
        timestamps = new ArrayList<>();
    }

    public void addTimestamp(int time) {
        timestamps.add(time);
    }

    public void sortTimestamps() {
        quickSort(0, timestamps.size() - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {

        int pivot = timestamps.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps.get(j) < pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        int temp = timestamps.get(i);
        timestamps.set(i, timestamps.get(j));
        timestamps.set(j, temp);
    }

    public void displayTimestamps() {
        for (int time : timestamps) {
            System.out.println("Timestamp: " + time);
        }
    }
}

