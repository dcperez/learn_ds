//Panther ID: 4566551

public class Main{
    
    public static void main(String[] args) {
   new Main();
}
    
    public Main(){
        PriorityQueue n = new PriorityQueue();
        System.out.println("Queue is currently empty? " + n.isEmpty());
        System.out.println("--------------------------------------");
        n.add(1);
        n.add(4);
        n.add(3);
        n.add(2);
        System.out.println("Our queue now has a random ranking between 1-4");
        System.out.println("Currently, our highest ranking is: " + n.max());
        System.out.println("--------------------------------------");
        System.out.println("Lets now remove our highest priority");
        n.removeMax();
        System.out.println("Our new priority ranking is: " + n.max());
        
        
    }
}