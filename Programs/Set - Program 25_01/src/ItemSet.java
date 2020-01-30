
public class ItemSet {
    
    int size;
    private boolean[] isInSet;
    
    public ItemSet(){
       size = 1000;
       
       isInSet = new boolean[size];
       for(int i = 0; i < size; i++)
       {
           isInSet[i] = false;
       }
    }
    
    public boolean search(int i){
        return isInSet[i];
    }
    
    public void add(int ID){
        isInSet[ID] = true;
    }
    
    public void remove(int ID){
        isInSet[ID] = false;
    }
    
    public void union(ItemSet q){   //this = this U q
        for (int i = 0; i < size; i++){         //O(n) complexity
            isInSet [i] = isInSet[i] | q.isInSet[i];
        }
    }
    
    public void intersection(ItemSet q){    //this = this intersection q
            for (int i = 0; i < size; i++){     //O(n) complexity
                isInSet [i] = isInSet[i] & q.isInSet[i];
            }
    }
    
    public void difference(ItemSet q){  //this = this - q
        for (int i = 0; i < size; i++){         //O(n) complexity
                isInSet [i] = isInSet[i] & !q.isInSet[i];
            }
    }
    
    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(isInSet[i] + " ");
        }
    }
}

