import java.util.Scanner;

class FibonacciSeries {

    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generateFibonacci(n);

        sc.close();
    }
}
