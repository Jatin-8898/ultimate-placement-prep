import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {

        int count = 0;    
        int[] chars = new int[26];
        for (char c1 : s1.toCharArray())  
            chars[c1 - 'a']++; 

        for (char c2 : s2.toCharArray()) 
            chars[c2 - 'a']--; 
    
        for(int i: chars) 
            count += Math.abs(i);

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int result = makingAnagrams(s1, s2);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
