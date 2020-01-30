
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
    static void selectionSort(int array[]) {

        // Stores length of array
        int len = array.length;
        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < len - 1; i++) {
            // Stores the current value or i as the minimum index position
            int minIndex = i;
            // Loops till length minus one time
            for (int j = i + 1; j < len; j++) // Checks if the j index position value is less than the minIndex position value
            {
                if (array[j] < array[minIndex]) // Set the j value as the minimum index position
                {
                    minIndex = j;
                }
            }
            // Swapping process
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

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

    public static void quicksort() {
        quicksort(0, length - 1);
    }

    private void quicksort(int begin, int end) {
        int temp;
        int pivot = findPivotLocation(begin, end);
        
        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted) {
            while (list[i] < list[pivot]) {
                i++;
            }
            while ((j >= 0) && (list[pivot] < list[j])) {
                j--;
            }

            if (i < j) {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else {
                iterationCompleted = true;
            }
        }

        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1) {
            quicksort(begin, i - 1);
        }
        if (i + 1 < end) {
            quicksort(i + 1, end);
        }
    }

    private int findPivotLocation(int b, int e) {
        return (b + e) / 2;
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
