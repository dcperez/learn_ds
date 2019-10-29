public class Prog17_02{
   
    public static void main(String[] args) {
   new Prog17_02();
}  
    
    public Prog17_02(){
        System.out.println(recurrence(0));
}
    
    public long recurrence(int n){
        if (n == 0) return 5;
        else{
        return 2*recurrence(n-1)+3;
        }
    }
}

    //  n | 0 |  1 |  2  | 3
    // an | 5 | 13 | 29  | 61
    // an = 2an-1 + 3 , n > 0
    //a0 = 5