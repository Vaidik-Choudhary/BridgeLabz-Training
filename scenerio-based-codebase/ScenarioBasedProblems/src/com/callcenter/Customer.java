package com.callcenter;

public class Customer {

    private int id;
    private String name;
    private boolean vip;
    private long callTime;

    public Customer(int id, String name, boolean vip) {
        this.id = id;
        this.name = name;
        this.vip = vip;
        this.callTime = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }

    public long getCallTime() {
        return callTime;
    }
}


