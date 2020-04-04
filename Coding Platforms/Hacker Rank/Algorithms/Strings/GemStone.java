import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr, int n) {
        
        int count = 0;
        int[] countChars = new int[26];
        Set<Character> charSet = new HashSet<Character>();

        for(String str : arr){
    
            for (char c : str.toCharArray()) 
                charSet.add(c);

            for (char s : charSet) {
                countChars[s - 'a']++;

                if(countChars[s - 'a'] >= n)
                    count++;
            }
            charSet.clear();      
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) 
            arr[i]  = scanner.nextLine();

        int result = gemstones(arr, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
