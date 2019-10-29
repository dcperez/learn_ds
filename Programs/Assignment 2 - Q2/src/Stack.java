//Panther ID: 4566551

public class Stack{
   
    private Node first;
    
    //default constructor for linked list implemented stack
    public Stack(){
        first = null;
    }
    
    //returns true if stack is empty
    public boolean isEmpty(){
        return first == null;
    }
    
    //pushes value x into stack
    public void push(int x){
        Node n = new Node();
        n.setInfo(x);
        n.setNext(first);
        first = n;
    }
   
    //pops value on top of stack
    public void pop(){
        first = first.getNext();
    }
    
    //peek at value on top of stack
    public int peek(){
        return first.getInfo();
    }
}