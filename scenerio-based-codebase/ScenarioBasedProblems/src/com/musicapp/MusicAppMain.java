package com.musicapp;

public class MusicAppMain {
	    public static void main(String[] args) {

	        Music library = new Music();
	        library.root = library.insert(library.root, "Red", 201, "Seedhe Muat");
	        library.root = library.insert(library.root, "I Guess", 150, "KR$NA");
	        library.root = library.insert(library.root, "03:59", 180, "Divine");
	        library.root = library.insert(library.root, "Run it up", 220, "Hanuman Kind");
	        library.root = library.insert(library.root, "Sheikh chilli", 175, "Raftaar");

	        int searchId = 180;
	        SongNode result = library.searchByTrackId(library.root, searchId);

	        if (result != null) {
	            System.out.println("Track Found:");
	            System.out.println("Title: " + result.title +" | Track ID: " + result.trackId +" | Artist: " + result.artist);
	        } else {
	            System.out.println("Track Not Found");
	        }

	        System.out.println("\nPlaylist (Alphabetical Order):");
	        library.inorder(library.root);
	    }
}


