class NumberOfSegments0434 {

    //Method to count the number of segments in a string
    public static int countSegments(String s) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (s.charAt(i) == ' ') {
                inWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
}
