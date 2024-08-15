import java.util.Scanner;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int diamond = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == n || i == 1 || j == 1 || j == m) {
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
        //
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // int sum = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(sum + " ");
        // sum = sum + 1;
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= n - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 2; j--) {
        // System.out.print(j);
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == m || j == m || j == 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= diamond; i++) {
        // for (int j = 1; j <= diamond - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = diamond; i >= 1; i--) {
        // for (int j = 1; j <= diamond - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int j = 1; j <= 2 * (m - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = m; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int j = 1; j <= 2 * (m - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= m; i++) {
        // for (int j = 1; j <= m - i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("printing" + str);

    }
}