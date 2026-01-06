package com.eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;

    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, double serviceCost) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
    }

    protected double calculateCost(double discount) {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }
}

