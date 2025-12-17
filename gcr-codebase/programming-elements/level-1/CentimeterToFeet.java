//creating CentimeterToFeet class to convert Height from centimetre to feet and inches
import java.util.Scanner;
class CentimeterToFeet{
    public static void main(){
    Scanner sc = new Scanner(System.in);
    
    //taking input from user
    int centimetre = sc.nextInt();

    //calculating height in feet and inches
    double totalInches =  centimetre/2.54;
    int feet = (int)totalInches / 12;
    int inches = (int)totalInches % 12;

    // Printing conversions
    System.out.println("Your Height in cm is " + centimetre + "while in feet is " + feet + " and inches is " + inches);


sc.close();
    }
}