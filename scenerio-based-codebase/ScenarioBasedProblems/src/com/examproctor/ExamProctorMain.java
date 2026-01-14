package com.examproctor;

public class ExamProctorMain {

	public static void main(String[] args) {
        ExamProctor exam = new ExamProctor();
        exam.visitQuestion(101);
        exam.saveAnswer(101, "Java");

        exam.visitQuestion(102);
        exam.saveAnswer(102, "Queue"); 

        exam.visitQuestion(103);
        exam.saveAnswer(103, "HashMap");

        exam.goBack();

        System.out.println("\n--- Final Results ---");
        System.out.println("Total Score: " + exam.calculateScore());
    }

}
