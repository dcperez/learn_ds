//Panther ID: 4566551

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        String outputFilename = "output.csv";

        PrintWriter output = null;

        try {

            output = new PrintWriter(new FileWriter(outputFilename));

        } catch (IOException ex) {

            System.exit(1);

        }

        Random rnd = new Random();

        for (int count = 1; count <= 100000; count++) {
            int list[] = new int[10 + rnd.nextInt(200)];
            SortingAlgorithms obj = new SortingAlgorithms();

            obj.fillArray(list);

            output.print(list.length + ",");

            int a[], b[], c[], d[], e[];
            a = b = c = d = e = list;

            long startTime = System.nanoTime();
            obj.bubbleSort(a);
            long endTime = System.nanoTime();
            long durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            obj.insertionSort(b);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            obj.mergeSort(c, d, e);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            obj.quicksort();
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            obj.selectionSort(e);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

//
//       for (int i = 0; i < n; i++)
//
//       {
//
//       output.println(i + "," + rnd.nextInt(10) + "," +
//
//       rnd.nextInt(100) + "," + rnd.nextInt(1000));
//
//       }
            output.println();
            output.flush();
            System.out.println(count);
        }
    }
}
