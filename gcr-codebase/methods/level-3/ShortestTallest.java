import java.util.Scanner;

class ShortestTallest {

    //Method to calculate the sum of all heights in the array
    public static int calculatingSumOfHeights(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    //Method to find the smallest height from the array
    public static int calculatingSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < smallest)
                smallest = arr[i];
        return smallest;
    }

    //Method to find the tallest height from the array
    public static int calculateTallest(int[] arr) {
        int tallest = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > tallest)
                tallest = arr[i];
        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] heights = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height (in cms) from 150 to 250 :");
            int height = sc.nextInt();
            if (height > 150 && height < 250)
                heights[i] = height;
            else {
                System.out.println("Enter a valid number:");
                i--;
            }
        }

        int sum = calculatingSumOfHeights(heights);
        System.out.println("The sum of all the heights are :" + sum);
        System.out.println("The mean of all the heights are :" + sum / 11);

        int smallest = calculatingSmallest(heights);
        System.out.println("The smallest of all the heights are :" + smallest);

        int tallest = calculateTallest(heights);
        System.out.println("The tallest of all the heights are :" + tallest);

        sc.close();
    }
}
