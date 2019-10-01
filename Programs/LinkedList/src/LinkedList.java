//Linked list class

public class LinkedList {

    private Node first;
    private Node p;

    public LinkedList() {
        first = new Node();
    }

    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    public void display() {

        //get the reference to first
        Node current = first.getNext();

        while (current != null) {
            //process the current item
            System.out.print(current.getInfo() + " ");

            //advance current
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean search(int x) {

        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo() == x) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    
    public void insert(int x) {

        Node newListNode = new Node();

        newListNode.setInfo(x);
        newListNode.setNext(first.getNext());

        first.setNext(newListNode);

    }

    public void insert(int x, int loc) {
        if (loc >= length()) {
            System.out.println("Incorrect location!");
        } else {
            Node current = first;
            for (int i = 0; i < loc; i++) {
                current = current.getNext();
            }

            p.setInfo(x);
            p.setNext(current.getNext());
            current.setNext(p);
        }
    }
   
    public void append(int x){
       Node current = first;
       while(current.getNext() != null){
           current = current.getNext();
          }
       Node newNode = new Node();
       newNode.setInfo(x);
       current.setNext(newNode);
        
      
    }

    public void remove(int x) {

        Node old = first.getNext();
        p = first;

        //finding the reference to the node before the
        //one to be deleted
        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo() == x) {
                found = true;
            } else {
                p = old;
                old = p.getNext();
            }

        }
        //if x is in the list remove it
        if (found) {
            p.setNext(old.getNext());
        }
    }

    public void removeItemAt(int loc) {
        if (loc >= length()) {
            System.out.println("Incorrect location!");
        } else {
            Node current = first;
            for (int i = 0; i < loc; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
    }

    public int length() {
        Node current = first.getNext();
        int count = 0;
        while (current != null) {
            //process the current item
            current.getInfo();
            count++;
            //advance current
            current = current.getNext();
        }
        return count;
    }
}
