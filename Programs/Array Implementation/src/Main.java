
import java.util.ArrayList;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) 
    {
   Random rand = new Random();
   ArrayList list = new ArrayList();
   for (int i=0; i<10; i++){
       list.insert(rand.nextInt(100));
       list.print();
       
    }
    }
}
