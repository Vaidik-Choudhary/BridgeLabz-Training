// Creating FindRounds class to compute the number of handshakes
import java.util.Scanner;

class FindRounds {
    
    // method to calculate the number of rounds
    public static int calculateRounds(int side1, int side2, int side3) {
        int rounds = 5000/(side1+side2+side3);
        if (5000 % (side1+side2+side3) != 0) {
            return rounds + 1;
        }
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the side 1 : ");
        int side1 = sc.nextInt();
        System.out.print("Enter the side 2 : ");
        int side2 = sc.nextInt();
        System.out.print("Enter the side 3 : ");
        int side3 = sc.nextInt();

       // Calling the method to get the number of Rounds
       int rounds = FindRounds.calculateRounds(side1,side2,side3);

        // Printing results
        System.out.println(rounds);


        sc.close();
    }
}   