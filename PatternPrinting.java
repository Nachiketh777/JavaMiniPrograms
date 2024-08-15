/**
 * PatternPrinting
 */
public class PatternPrinting {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= b; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= b; j++) {
        // if (i == 1 || i == a || j == 1 || j == b) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = a; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // for (int i = a; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int sum = 0;
        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // sum++;
        // System.out.print(sum + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= a; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
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

        // Butterfly pattern
        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = a; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Rhombus
        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= a; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 7; i++) {
        // for (int k = 1; k <= 7 - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (i % 2 != 0) {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }
        // System.out.println();
        // for (int i = 7; i >= 1; i--) {
        // for (int k = 1; k <= 7 - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (i % 2 != 0) {
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // Hollow butterfly
        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == a || i == 1 || j == i) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int k = 1; k <= 2 * (a - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == a || i == 1 || j == i) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = a; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == a || i == 1 || j == i) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int k = 1; k <= 2 * (a - i); k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == a || i == 1 || j == i) {

        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Hollow Rohmbus
        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= a; j++) {
        // if (i == 1 || i == a || j == a || j == 1) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Number Triangle
        // for (int i = 1; i <= a; i++) {
        // for (int k = 1; k <= a - i; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Inverted Number Half pyramid
        // int num = 1;
        // for (int i = a; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num);
        // }
        // num++;
        // System.out.println();
        // }

        // Print Pascal's Triangle
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();

        }

    }
}