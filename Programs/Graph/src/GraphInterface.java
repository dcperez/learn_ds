
interface GraphInterface{
    
    public void addEdge(int v, int w){
        matrix[v][w] = 1;
        matrix[w][v] = 1; //remove for digraph cause youre remove the backward direction
    }
    
    public void removeEdge(int v, int w){
        matrix[v][w] = 0;
        matrix[w][v] = 0; //remove for digraph cause youre remove the backward direction
    }
    
    public int [] findAdjacencyVertices(int v){
        int [] vert = new int[verticesNumber];
        int total = 0;
        
        for (int i = 0; i < verticesNumber; i++){
            if (matrix[v][i] == 1)
            {
                vert[total] = i;
                total++;
            }
        }
        
        return Arrays.copyOf(vert,total);
    }
    
    public String toString(){
        String s = "";
        
        for (int i = 0; i < verticesNumber; i++)
        {
            for (int j = 0; j < verticesNumber; j++);{
            s += matrix [i][j] + " ";
        }
            s += "\n";
        }
        return s;
    }
}
