import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Store Names in an Array
        int size = sc.nextInt();
        sc.nextLine();
        String names[] = new String[size];
        System.out.println("enter names");

        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("name " + i + " is : " + names[i]);

        }
        // For finding maximum and minimun in an Array
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // System.out.println("Enter numbers to an Array");
        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] < min) {
        // min = numbers[i];
        // }
        // if (numbers[i] > max) {
        // max = numbers[i];
        // }
        // }
        // System.out.println("Max" + max);
        // System.out.println("Min" + min);

    }
}
