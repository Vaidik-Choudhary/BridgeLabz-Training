package com.smarthomeautomationsystem;

public class Fan extends Appliance {

    public Fan() {
        super(75);
    }

    public Fan(int powerConsumption) {
        super(powerConsumption);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Fan started rotating");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Fan stopped");
    }
}

