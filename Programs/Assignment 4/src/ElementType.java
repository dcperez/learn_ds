//Panther ID: 4566551

public class ElementType {

    public String identifier;
    public String access;

    public ElementType() {
        String identifier;
        String access;
    }

    public ElementType(String i, String a) {
       identifier = i;
       access = a;
    }

    public String toString() {
        return "[" + identifier + " | " + access + "]";
    }

}
