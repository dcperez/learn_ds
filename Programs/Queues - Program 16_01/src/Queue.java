public class Queue
{

    public Queue()
    {
        size = 100;
        list = new char[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public Queue(int s)
    {
        size = s;
        list = new char[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public void enqueue(char c)
    {
        if (count == size){   //can also do (!isFull) and flip your if and else
            System.out.println("Queue is full"); 
        }
        else
        back = (back + 1) % size;
        list[back] = c;
        count++;
    }

    public void dequeue()
    {
        if (count == 0)     //can also do (!isEmpty) and flip your if and else
        {
            System.out.println("Queue is empty");
        }
        else
        front = (front + 1) % size;
        count--;
    }

    public char getFront()
    {
        if (!isEmpty()){
        return list[front];
        }
        else {
            System.out.println("Queue is empty!");
        return ' ';
        }
    }

    public boolean isEmpty()
    {
        return count == 0;
    }
    
    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(list[front + i] % size);
    }
    
    public void clear(){    //all values between front and back essentially 
        front = 0;          //become in accessible and will eventuall be overwritten
        back = size - 1;
        count = 0;
    }
    

    private char[] list;
    private int size;
    private int count;
    private int front, back;
}


//full queue: front = (back + 1) % SIZE
//empty queue: front = (back +1) % SIZE
//both have the same condition; need to distinguish
//empty queue: front = (back + 1) & SIZE, count = 0
