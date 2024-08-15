import java.util.Scanner;

/**
 * checkAsce
 */
public class checkAsce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean flag = true;

        int numbers[] = new int[size];
        System.out.println("Enter numbers to an Array");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("Ascend");
        } else {
            System.out.println("Not");
        }
    }
}