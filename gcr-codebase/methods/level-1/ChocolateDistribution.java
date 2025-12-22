import java.util.Scanner;

class ChocolateDistribution {

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] calculateDistribution(int numberOfChocolates, int numberOfChildren) {
        int[] values = new int[2];
        values[0] = numberOfChocolates / numberOfChildren;
        values[1] = numberOfChocolates % numberOfChildren;
        return values;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren <= 0) {
            System.out.println("Invalid number of children");
            return;
        }

        int[] result = calculateDistribution(numberOfChocolates, numberOfChildren);

        // Printing Results
        System.out.println("Each child gets = " + result[0]);
        System.out.println("Remaining chocolates = " + result[1]);

        sc.close();
    }
}
