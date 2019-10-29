public class Prog18_01{
    
    public static void main(String[] args) {
   new Prog18_01();
}
    
    public Prog18_01(){
         Date current = new Date();
       long startTime = current.getTime();
       // the code to be timed goes here
       
       current = new Date();
       long stopTime = current.getTime();
       
       //elapsedTime: milliseconds
       long elapsedTime = stopTime - startTime;
       
        System.out.println("The section of code lasted " + elapsedTime + "ms");
    
    }
    
    public int minimum(int a[], int n){
      
}