//Panther ID: 4566551

public class Main{
    
    public static void main(String[] args) {
   new Main();
   
}
    //1, 2, 3, 4, 5 are pushed into a stack
    //5 and 4 are then popped out of the stack
    public Main(){
        Stack s1 = new Stack();
        
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.pop();
        s1.pop();
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}