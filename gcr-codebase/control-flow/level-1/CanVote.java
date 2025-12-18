// Creating CanVote Class to determine who can vote in the elections
import java.util.Scanner;

class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
       
        // Checking if the persons can vote or not
        if (age>=18) {
            System.out.println("The person's age is" + age + "and can vote");
        } else {
              System.out.println("The person's age is " + age + " and cannot vote");
        }

        sc.close();
    }
}
