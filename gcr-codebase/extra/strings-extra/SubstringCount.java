import java.util.Scanner;

class SubstringCount {

    // Method to count substring occurrences in a string
    public static int countOccurrences(String input, String sub) {
        int count = 0;

        for (int i = 0; i <= input.length() - sub.length(); i++) {
            boolean match = true;

            for (int j = 0; j < sub.length(); j++) {
                if (input.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String sub = sc.nextLine();

        System.out.println(countOccurrences(input, sub));

        sc.close();
    }
}
