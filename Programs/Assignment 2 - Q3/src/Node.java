//Panther ID: 4566551

public class Node{
    
    private int info;
    private Node next;
    private Node prev;
    
    //default contstructr of node
    public Node(){
        info = 0;
        next = null;
        prev = null;
    }
    
    //sets data for node
    public void setInfo(int i){
        info = i;
    }
    
    //sets reference of next node
    public void setNext(Node p){
         next = p;
    }
    
    //sets reference of previous node
    public void setPrev(Node p){
        prev = p;
    }
    
    //gets data of node
    public int getInfo(){
        return info;
    }
    
    
    //get reference of next node
    public Node getNext(){
        return next;
    }
    
    //get reference of previous node
    public Node getPrev(){
        return prev;
    }
}