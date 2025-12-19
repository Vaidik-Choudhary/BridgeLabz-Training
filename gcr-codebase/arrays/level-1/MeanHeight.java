// Creating MeanHeight class to determine the mean height of the football team
import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] team = new double[11];
        double sum = 0.0;
  
        // taking user input
        for (int i = 0; i < team.length; i++) {
        System.out.println("Enter the Height of player "+ (i + 1));
        team[i] = sc.nextDouble();
        sum = sum + team[i];
        }

        // Printing Mean
        System.out.println(sum/11);

        sc.close();
    }
}

        
        