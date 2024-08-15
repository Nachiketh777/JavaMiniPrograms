import java.util.Scanner;

/**
 * ExampleJ
 */
public class ExampleJ {

    public static int factNum(int n) {

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        return factorial;

    }

    public static void main(String[] args) {

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // int mn = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(mn + " ");
        // mn++;
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int mn = (i + j) % 2;
        // System.out.print(mn);
        // }
        // System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        // String name2 = sc.next();
        int n = sc.nextInt();
        int fact = factNum(n);
        System.out.println(fact);

        sc.close();
    }
}