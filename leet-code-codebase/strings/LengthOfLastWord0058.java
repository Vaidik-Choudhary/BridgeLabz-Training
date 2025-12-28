class LengthOfLastWord0058 {

    //Method to find length of last word
    public static int lengthOfLastWord(String s) {
        int len = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else if (len > 0) {
                break;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
