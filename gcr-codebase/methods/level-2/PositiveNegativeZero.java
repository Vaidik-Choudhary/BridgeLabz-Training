import java.util.Scanner;

class PositiveNegativeZero {

    //Methods to find the if the number is positive, negative or zero
    public static boolean isPositive(int num) { return num >= 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive.");
                if (isEven(numbers[i])) System.out.println(numbers[i] + " is even.");
                else System.out.println(numbers[i] + " is odd.");
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 1) System.out.println("First number is greater than last number.");
        else if (cmp == -1) System.out.println("First number is less than last number.");
        else System.out.println("First number is equal to last number.");
        sc.close();
    }
}
