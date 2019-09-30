
import java.util.*;

public class ArrayList {

    private int length;
    private static final int SIZE = 10;

    //array to store the list items
    private int[] list = new int[SIZE];

    //creates an empty list
    public ArrayList() {
        length = 0;
    }

    //print traverses the array to display the elemtns in the list
    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }

    //adds an element x at the end of the list
    public void insert(int x) {
        if (length == SIZE) {
            System.out.println("Insertion Error: list is full");
        } else {
            list[length] = x;
            length++;
        }
    }

    //returns true if there are not elements inserted
    public boolean isEmpty() {
        return length == 0;
    }

    //function removes element at location pos
    public void removeItemAt(int pos) {
        for (int i = pos; i < length - 1; i++) {
            list[i] = list[i + 1];
        }
        length--;
    }
}
