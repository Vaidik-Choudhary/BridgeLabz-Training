class ExcelColumnTitle0168 {

    //Method to convert number to column title
    public static String convertToTitle(int n) {
        String res = "";

        while (n > 0) {
            n--;
            res = (char) ('A' + n % 26) + res;
            n = n / 26;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}
