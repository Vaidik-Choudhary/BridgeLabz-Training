package com.smarthomeautomationsystem;

public abstract class Appliance implements Controllable {

    private boolean status;
    private int powerConsumption;

    // Default power setting
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.status = false;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOn() {
        return status;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

