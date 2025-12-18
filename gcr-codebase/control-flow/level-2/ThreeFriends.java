// Creating ThreeFriends class to find whose the youngest and the tallest
import java.util.Scanner;

class ThreeFriends {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter Amar's age : ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akhbar's age : ");
        int akhbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age : ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar's Height : ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter Akhbar's Height : ");
        int akhbarHeight = sc.nextInt();
        System.out.print("Enter Anthony's Height : ");
        int anthonyHeight = sc.nextInt();

        // calculating whose the youngest
        if (amarAge<akhbarAge && amarAge<anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akhbarAge<amarAge && akhbarAge<anthonyAge) {
              System.out.println("Akhbar is the youngest");
        } else {
              System.out.println("Anthony is the youngest");
        }

        // calculating whose the tallest
        if (amarHeight>akhbarHeight && amarHeight>anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akhbarHeight>amarHeight && akhbarHeight>anthonyHeight) {
              System.out.println("Akhbar is the tallest");
        } else {
              System.out.println("Anthony is the tallest");
        }

        sc.close();
    }
}