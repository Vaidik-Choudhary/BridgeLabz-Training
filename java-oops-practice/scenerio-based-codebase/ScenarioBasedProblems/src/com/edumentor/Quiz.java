package com.edumentor;

public class Quiz {

    // Internal question bank must remain private
    private String[] questions;

    // Answers cannot be modified once set
    private final int[] answers;

    private int score;

    // Constructor with difficulty
    public Quiz(String difficulty) {

        if (difficulty.equalsIgnoreCase("easy")) {
            questions = new String[]{"2+2?", "5-3?"};
            answers = new int[]{4, 2};
        } else {
            questions = new String[]{"10*5?", "20/4?"};
            answers = new int[]{50, 5};
        }
    }

    // Conduct quiz
    public void attemptQuiz(int[] userAnswers) {
        score = 0;

        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score++; // operator usage
            }
        }
    }

    // Percentage calculation using operators
    public double calculatePercentage() {
        return (score * 100.0) / answers.length;
    }

    public void displayResult() {
        System.out.println("Score: " + score + "/" + answers.length);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}
