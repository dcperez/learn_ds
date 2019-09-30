//Panther ID: 4566551

public class Main{
    
    public static void main(String[] args) {
       ArrayBag bag = new ArrayBag();
       System.out.println("Is the bag empty? " + bag.isEmpty() + "\n");
       System.out.println("--------------------------------------------------");
       System.out.println();
       
        System.out.println("The bag now contains:");
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Orange");
        bag.add("Apple");
        bag.add("Kiwi");
        bag.print();
        System.out.println("-------------------------------------------------");
        System.out.println();
        
        System.out.println("How many \"Apples\" are in the bag? " + bag.count("Apple") + "\n");
        
        
        System.out.println("-------------------------------------------------");
        System.out.println();
        
       
        bag.remove("Banana");
        
        System.out.println("We no longer need the \"Banana\", our updated bag contains:");
        bag.print();
        
        System.out.println("Is the bag empty? " + bag.isEmpty()+ "\n");
}
}