import java.util.Scanner;

class CompareStrings {

    // Method to compare two strings lexicographicaly
    public static int compareStrings(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s2 + " comes before " + s1);
        else
            System.out.println("Both strings are equal");

        sc.close();
    }
}
