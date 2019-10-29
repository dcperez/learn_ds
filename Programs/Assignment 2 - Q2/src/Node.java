//Panther ID: 4566551

public class Node{
    
    private int info;
    private Node next;
    
    //default constructor of node
    public Node(){
        info = 0;
        next = null;
    }
    
    //sets data for node
    public void setInfo(int i){
         this.info = i;
    }
    
    //sets reference of next node
    public void setNext(Node L){
        this.next = L;
    }
    
    //gets data for node
    public int getInfo(){
         return info;
    }
    
    //gets reference to next node
    public Node getNext(){
        return next;
    }
}