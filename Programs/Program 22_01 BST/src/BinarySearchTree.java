
public class BinarySearchTree
{
    public BinarySearchTree()
    {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public void display()
    {
        inorderDisplay(root.getLeftChild());
        System.out.println();
    }
    
    public void preorderDisplay()
    {
        preorderDisplay(root.getLeftChild());
        System.out.println();
    }
    
    public void postorderDisplay(){
        postorderDisplay(root.getLeftChild());
        System.out.println();
    }

    public boolean contains(int x)
    {
        return search(x, root.getLeftChild());
    }

    public void add(int x)
    {
        if (root.getLeftChild() == null)
        {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else
            insert(x, root.getLeftChild());
    }

    public int getMin()
    {
        return getMin(root);
    }
    
    public String toString(){
        
        return toString(root.getLeftChild());
        
    }
    
    public int getHeight()
    {
        return getHeight(root.getLeftChild());
                
    }
    
    public int getCount()
    {
        return getCount(root.getLeftChild());
    }
    
    public int getCount(int x)
    {
        return getCount(x,root.getLeftChild());
    }
    
//    public void remove(int x){
//        root.setLeftChild(remove(x, root.getLeftChild()));
//    }

    private Node root;    //root of the bst; implemented as a dummy node.

    private void inorderDisplay(Node p)
    {
        if (p != null)
        {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getInfo() + " ");
            inorderDisplay(p.getRightChild());
        }
    }
    
    private void preorderDisplay(Node p)
    {
        if (p !=null){
            System.out.print(p.getInfo() + " ");
            preorderDisplay(p.getLeftChild());
            preorderDisplay(p.getRightChild());
        }
    }
    
    private void postorderDisplay(Node p){
        if (p != null){
            postorderDisplay(p.getLeftChild());
            postorderDisplay(p.getRightChild());
            System.out.print(p.getInfo() + " ");
        }
    }
    
    private String toString(Node p){
        if (p != null)
        {
            return toString(p.getLeftChild()) + p.getInfo() + 
                    " " + toString(p.getRightChild());
        }
        else return "";
    }

    private boolean search(int x, Node p)
    {
        if (p == null)
            return false;
        else if (x == p.getInfo())
            return true;
        else if (x < p.getInfo())
            return search(x, p.getLeftChild());
        else
            return search(x, p.getRightChild());
    }

    private void insert(int x, Node p)
    {
        if (x < p.getInfo())
            if (p.getLeftChild() == null)
            {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else
                insert(x, p.getLeftChild());
        else if (p.getRightChild() == null)
        {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else
            insert(x, p.getRightChild());
    }

    private int getMin(Node p)
    {
        if (p.getLeftChild() == null)
            return p.getInfo();
        else
            return getMin(p.getLeftChild());
    }
    
    private int getHeight(Node p)
    {
        if (p == null)
            return -1; //if counting nodes and not edges, use 0
        else
            return 1 + Math.max(getHeight(p.getLeftChild()), 
                                getHeight(p.getRightChild()));
    }
    
    private int getCount(Node p)
    {
        if (p == null)
            return 0;
        else 
            return 1 + getCount(p.getLeftChild()) + 
                                        getCount(p.getRightChild());
    }
    
    private int getCount(int x, Node p)
    {
        if (p == null)
            return 0;
        else if (x == p.getInfo())
            return 1 + getCount(x, p.getRightChild());
        else if (x < p.getInfo())
            return getCount(x, p.getLeftChild());
        else
            return getCount(x, p.getRightChild());
    }
    
//    public Node remove(int x, Node p){
//        
//        if (p != null){
//            if (x < p.getInfo())
//                p.setLeftChild(remove(x, p.getLeftChild()));
//            else
//                if (x > p.getInfo())
//                    p.setRightChild(remove(x, p.getRightChild()));
//                else //x was found
//                {
//                    if (p.getLeftChild() != null && p.getRightChild() != null) //two children node{
//                        int min = getMin(p.getRightChild());
//                    p.getInfo(min);
//                    p.setRightChild(remove(min,p.getRightChild()));
//                }
//            else //one child node
//            p = p.getLeftChild() != null ?
//                    p.getLeftChild() : p.getRightChild();
//        }
//        return p;
//    }
//    else return p;
//    
}
