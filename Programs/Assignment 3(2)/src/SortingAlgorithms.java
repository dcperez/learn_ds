//Panther ID: 4566551

import java.util.Random;

public class SortingAlgorithms {

    //implementation of bubble sort algorithm
    public static void bubbleSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    //implementation of insertion sort algorithm
    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    //implementation of a merge sort algorithm
    public static void mergeSort(int[] list) {
        if (list == null) {
            return;
        }

        if (list.length > 1) {
            int mid = list.length / 2;

            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = list[i];
            }

            int[] right = new int[list.length - mid];
            for (int i = mid; i < list.length; i++) {
                right[i - mid] = list[i];
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    list[k] = left[i];
                    i++;
                } else {
                    list[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < left.length) {
                list[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                list[k] = right[j];
                j++;
                k++;
            }
        }
    }

    //public implementation of a quick sort algorithm
    public static void quickSort(int[] list) {
        quickSort(0, list.length - 1, list);
    }

    //private implementation of a quick sort algorithm
    private static void quickSort(int begin, int end, int[] list) {

        int temp;
        int pivot = findPivotLocation(begin, end);

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
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            } else {
                iterationCompleted = true;
            }
        }
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;
        if (begin < i - 1) {
            quickSort(begin, i - 1, list);
        }

        if (i + 1 < end) {
            quickSort(i + 1, end, list);
        }
    }

    //finds the pivot location
    private static int findPivotLocation(int b, int e) {
        return (b + e) / 2;
    }

    //implementation of a selection sort algorithm
    public static void selectionSort(int[] list) {
        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        }
    }

    //fills the array
    public static void fillArray(int[] list) {
        Random rnd = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = rnd.nextInt(100);
        }
    }

    //prints the array
    public static void printArray(int[] list) {
        int n = list.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
