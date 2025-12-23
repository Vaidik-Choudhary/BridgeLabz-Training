import java.util.Scanner;

class PalindromeCheck {

    // Method to check if string is palindrome
    public static boolean isPalindrome(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}
