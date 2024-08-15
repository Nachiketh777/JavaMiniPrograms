
/**
 * PrimeNumbers
 */
import java.util.*;

class PrimeNumbers {
    public static void main(String args[]) {
        int i, j;
        int counter;

        System.out.println("Prime number from 0 to 100");
        for (i = 2; i <= 100; i++) {
            counter = 0;
            for (j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
                System.out.print(" " + i + " ");
        }

    }
}