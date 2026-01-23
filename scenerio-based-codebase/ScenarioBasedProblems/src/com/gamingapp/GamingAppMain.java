package com.gamingapp;

public class GamingAppMain {

	public static void main(String[] args) {

		LeaderBoard leaderboard = new LeaderBoard();

		leaderboard.root = leaderboard.insertPlayer(leaderboard.root, 500, "Ravi");
		leaderboard.root = leaderboard.insertPlayer(leaderboard.root, 300, "Shivam");
		leaderboard.root = leaderboard.insertPlayer(leaderboard.root, 700, "Saurav");
		leaderboard.root = leaderboard.insertPlayer(leaderboard.root, 600, "Raghav");
		leaderboard.root = leaderboard.insertPlayer(leaderboard.root, 800, "Akshat");

		System.out.println(" Leaderboard (Sorted by Score):");
		leaderboard.displayLeaderboard(leaderboard.root);

		leaderboard.root = leaderboard.removePlayer(leaderboard.root, 300);

		System.out.println("\nAfter Removing Player with Score 300:");
		leaderboard.displayLeaderboard(leaderboard.root);
	}
}


