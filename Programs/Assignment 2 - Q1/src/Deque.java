//Panther ID: 4566551

public class Deque {

    private static final int SIZE = 100;
    private int[] list;
    private int front;
    private int rear;
    private int count;

    //deque default constructor
    public Deque() {
        list = new int[SIZE];
        front = -1;
        rear = 0;
        this.count = count;
    }

    //deque parameterized constructor
    public Deque(int size) {
        list = new int[size];
        front = -1;
        rear = 0;
        this.count = count;
    }

    //returns true if deque is empty
    public boolean isEmpty() {
        return (front == -1);
    }

    //inserts item x on the front end of the queue
    public void push(int x) {
        if (((front == 0 && rear == count - 1) || front == rear + 1)) {
            System.out.println("Deque is full!");
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = count - 1;
        } else {
            front = front - 1;
        }
        list[front] = x;
    }

    //removes the front item from the deque and return it
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Deque Empty");
        }
        int data = list[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            if (front == count - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
        }
        return data;
    }

    //inserts item x on the rear end of the queue
    public void inject(int x) {
        if (((front == 0 && rear == count - 1) || front == rear + 1)) {
            System.out.println(" Dequeu full!");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == count - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }
        list[rear] = x;
    }

    //removes the rear item from the deque and return it
    public int eject() throws Exception {
        if (isEmpty()) {
            throw new Exception("Deque Empty");
        }
        // getting the rear data
        int data = list[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = count - 1;
        } else {
            rear = rear - 1;
        }
        return data;
    }

    //returns the element at the front of the deque
    public int getFront() {
        if (isEmpty()) {
            System.out.println(" Deque empty");
            return -1;
        }
        return list[front];
    }

    //returns the element at the rear of the deque
    public int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Deque empty\n");
            return -1;
        }
        return list[rear];
    }
}
