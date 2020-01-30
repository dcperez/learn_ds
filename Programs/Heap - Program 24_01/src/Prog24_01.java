
public class Prog24_01 {

    public static void main(String[] args) {
        new Prog24_01();
    }

    public Prog24_01() {

    }

    public void heapsort(int[] arr, int[] sortedArray) {
        Heap heap = new Heap();

        //adds all elements of arr to heap
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        //adds elements of the heap to the output array
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = heap.min();
            heap.removeMin();
        }
    }
}
