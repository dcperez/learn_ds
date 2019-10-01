public class Prog17_01{
   
    public static void main(String[] args) {
        new Prog17_01();
}
    public Prog17_01(){
        for (int i = 1; i < 100; i++){
            System.out.println("The factorial of " + i + " is " + factorial(i));
        }
    }
    
    public long factorial(int n){
        if (n == 1) return 1;
        else return n*factorial(n-1);
    }
}