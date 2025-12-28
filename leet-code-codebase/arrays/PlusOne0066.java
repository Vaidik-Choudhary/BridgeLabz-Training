class PlusOne0066 {

    //Method to add one to the number
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] ans = plusOne(arr);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
