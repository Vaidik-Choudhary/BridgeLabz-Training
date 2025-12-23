import java.util.Scanner;

class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(removeDuplicates(input));

        sc.close();
    }
}
