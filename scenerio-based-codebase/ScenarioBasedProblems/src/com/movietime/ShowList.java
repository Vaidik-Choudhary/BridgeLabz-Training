package com.movietime;

import java.util.ArrayList;
import java.util.List;

public class ShowList {

	private List<String> showName;
	
	public ShowList() {
		showName = new ArrayList<>();
	}
	
	public void addShow(String Name) {
		
		int i = showName.size()-1;
		showName.add("");
		
		while (i >= 0 && showName.get(i).compareToIgnoreCase(Name) > 0) {
			showName.set(i+1, showName.get(i));
			i--;
		}
		
		showName.set(i+1, Name);
	}
	public void displayShows() {
		for (String show : showName) {
		System.out.println("Show : "+ show);	
		}
	}
}
