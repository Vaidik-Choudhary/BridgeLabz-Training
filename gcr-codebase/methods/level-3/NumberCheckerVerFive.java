import java.util.Scanner;

class NumberCheckerVerFive {

    // Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    // Method to check whether a number is a Perfect Number
    public static boolean isPerfectNumber(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // Method to check whether a number is an Abundant Number
    public static boolean isAbundantNumber(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // Method to check whether a number is a Deficient Number
    public static boolean isDeficientNumber(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // Method to check whether a number is a Strong Number
    public static boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++)
                fact *= i;

            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // Calling methods and displaying results
        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));

        sc.close();
    }
}
