import java.util.Scanner;

class FactorsCalculation {

    // Method to find factors and return array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        // Printing Results
        for (int i = 0; i < factors.length; i++) {
            System.out.println(factors[i] + " ");
        }
        System.out.println("Sum = " + findSum(factors));
        System.out.println("Product = " + findProduct(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));

        sc.close();
    }
}
