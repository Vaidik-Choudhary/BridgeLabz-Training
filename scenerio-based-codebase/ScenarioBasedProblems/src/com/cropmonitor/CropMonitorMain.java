package com.cropmonitor;

public class CropMonitorMain {

    public static void main(String[] args) {

        DataProcessor processor = new DataProcessor();

        processor.addTimestamp(450);
        processor.addTimestamp(120);
        processor.addTimestamp(890);
        processor.addTimestamp(300);
        processor.addTimestamp(50);

        processor.sortTimestamps();

        System.out.println("=== Sorted Sensor Timeline ===");
        processor.displayTimestamps();
    }
}

