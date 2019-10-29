
import java.util.*;
import java.util.Arrays;

public class Prog08_02 {

    public static void main(String[] args) {
        int SIZE = 10;
        int[] a = new int[SIZE];

        //Fill the array with random numbers
        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100);
        }

        for (int i = 0; i <= a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        //Min Max and Average
        int sum = 0, min = a[0], max = a[0];
        for (int i = 0; i <= a.length; i++) {
            sum = sum + a[i];

            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }

        double ave = sum / 10;

        System.out.println("\n Min: " + min + ", ave: " + ", max: " + max);

        //expanding the array - variant 3
        SIZE = 2 * SIZE;
        a = Arrays.copyOf(a, SIZE);

        System.out.println("\nAdding a new element: ");
        a[SIZE / 2] = 100;

        for (int i = 0; i < SIZE / 2 + 1; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

}
