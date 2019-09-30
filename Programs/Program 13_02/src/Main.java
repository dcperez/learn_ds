import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        LinkedList intList = new LinkedList();
        
        System.out.println("List of numbers before list creation:");
        
      for (int i = 0; i< 10; i++){
          int info = (int)(Math.random()*10);
          System.out.println(info + " ");
          
          intList.add(info); //not insert because its add in the interface
          
      }
    }
}