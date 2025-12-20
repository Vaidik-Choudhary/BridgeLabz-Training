//Creating ThreeFriends class to find youngest and tallest
import java.util.Scanner;

class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = {"Amar", "Akbar", "Anthony"};

        //taking user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age : ");
            age[i] = sc.nextInt();

            System.out.print("Enter height : ");
            height[i] = sc.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        //finding youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest])
                youngest = i;

            if (height[i] > height[tallest])
                tallest = i;
        }

        //Printing result
        System.out.println("Youngest is : " + name[youngest]);
        System.out.println("Tallest is : " + name[tallest]);

        sc.close();
    }
}
