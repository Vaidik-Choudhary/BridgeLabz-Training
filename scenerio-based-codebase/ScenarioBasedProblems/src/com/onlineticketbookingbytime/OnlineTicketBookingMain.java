package com.onlineticketbookingbytime;

public class OnlineTicketBookingMain {

	public static void main(String[] args) {

        EventSchedule schedule = new EventSchedule();

        schedule.root = schedule.insertEvent(schedule.root, 1800, "Rock Concert");
        schedule.root = schedule.insertEvent(schedule.root, 1400, "Tech Conference");
        schedule.root = schedule.insertEvent(schedule.root, 2000, "Comedy Show");
        schedule.root = schedule.insertEvent(schedule.root, 1600, "Startup Meetup");
        schedule.root = schedule.insertEvent(schedule.root, 2200, "Movie Premiere");

        System.out.println("Upcoming Events (Sorted by Time):");
        schedule.displaySchedule(schedule.root);

        schedule.root = schedule.cancelEvent(schedule.root, 1600);

        System.out.println("\nAfter Cancelling Event at 1600:");
        schedule.displaySchedule(schedule.root);
    }
}

