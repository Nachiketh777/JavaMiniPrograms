/**
 * ArrayPractice
 */
public class ArrayPractice {

    public static void main(String[] args) {
        // int[] marks = new int[3];
        int marks[] = { 97, 98, 95 };
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        // System.out.println("print " + marks[0]);
        // System.out.println("print1 " + marks[1]);
        // System.out.println("print2 " + marks[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println("marks" + i + " " + marks[i]);
        }
    }
}