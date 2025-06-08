import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class LoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        if(2<=N && N<=20){
            int i = 1;
            do{
                System.out.println(N + " x " + i + " = " + N*i);
                i++;
            } while(1<=i && i<=10);

        }
    }
}