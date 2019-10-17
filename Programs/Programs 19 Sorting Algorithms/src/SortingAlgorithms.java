
import java.util.Random;

public class SortingAlgorithms {

    //implementation of bubble sort algorithm
    //O(n^2)
    public static void bubbleSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (list[j] > list[j + 1]) {
                    //swap list [j] and list [j+1]
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    //implementation of insertion sort algorithm
    //O(n^2)
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }

    //implemenetation of a selection sort algorithm
    //O(n^2)
    //need to implement a minimum and swap method
    /* public static void selectionSort(int[] list){
        for (int i = 0; i < list.length - 1; i++)
        {
            int minPos = minimum(list, i, list.length - 1);
            swap (list, i , minPos);
        }
    }
     */
    public static void mergeSort(int[] list1, int[] list2, int[] list3) {
        int bPtr = 0;
        int ePtr = 0;
        int i = 0;

        while (bPtr != list1.length && ePtr != list2.length) {
            if (list1[bPtr] < list2[ePtr]) {
                list3[i] = list1[bPtr];
                bPtr++;
            } else {
                list3[i] = list2[ePtr];
                ePtr++;
            }

            i++;
        }

        if (bPtr == list1.length) {
            while (ePtr != list2.length) {
                list3[i] = list2[ePtr];
                ePtr++;
                i++;
            }
        }
        if (ePtr == list2.length) {
            while (bPtr != list1.length) {
                list3[i] = list1[bPtr];
                bPtr++;
                i++;
            }
        }
    }

    //fills the array
    public static void fillArray(int[] list) {
        Random rnd = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = rnd.nextInt(20);
        }
    }

    //prints the array
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
