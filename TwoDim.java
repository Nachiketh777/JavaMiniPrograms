import java.util.Scanner;

/**
 * TwoDim
 */
public class TwoDim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];

        System.out.println("Enter numbers into array");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("i" + i);
                System.out.print("j" + j);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}