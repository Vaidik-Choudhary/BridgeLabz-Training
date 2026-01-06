package com.edumentor;

import java.util.Scanner;

public class EdumentorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Learner
        System.out.print("Enter learner name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter course type (short/full-time): ");
        String courseType = sc.nextLine();

        Learner learner = new Learner(name, email, 101, courseType);

        // Quiz creation
        System.out.print("Choose quiz difficulty (easy/hard): ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(difficulty);

        int[] userAnswers = new int[2];
        System.out.println("Enter your answers:");

        for (int i = 0; i < userAnswers.length; i++) {
            userAnswers[i] = sc.nextInt();
        }

        quiz.attemptQuiz(userAnswers);
        quiz.displayResult();

        // Certificate generation (Polymorphism)
        learner.generateCertificate();

        sc.close();
    }
}

