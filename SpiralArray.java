import java.util.Scanner;

/**
 * SpiralArray
 */
public class SpiralArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int down = row - 1;
        int left = 0;
        int right = col - 1;
        int dir = 0;

        while (top <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= down; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(arr[down][i] + " ");
            }
            down--;
            for (int i = down; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }

    }
}