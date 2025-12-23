import java.util.Scanner;

class ToggleCase {

    // Method to toggle case of characters in a string
    public static String toggleCase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(toggleCase(input));

        sc.close();
    }
}
