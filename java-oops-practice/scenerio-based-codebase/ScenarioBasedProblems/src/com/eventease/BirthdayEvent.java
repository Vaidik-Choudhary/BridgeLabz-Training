package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int id, String name, String location, String date,
                          int attendees) {
        super(id, name, location, date, attendees, 20000, 5000);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with decorations.");
        System.out.println("Total Cost: " + calculateCost(2000));
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
