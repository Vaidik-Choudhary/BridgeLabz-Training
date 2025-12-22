import java.util.Scanner;

class FactorsOfNumbers {

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        int count = 0;

        // Counting number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Storing factors in array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    // Method to find the greatest factor from factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++)
            if (factors[i] > greatest)
                greatest = factors[i];
        return greatest;
    }

    // Method to find sum of all factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++)
            sum += factors[i];
        return sum;
    }

    // Method to find product of all factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++)
            product *= factors[i];
        return product;
    }

    // Method to find product of cubes of all factors
    public static long findProductOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++)
            product *= Math.pow(factors[i], 3);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt(); 

        int[] factors = findFactors(number);

        System.out.println("Factors: ");
        for (int i = 0; i < factors.length; i++)
            System.out.print(factors[i] + " ");

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

        sc.close();
    }
}
