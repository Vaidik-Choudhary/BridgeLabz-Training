import java.util.Scanner;

public class PalindromeCheck {

    public static String findreversedString(String input) {
        String reversedString = "";
        for (int i = input.length()-1; i >= 0; i--){
             reversedString += input.charAt(i);
        }
        return reversedString ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String reversed = findreversedString(input);
        
        if(reversed.equals(input))
        System.out.println("Palindrome");
        else
        System.out.println("Not a Palindrome");

        sc.close();
   }
}  