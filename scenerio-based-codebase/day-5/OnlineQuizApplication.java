/* 17. Online Quiz Application 
Ask 5 questions (MCQs) from a user.
   Use arrays and a for-loop.
   Record score.
   Switch for answer checking. Apply clear indentation and structured layout */

import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions array
        String[] questions = {
            "1. Java is a _____ language?",
            "2. Which keyword is used to create an object?",
            "3. Which loop runs at least once?",
            "4. Which method starts Java program execution?",
            "5. Which operator is used for comparison?"
        };

        // Options array
        String[][] options = {
            {"a) Low-level", "b) High-level", "c) Machine-level", "d) Assembly"},
            {"a) new", "b) create", "c) object", "d) make"},
            {"a) for", "b) while", "c) do-while", "d) if"},
            {"a) start()", "b) run()", "c) main()", "d) execute()"},
            {"a) =", "b) !=", "c) ==", "d) ++"}
        };

        // Correct answer
        char[] answers = {'b', 'a', 'c', 'c', 'c'};

        int score = 0;

        System.out.println("==== ONLINE QUIZ APPLICATION ====");

        // for-loop for quiz
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().charAt(0);

            // Switch for answer checking
            switch (userAnswer) {

                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct");
                        score++;
                    } else {
                        System.out.println("Wrong");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("\n-------------------------------");
        System.out.println("Quiz Completed");
        System.out.println("Your Score : " + score + " / " + questions.length);
        System.out.println("-------------------------------");

        sc.close();
    }
}
