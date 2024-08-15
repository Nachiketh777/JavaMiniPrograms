import java.util.Scanner;

/**
 * Fibo
 */
public class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }

    }
}