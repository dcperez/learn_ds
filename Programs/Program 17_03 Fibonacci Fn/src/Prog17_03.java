import java.util.*;

public class Prog17_03{
   
    
    public static void main(String[] args) {
   new Prog17_03();
}
    
    public Prog17_03(){
        /*System.out.println("Select your option");
        System.out.println("1. Pick a fib");
        System.out.println("2. Fib of first 100 values");
        
        Scanner sn = new Scanner(System.in);
        int option = sc.nextInt();
        
        Case(option){
        
        1: System.out.println("Enter a value:" );
            System.out.println(fib());
    }*/
        for (int i = 0; i < 100; i++)
            System.out.println("The fibonacci of " + i + " is: " + fib(i));
    }
    
    public int fib(int n){
        if (n == 0 || n == 1) return n;
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}

//  n | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7
// fn | 0 | 1 | 1 | 2 | 3 | 5 | 8 | 13