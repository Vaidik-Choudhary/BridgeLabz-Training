import java.util.Scanner;

class MatrixOperations {

    // Method to create a random matrix of given size
    public static int[][] createRandomMatrix(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return arr;
    }

    // Method to add two matrices
    public static int[][] addingMatrix(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractingMatrix(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] randomArray1 = createRandomMatrix(row, column);
        int[][] randomArray2 = createRandomMatrix(row, column);

        displayMatrix(randomArray1);

        displayMatrix(randomArray2);

        displayMatrix(addingMatrix(randomArray1, randomArray2));

        displayMatrix(subtractingMatrix(randomArray1, randomArray2));

        displayMatrix(multiplyMatrices(randomArray1, randomArray2));

        sc.close();
    }
}
