//Panther ID: 4566551

public class Main{
    
    public static void main(String[] args) {
   new Main();
}
    
    public Main(){
         try {
         
         
         Deque deq = new Deque(10);
         System.out.println("Adding to front : 1");
         deq.push(1);
         System.out.println("Adding to rear : 2");
         deq.inject(2);
         System.out.println("Adding to rear : 3");
         deq.inject(3);
         System.out.println("------------------------");
         System.out.println("Front data = " + deq.getFront());
         System.out.println("Rear data = " + deq.getRear());
             System.out.println("------------------------");
         System.out.println("Removing from rear : " + deq.eject());
         System.out.println("Removing from front: " + deq.pop());
         System.out.println("Removing from front/rear : " + deq.pop());
         System.out.println("Deque is now empty? " + deq.isEmpty());
         
      }
      catch (Exception e){
         System.out.println(e.getMessage());
      }
   }
}
    
