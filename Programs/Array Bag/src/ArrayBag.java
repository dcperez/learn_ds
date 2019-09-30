//Panther ID: 4566551

public class ArrayBag implements Bag {

    private static final int SIZE = 10;
    private String[] bag = new String[SIZE];
    private int length;

    //ArrayBag constructor
    public ArrayBag() {
        length = 0;
    }

    //returns true if bag is empty
    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    //prints the contents of the bag
    @Override
    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < length; i++) {
                System.out.println(bag[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Bag is empty");
        }
    }

    //adds an item to the bag
    @Override
    public void add(String s) {
        if (length == SIZE) {
            System.out.println("Insertion Error: Bag is full");
        } else {
            bag[length] = s;
            length++;
        }
    }

    //removes all occasions of the entered item
    @Override
    public void remove(String s) {
        String temp;
        for (int i = 0; i < length; i++) {
            if (bag[i].equals(s)) {
                temp = bag[0];
                //moves all elements to the left by 1
                for (int j = i; j < length - 1; j++) {
                    bag[j] = bag[j + 1];
                }
                bag[length - 1] = temp;
                length--;
            }
        }
    }

    //counts the amount of times the item entered is repeated
    @Override
    public int count(String s) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s.equals(bag[i])) {
                count++;
            }
        }
        return count;
    }
}
