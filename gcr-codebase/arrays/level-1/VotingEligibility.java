//Creating VotingEligibility class to check voting eligibility of students
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Defining array for student ages
        int[] age = new int[10];

        //taking user input
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student : ");
            age[i] = sc.nextInt();
        }

        //Checking voting eligibility
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote");
            } else {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }

        sc.close();
    }
}
