//Panther ID: 4566551

public class PriorityQueue {

    private Node first;
    private Node last;

    //default constructor for priority queue
    public PriorityQueue() {
        first = new Node();
        last = new Node();
        first.setNext(last);
        last.setPrev(first);
    }

    //returns true is queue is empty
    public boolean isEmpty() {
        return (first.getNext() == last);
    }

    //inserts value with priority x
    public void add(int x) {
        Node current = first.getNext();
        Node temp = new Node();
        temp.setInfo(x);
        while (current != last) {
            if (current.getInfo() > x) {
                current = current.getPrev();
                temp.setPrev(current);
                temp.setNext(current.getNext());
                current.getNext().setPrev(temp);
                current.setNext(temp);
                break;
            }
            current = current.getNext();
        }
        if (current == last) {
            current = current.getPrev();
            temp.setPrev(current);
            temp.setNext(current.getNext());
            current.getNext().setPrev(temp);
            current.setNext(temp);
        }
    }

    //returns the highest priority
    public int max() {
        return first.getNext().getInfo();
    }

    //removes the high priority
    public void removeMax() {
        if (first.getNext() == last) {
            System.out.println("Empty Priority Queue");
        } else {
            Node current = first.getNext();
            first.setNext(current.getNext());
            current.getNext().setPrev(first);
        }
    }
}
