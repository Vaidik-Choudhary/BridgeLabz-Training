import java.util.Scanner;

class RemoveCharacter {

    // Method to remove a specific character
    public static String removeChar(String input, char remove) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != remove) {
                result += input.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char ch = sc.next().charAt(0);

        System.out.println(removeChar(input, ch));

        sc.close();
    }
}
