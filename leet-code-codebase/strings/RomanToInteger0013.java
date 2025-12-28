class RomanToInteger0013 {

    //Method to convert roman number to integer
    public static int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = value(s.charAt(i));

            if (i + 1 < s.length() && val < value(s.charAt(i + 1))) {
                sum = sum - val;
            } else {
                sum = sum + val;
            }
        }
        return sum;
    }

    static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMIV"));
    }
}
