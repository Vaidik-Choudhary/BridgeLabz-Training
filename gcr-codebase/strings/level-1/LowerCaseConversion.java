import java.util.Scanner;

class LowerCaseConversion {

    // Method to convert text to lowercase using charAt
    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                result = result + (char)(ch + 32);
            else
                result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String manualLower = convertToLowerCase(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Result: " + compareStrings(manualLower, builtInLower));

        sc.close();
    }
}
