//Panther ID: 4566551

public class LinkedList {

    private Node first;
    private Node p;

    public LinkedList() {
        first = new Node();
    }

    public void add(ElementType x) {

        Node newListNode = new Node();

        newListNode.setInfo(x);
        newListNode.setNext(first.getNext());

        first.setNext(newListNode);

    }

    public void remove(String x) {

        Node old = first.getNext();
        p = first;

        //finding the reference to the node before the
        //one to be deleted
        boolean found = false;
        while (old != null && !found) {
            if (x.equals(old.getInfo().identifier)) {
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

    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    public boolean search(String x) {

        Node current = first.getNext();

        while (current != null) {
            if (x.equals(current.getInfo().identifier)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    public String toString() {
        Node current = first.getNext();

        String str = "";
        while (current != null) {
            str += current.getInfo() + " -> ";
            current = current.getNext();
        }
        
        return str;
    }

}
