import java.util.Scanner;

/**
 * findArray
 */
public class findArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter number to find");
        int find = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == find) {
                System.out.println(find + "is found at" + i);
            }
        }

    }
}