
public class Main {
    
    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
       ItemSet a = new ItemSet();
       ItemSet b = new ItemSet();
       
       a.add(1);
       a.add(3);
       b.add(3);
       b.add(5);
       b.add(12);
       
       a.union(b); // a = a U b
       a.print();
       
       
    }
}
