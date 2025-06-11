import java.util.*;

public class JavaEOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(n + " " + s);
            n++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
