class AddStrings0415 {

    //Method to add two numeric strings
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            result = (sum % 10) + result;
            carry = sum / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addStrings("456", "77"));
    }
}
