package com.examproctor;

import java.util.*;

public class ExamProctor {
    private Stack<Integer> navigationHistory = new Stack<>();
    private HashMap<Integer, String> studentAnswers = new HashMap<>();
    private HashMap<Integer, String> answerKey = new HashMap<>();

    public ExamProctor() {
        answerKey.put(101, "Java");
        answerKey.put(102, "Stack");
        answerKey.put(103, "HashMap");
    }

    public void visitQuestion(int questionID) {
        navigationHistory.push(questionID);
        System.out.println("Now viewing Question ID: " + questionID);
    }

    public void saveAnswer(int questionID, String answer) {
        studentAnswers.put(questionID, answer);
        System.out.println("Answer saved for Q" + questionID);
    }

    public void goBack() {
        if (navigationHistory.size() > 1) {
            navigationHistory.pop(); 
            System.out.println("Returned to previous Question: " + navigationHistory.peek());
        } else {
            System.out.println("No previous questions in history.");
        }
    }

    public int calculateScore() {
        int score = 0;
        for (Integer qID : answerKey.keySet()) {
            if (studentAnswers.containsKey(qID) && 
                studentAnswers.get(qID).equalsIgnoreCase(answerKey.get(qID))) {
                score += 10;
            }
        }
        return score;
    }
}