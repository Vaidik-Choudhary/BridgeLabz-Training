package com.junit.performancetestingusingTimeout;


public class PerformanceUtils {

    public String longRunningTask() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return "Task completed";
    }
}
