// Creating UntilZero to fetch zero from user
import java.util.Scanner;

class UntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Making variables
        double total = 0.0;

        // Running While loop
        while (true){
            System.out.print("Enter a number : ");
            double number = sc.nextDouble();
            total = total + number;
            if (number == 0)
                break;
            }
        System.out.print(total);

        sc.close();
    }
}