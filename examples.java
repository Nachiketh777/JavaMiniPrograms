// import java.util.Scanner;

// /**
//  * examples
//  */
// public class examples {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // for (int i = 1; i <= 10; i++) {
//         // if (i % 2 == 0)
//         // System.out.print(i + " ");
//         // }
//         for (;;) {
//             System.out.println("Apna College");
//         }

//     }
// }

import java.util.Scanner;

class examples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}