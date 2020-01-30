//Depth-first traversal using recursion

public class DFT{
    
    public void DFT (int v){
        boolean [] visited = new boolean[verticesNumber];
        
        for(int i = 0; i < verticesNumber; i++){
            visited [i] = false;
        }
        recursiveDFT(v, visited);
        
        //some vertices might remain unvisited still
        for (int u = 0; u < verticesNumber; u++){
            if (!visited[u]) recursiveDFT(u,visited);
        }
        System.out.println();
    }
    
    public void recursiveDFT(int v, boolean visited[]){
       visited[v] = true;
        System.out.println(v + " ");
        
        int [] adj = findAdjacencyVertices(v);
        
        for (int u : adj){
            if (!visited[u]) recursiveDFT(u, visited);
        }
    }
}