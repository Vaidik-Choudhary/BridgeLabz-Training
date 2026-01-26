package com.feedbackguru;

public class FeedbackGuruMain {
	public static void main(String[] args) {
		FeedbackAnalyzer<String> guru = new FeedbackAnalyzer<>();

		String feedbackFolder = "samplefiles/feedbackfiles";

		System.out.println("Analyzing feedback files...\n");
		guru.analyzeFolder(feedbackFolder);

		guru.printSummary();

		System.out.println("Total feedback entries processed: " + guru.getTotalFeedback());
	}
}