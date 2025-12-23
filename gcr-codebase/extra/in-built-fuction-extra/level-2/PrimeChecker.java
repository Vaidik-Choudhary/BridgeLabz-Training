import java.util.Scanner;

class PrimeChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPrime(num) ? "Prime Number" : "Not a Prime Number");

        sc.close();
    }
}
