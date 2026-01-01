package com.inheritance.single.smarthomedevices;

public class DeviceDriver {
    public static void main(String[] args) {

        Thermostat t =
            new Thermostat("TH101", "ON", 24);

        t.displayStatus();
    }
}

