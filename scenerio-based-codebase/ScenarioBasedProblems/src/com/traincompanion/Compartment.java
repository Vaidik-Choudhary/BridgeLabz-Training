package com.traincompanion;

public class Compartment {


    private String name;
    private boolean hasWifi;
    private boolean hasPantry;

    Compartment next;
    Compartment prev;

    public Compartment(String name, boolean hasWifi, boolean hasPantry) {
        this.name = name;
        this.hasWifi = hasWifi;
        this.hasPantry = hasPantry;
        this.next = null;
        this.prev = null;
    }

    public String getName() {
        return name;
    }

    public boolean hasWifi() {
        return hasWifi;
    }

    public boolean hasPantry() {
        return hasPantry;
    }
}

