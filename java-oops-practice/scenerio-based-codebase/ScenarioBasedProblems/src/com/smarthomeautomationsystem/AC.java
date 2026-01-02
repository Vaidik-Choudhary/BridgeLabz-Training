package com.smarthomeautomationsystem;

public class AC extends Appliance {

    public AC() {
        super(1500);
    }

    public AC(int powerConsumption) {
        super(powerConsumption);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("AC cooling started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("AC turned OFF");
    }
}

