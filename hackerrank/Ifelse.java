import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Ifelse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N <= 20 && N >= 6)
        {
            System.out.println("Weird");
    } else if(N % 2 == 1) {
        System.out.println("Weird");
    } else {
        System.out.println("Not Weird");
        }
        scanner.close();
    }
}
