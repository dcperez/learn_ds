public class Prog15_03 
{
    
    public static void main(String[] args) {
        new Prog15_03();
}
    public Prog15_03() {
        Stack s = new Stack();
        for (int i = 5; i >0;i--){
            System.out.println(i);
            s.push((char) i);
        }
    }
    
    public void print(Stack s) {
        Stack temp = new Stack();
        
        //Copying the content of s into temp
        while (!s.isEmpty()) {
        temp.push(s.peek());
        s.pop();
    }
        
        //Print temp and inserting items back in s
        while (!temp.isEmpty()) {
            System.out.println(temp.peek() + " ");
            s.push(temp.peek());
            temp.pop();
        }
        System.out.println();
    }
}


