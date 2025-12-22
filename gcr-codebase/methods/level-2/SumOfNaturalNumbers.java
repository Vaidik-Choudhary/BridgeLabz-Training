import java.util.Scanner;

class SumOfNaturalNumbers {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        // Printing Results
        System.out.println("Recursive Sum = " + sum1 + " and Formula Sum = " + sum2);

        sc.close();
    }
}
