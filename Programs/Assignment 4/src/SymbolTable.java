//Panther ID: 4566551

public class SymbolTable {

    private LinkedList[] table;
    private final int TABLESIZE = 13;
    private final int HASHCONSTANT = 37;

    public SymbolTable() {
        table = new LinkedList [TABLESIZE];
        for( int i = 0; i < TABLESIZE; i++){
            LinkedList T2 = new LinkedList();
            table[i] = T2;
        }
    }

    private int hash(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal = HASHCONSTANT * hashVal + key.charAt(i);

        }
        hashVal %= TABLESIZE;
        if (hashVal < 0) {
            hashVal += TABLESIZE;
        }
        return hashVal;
    }

    public void add(ElementType e) {
        int pos = hash(e.identifier);
        table[pos].add(e);
    }

    public void remove(String key) {
        int pos = hash(key);
        table[pos].remove(key);
    }

    public boolean search(String key) {
        int pos = hash(key);
        return table[pos].search(key);
    }

    public String toString()
    {
        String str = "";
        
        for(int i=0; i<table.length; i++)
        {
            str = String.format(str + "%2d: ", i);
                        
            LinkedList bucket = table[i];
            if (!bucket.isEmpty())
                str += bucket.toString() + "\n";
            else
                str += "->\n";
        }
        
        return str;
    }

}
