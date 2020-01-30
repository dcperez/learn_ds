import java.util.*;

public class Graph implements GraphInterface{
    
    private int verticesNumber;
    private int [][] matrix;
    
    public Graph(){
        verticesNumber = 5;
        matrix = new int[verticesNumber][verticesNumber];
    }
    
    public Graph(int v){
        verticesNumber = v;
        matrix = new int[verticesNumber][verticesNumber];
    }
}
