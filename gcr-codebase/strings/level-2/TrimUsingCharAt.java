import java.util.Scanner;

class TrimUsingCharAt {

    // Method to find trim indexes
    public static int[] trimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    // Method to create substring using charAt
    public static String substringCharAt(String text, int s, int e) {
        String r = "";
        for (int i = s; i < e; i++) r += text.charAt(i);
        return r;
    }

    // Method to compare strings
    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] idx = trimIndexes(text);
        String manual = substringCharAt(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println(compare(manual, builtIn));
        sc.close();
    }
}
