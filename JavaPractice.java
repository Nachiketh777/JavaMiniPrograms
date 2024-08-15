import java.lang.foreign.Arena;
import java.lang.runtime.SwitchBootstraps;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

class JavaPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of the Circle
        // System.out.println("Enter radius of the circle");
        // int radius = sc.nextInt();
        // double pi = 3.14;
        // double area = pi * (radius * radius);
        // System.out.println("Area of the circle is " + area);

        // Print table of a user input number
        // int number = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(number + "x" + i + "=" + number * i);
        // }

        // Basic if-else
        // int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Minor");
        // }

        // Check Odd or Even
        // int number = sc.nextInt();
        // if (number % 2 == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }

        // Value Greater/Lesser
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("a is greater");
        // } else if (a < b) {
        // System.out.println("b is greater");
        // } else {
        // System.out.println("both are equal");
        // }

        // Using Switch statement

        // int button = sc.nextInt();
        // switch (button) {
        // case 1:
        // System.out.println("Hi");
        // break;
        // case 2:
        // System.out.println("Hey");
        // break;
        // case 3:
        // System.out.println("Hello");
        // break;
        // default:
        // System.out.println("Invalid button press");
        // break;
        // }

        // Calculator using Switch Statements
        // int a = 4;
        // int b = 5;

        // int choice = sc.nextInt();

        // switch (choice) {
        // case 1:
        // int add = a + b;
        // System.out.print("add" + add);
        // break;
        // case 2:
        // int sub = a - b;
        // System.out.print("sub" + sub);
        // break;
        // case 3:
        // int mul = a * b;
        // System.out.print("mul" + mul);
        // break;
        // case 4:
        // int div = a / b;
        // System.out.print("div" + div);
        // break;
        // case 5:
        // int mod = a % b;
        // System.out.print("mod" + mod);
        // break;
        // default:
        // System.out.println("Invalid choice");
        // break;
        // }

        // Print name of month based on number of the month(Switch)

        // int noOfMonth = sc.nextInt();

        // switch (noOfMonth) {
        // case 1:
        // System.out.println(noOfMonth + "january");
        // break;
        // case 2:
        // System.out.println(noOfMonth + "febraury");
        // break;
        // case 3:
        // System.out.println(noOfMonth + "march");
        // break;
        // case 4:
        // System.out.println(noOfMonth + "april");
        // break;
        // case 5:
        // System.out.println(noOfMonth + "may");
        // break;
        // case 6:
        // System.out.println(noOfMonth + "june");
        // break;
        // case 7:
        // System.out.println(noOfMonth + "july");
        // break;
        // case 8:
        // System.out.println(noOfMonth + "august");
        // break;
        // case 9:
        // System.out.println(noOfMonth + "september");
        // break;
        // case 10:
        // System.out.println(noOfMonth + "october");
        // break;
        // case 11:
        // System.out.println(noOfMonth + "november");
        // break;
        // case 12:
        // System.out.println(noOfMonth + "december");
        // break;

        // default:
        // System.out.println(noOfMonth + "Invalid choice");
        // break;
        // }

        // print all number till n

        // int n = sc.nextInt();
        // for (int i = 0; i <= n; i++) {
        // System.out.println(i);
        // }

        // print all even number n
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0)
        // System.out.print(i + " ");
        // }

        // print sum of n numbers
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // Marks menu driven do while
        // int input;
        // do {
        // int marks = sc.nextInt();
        // if (marks > 90) {
        // System.out.println("V V Good");
        // } else if (marks >= 60 && marks <= 89) {
        // System.out.println("Good");
        // } else {
        // System.out.println("Impressive");
        // }
        // System.out.println("Do you want to continues yes(1) or no(press any key)");
        // input = sc.nextInt();

        // } while (input == 1);

        // Check for prime numbers
        // int num = sc.nextInt();
        // for (int i = 2; i <= num; i++) {
        // boolean isPrime = true;
        // for (int j = 2; j <= i / 2; j++) {
        // if (i % j == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.println(i);
        // }
        // }

    }
}