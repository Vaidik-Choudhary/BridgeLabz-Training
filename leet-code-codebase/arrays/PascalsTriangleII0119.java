class PascalsTriangleII0119 {

    //Method to print row of Pascals Triangle
    public static void getRow(int row) {
        int[][] triangle = new int[row + 1][row + 1];

        for (int i = 0; i <= row; i++) {
            triangle[i][0] = 1;

            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        for (int i = 0; i <= row; i++) {
            System.out.print(triangle[row][i] + " ");
        }
    }

    public static void main(String[] args) {
        getRow(4);
    }
}
