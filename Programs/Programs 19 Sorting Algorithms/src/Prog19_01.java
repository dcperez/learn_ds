
public class Prog19_01 {

    public static void main(String[] args) {
        new Prog19_01();

    }

    public Prog19_01() {
        final int SIZE = 20;

        //bubble sort on array a
        int[] a = new int[SIZE];
        System.out.println("BUBBLE SORTING");
        System.out.println();
        System.out.println("Unsorted Array a");
        SortingAlgorithms.fillArray(a);
        SortingAlgorithms.printArray(a);
        System.out.println();

        System.out.println("Bubble sorted Array a");
        SortingAlgorithms.bubbleSort(a);
        SortingAlgorithms.printArray(a);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

        //insertion sort on array b
        int[] b = new int[SIZE];
        System.out.println("INSERTION SORTING");
        System.out.println();
        System.out.println("Unsorted Array b");
        SortingAlgorithms.fillArray(b);
        SortingAlgorithms.printArray(b);
        System.out.println();

        System.out.println("Insertion sorted Array b");
        SortingAlgorithms.insertionSort(b);
        SortingAlgorithms.printArray(b);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        
        //merge sort on array b and e
        int [] l1 = new int[SIZE];
        int [] l2 = new int[SIZE];
        int [] l3 = new int[SIZE*2];
        System.out.println("MERGE SORTING");
        System.out.println();
        System.out.println("Sorted List 1 and 2");
        SortingAlgorithms.fillArray(l1);
        SortingAlgorithms.insertionSort(l1);
        SortingAlgorithms.fillArray(l2);
        SortingAlgorithms.insertionSort(l2);
        SortingAlgorithms.printArray(l1);
        SortingAlgorithms.printArray(l2);
        System.out.println();
        
        System.out.println("Merge sorted List 3");
        System.out.println();
        SortingAlgorithms.mergeSort(l1, l2, l3);
        SortingAlgorithms.printArray(l3);
        
    }
}
