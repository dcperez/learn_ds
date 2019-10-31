
public class Main {
    
    public static void main(String[] args) {
        new Main();
    }
    
    Main(){
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.add(5);
        bst.add(10);
        bst.add(4);
        bst.add(17);
        bst.add(3);
        bst.add(7);
        bst.add(5);
        System.out.println(bst);
        
        System.out.println("Minimum: " + bst.getMin());
        System.out.println("The height of the tree is: " + bst.getHeight());
        System.out.println("The total amount of nodes in the tree is " + bst.getCount());
        System.out.println("5 occurs " + bst.getCount(5) + " times");
    }
}
