package com.movietime;

public class MovieTimeMain {

	public static void main(String[] args) {
		
		ShowList list = new ShowList();
		
		list.addShow("on 19:30");
		list.addShow("on 14:00");
		list.addShow("on 02:67");
		list.addShow("on 06:09");
		list.addShow("on 23:59");
		
		System.out.println("=== Show List ===");
		list.displayShows();
	}
}
