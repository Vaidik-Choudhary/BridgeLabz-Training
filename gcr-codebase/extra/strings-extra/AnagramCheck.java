import java.util.Scanner;

class AnagramCheck {

    // Method to check whether two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        int[] freq = new int[256];

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1, s2));

        sc.close();
    }
}
