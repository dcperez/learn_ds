
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
        bst.display();
    }
}
