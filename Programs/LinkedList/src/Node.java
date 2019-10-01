//Node class

public class Node {

    private int info;
    private Node next;

    public Node() {
        info = 0;
        next = null;
    }

    public void setInfo(int i) {
        info = i;
    }

    public void setNext(Node L) {
        next = L;
    }

    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }
}
