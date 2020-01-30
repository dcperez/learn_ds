
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
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

//        for (int i = 1; i <= 1001; i++) {
//
//            int list[] = new int[10 + rnd.nextInt(200)];
//            int list[] = new int[100 * i];
//            
//            SortingAlgorithms algo = new SortingAlgorithms();
//
//            algo.fillArray(list);
//
//            output.print(list.length + ",");

            int [] a, b, c, d, e;
            for (int i = 100; i < 10000; i += 100){
                a = new int[i];
                SortingAlgorithms.fillArray(a);
                b = Arrays.copyOf(a, a.length);
                c = Arrays.copyOf(a, a.length);
                d = Arrays.copyOf(a, a.length);
                e = Arrays.copyOf(a, a.length);
                
                output.print(i + ",");
            

            long startTime = System.nanoTime();
            SortingAlgorithms.bubbleSort(a);
            long endTime = System.nanoTime();
            long durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            SortingAlgorithms.insertionSort(b);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            SortingAlgorithms.selectionSort(e);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            startTime = System.nanoTime();
            SortingAlgorithms.quickSort(d);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");
            
            startTime = System.nanoTime();
            SortingAlgorithms.mergeSort(c);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            output.println();
            output.flush();
            System.out.println(i);
            
            }
        }
    }

