
public class Main {

    public static void main(String[] args) {
        new Main();

    }

    public Main() {
        final int SIZE = 20;

        //bubble sort on array a
        int[] a = new int[SIZE];
        System.out.println("BUBBLE SORTING");
        System.out.println();
        System.out.println("Unsorted Array a");
        SortingSearchingAlgorithms.fillArray(a);
        SortingSearchingAlgorithms.printArray(a);
        System.out.println();

        System.out.println("Bubble sorted Array a");
        SortingSearchingAlgorithms.bubbleSort(a);
        SortingSearchingAlgorithms.printArray(a);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

        //insertion sort on array b
        int[] b = new int[SIZE];
        System.out.println("INSERTION SORTING");
        System.out.println();
        System.out.println("Unsorted Array b");
        SortingSearchingAlgorithms.fillArray(b);
        SortingSearchingAlgorithms.printArray(b);
        System.out.println();

        System.out.println("Insertion sorted Array b");
        SortingSearchingAlgorithms.insertionSort(b);
        SortingSearchingAlgorithms.printArray(b);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        
        //merge sort on array l1 and l2 into l3
        int [] l1 = new int[SIZE];
        int [] l2 = new int[SIZE];
        int [] l3 = new int[SIZE*2];
        System.out.println("MERGE SORTING");
        System.out.println();
        System.out.println("Sorted List 1 and 2");
        SortingSearchingAlgorithms.fillArray(l1);
        SortingSearchingAlgorithms.insertionSort(l1);
        SortingSearchingAlgorithms.fillArray(l2);
        SortingSearchingAlgorithms.insertionSort(l2);
        SortingSearchingAlgorithms.printArray(l1);
        SortingSearchingAlgorithms.printArray(l2);
        System.out.println();
        
        System.out.println("Merge sorted List 3");
        System.out.println();
        SortingSearchingAlgorithms.mergeSort(l1, l2, l3);
        SortingSearchingAlgorithms.printArray(l3);
         System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        
        //binary search on array s1
        int[] s1 = new int[SIZE];
        System.out.println("BINARY SEARCH");
        SortingSearchingAlgorithms.fillArray(s1);
        SortingSearchingAlgorithms.insertionSort(s1);
        
        //nano time of binary search algorithm
        long startTime = System.nanoTime();
        SortingSearchingAlgorithms.binarySearch(s1, 5);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime);
        SortingSearchingAlgorithms.printArray(s1);
        
        
//        int[] list1 = {1, 7, 3, 6, 2};
//        int[] list2 = {3, 2};
//        unsortedContainment(list1, list2);
    }
    
//    public boolean unsortedContainment(int[] list1, int[] list2) {
//        for (int i = 0; i < list2.length; i++){
//            if (!sequentialSearch(list1, list2[i]))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
}
