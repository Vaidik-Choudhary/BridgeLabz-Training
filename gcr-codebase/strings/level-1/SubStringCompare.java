import java.util.Scanner;

class SubStringCompare {

    // Method to create substring manually using charAt()
    public static String SubstringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        String manualSubstring = SubstringUsingCharAt(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);
        boolean result = compareStringsUsingCharAt(manualSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are equal: " + result);

        sc.close();
    }
}
