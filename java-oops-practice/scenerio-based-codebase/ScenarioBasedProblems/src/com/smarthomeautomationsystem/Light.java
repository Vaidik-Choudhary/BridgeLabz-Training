package com.smarthomeautomationsystem;

public class Light extends Appliance {

    public Light() {
        super(40);
    }

    public Light(int powerConsumption) {
        super(powerConsumption);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned OFF");
    }
}

