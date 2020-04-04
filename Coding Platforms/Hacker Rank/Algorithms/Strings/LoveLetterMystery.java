import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //very simple and short solution is just to subtract ascii codes of the letters till len/2
    static int theLoveLetterMystery(String s) {
        char[] c = s.toCharArray();
        int count  = 0;
        for(int i=0, j = c.length-1; i < c.length/2; i++, j--)
            count += Math.abs(c[i] - c[j]);
        
        /*  Two pointers;
        int i = 0, j = s.length() - 1;
        while(i < j){
            count += Math.abs(s.charAt(i) - s.charAt(j));
            i++; j--;
        }*/
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
