
import java.util.*;

public class Tester {

    public static void main(String[] args) {

        new Tester();
    }

    public Tester() {
        Random rnd = new Random();
        LinkedList<Integer> list = new LinkedList<>(); //list creation

        int total = 10;
        for (int i = 0; i < total; i++) {
            list.add((rnd.nextInt(total + 1)));
        }

        System.out.println(list);

        Iterator<Integer> it;

        for (int i = 0; i <= total; i++) {
            it = list.iterator();
            int ctr = 0;
            while (it.hasNext()) {
                if (i == it.next()) {
                    ctr++;
                }
            }
            System.out.println(i + ": " + ctr + " times");
        }
    }
}
