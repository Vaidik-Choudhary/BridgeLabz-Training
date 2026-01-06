package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int id, String name, String location, String date,
                            int attendees) {
        super(id, name, location, date, attendees, 50000, 15000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup.");
        System.out.println("Total Cost: " + calculateCost(5000));
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
