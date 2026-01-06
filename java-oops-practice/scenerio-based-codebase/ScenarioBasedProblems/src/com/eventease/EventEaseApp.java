package com.eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        User user = new User("Rahul", "rahul@gmail.com");

        Event event;

        event = new BirthdayEvent(101, "Rahul Birthday",
                "Indore", "15-Aug-2026", 50);

        event.schedule();
        event.reschedule("20-Aug-2026");
    }
}
