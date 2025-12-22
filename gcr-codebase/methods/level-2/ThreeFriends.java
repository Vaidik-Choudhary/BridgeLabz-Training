import java.util.Scanner;

class ThreeFriends {

    //Method to find the youngest
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[minIndex]) minIndex = i;
        return minIndex;
    }
    
    //Method to find the tallest
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        //Printing Results 
        System.out.println(friends[youngestIndex] + " is the youngest.");
        System.out.println(friends[tallestIndex] + " is the tallest.");

        sc.close();
    }
}
