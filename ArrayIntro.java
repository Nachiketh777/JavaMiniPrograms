import java.util.Scanner;

class ArrayIntro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // int marks[] = new int[3];
        // marks[0] = 99;
        // marks[1] = 93;
        // marks[2] = 92;

        // int marks[] = { 99, 92, 93 };

        // Input size by user
        // int size = sc.nextInt();
        // int marks[] = new int[size];

        // Input fot marks[]
        // for (int i = 0; i < size; i++) {
        // marks[i] = sc.nextInt();
        // }

        // Print output
        // for (int i = 0; i < size; i++) {
        // System.out.println("marks[" + i + "] " + marks[i]);
        // }

        // System.out.println("Enter element you want to find");
        // int x = sc.nextInt();

        // for (int i = 0; i < marks.length; i++) {
        // if (marks[i] == x) {
        // System.out.println(x + " is found at loc " + i);
        // }
        // }

        // Take name as input and diplay using array
        // String name[] = new String[size];

        // // input for name
        // for (int i = 0; i < size; i++) {
        // name[i] = sc.next();
        // }

        // // diplay name
        // for (int i = 0; i < name.length; i++) {
        // System.out.println("Names" + name[i]);
        // }

        // Find minimum and maximum using MIN_VALUE and MAX_VALUE in Java
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < numbers.length-1; i++) {
        // if (numbers[i] < min) {
        // min = numbers[i];
        // }
        // if (numbers[i] > max) {
        // max = numbers[i];
        // }
        // }

        // System.out.println("Maximum " + max);
        // System.out.println("Minimum " + min);

        // Find whether array is in ascending order or not
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // for (int i = 0; i <= arr.length; i++) {
        // if (arr[i] < arr[i + 1]) {
        // System.out.println("Ascending Order");
        // } else {
        // System.out.println("Not Ascending");
        // }
        // }

        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Ascending");
        } else {
            System.out.println("Not Ascending");
        }

    }
}