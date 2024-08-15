import java.util.Scanner;

class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int columns = 2;
        int matrix[][] = new int[row][columns];

        // input
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < columns; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // // output
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print("matrix[" + i + "][" + j + "]" + matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Search for an element in matrix and return it's indices

        // input
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < columns; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // System.out.println("Find element");
        // int x = sc.nextInt();

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < columns; j++) {
        // if (matrix[i][j] == x) {
        // System.out.println("Element found at loc " + "(" + i + "," + j + ") " + "of
        // the matrix");
        // }
        // }
        // }

        // print transpose of m x n

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < columns; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }
        // for (int j = 0; j < columns; j++) {
        // for (int i = 0; i < row; i++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        // print 1 2 3 4
        // 2 3 4 5
        // 3 4 5 6
        // 4 5 6 7

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print((i + j) - 1 + " ");
        // }
        // System.out.println();
        // }

        // print spiral matrix
        int n = 5;
        int m = 5;
        int arr[][] = new int[n][m];
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        // int dir = 0;

        // input from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        while (rowStart <= rowEnd && colStart <= colEnd) {

            // left to right
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;

            // top to down
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][rowEnd] + " ");
            }
            colEnd--;

            // right to left
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd--;

            // down to top
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}