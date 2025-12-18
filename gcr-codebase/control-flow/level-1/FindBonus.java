//Creating FindBonus class to find the bonus amount employees will be getting
import java.util.Scanner;

class FindBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Taking user input
        System.out.print("Enter your years of service : ");
        int years = sc.nextInt();

        // Checking the conditions and calculating the bonus amount
        if (years > 5) {
            System.out.print("Enter your Salary : ");
            double salary = sc.nextDouble();

            System.out.println("The bonus amount is : " + (salary*0.05));
        } else {
              System.out.println("Not eligible for the bonus");
        }

        sc.close();
    }
}