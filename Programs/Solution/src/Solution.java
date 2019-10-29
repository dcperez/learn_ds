
import java.util.Scanner;

public class Solution {

    public static String solution(String T) {
        for (int i = 0; i < T.length(); i++) {
            if (i == 0 && T.charAt(1) == '4') {
                if (T.charAt(i) == '?') {
                    T = "2";
                }
            }
            if ((i == 1) && (T.charAt(0) == '1')) {
                if (T.charAt(i) == '?') {
                    T = "9";
                }
            }

            if ((i == 3) && (T.charAt(i) == '?')) {
                T = "5";
            }

            if ((i == 4) && (T.charAt(i) == '?')) {
                T = "9";
            }

        }
        return "";
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, write answer to stdout.
        Scanner in = new Scanner(System.in);
        System.out.print(solution(in.next()));
    }
}
