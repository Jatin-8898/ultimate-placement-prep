import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherockAndAnagram {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int totalCount = 0;

        for(int i = 0 ; i < s.length(); i++)        // Generate all substrings O(N^2)
        {
            for(int j=i+1 ; j <= s.length(); j++)
            {
                String currentSub = s.substring(i,j);

                char[] chars = currentSub.toCharArray();
                Arrays.sort(chars);
                currentSub = String.valueOf(chars);      //currentSub = new String(chars);
               
                if(map.containsKey(currentSub))         //If sorted substring seen before
                {
                    int value = map.getOrDefault(currentSub, 0);
                    if (value > 0) 
                        totalCount += value;

                    map.put(currentSub, ++value);
                } 
                else 
                    map.put(currentSub, 1);
            }
            //System.out.println(map);
        }
        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        Scanner scanner =  new Scanner(System.in); 
        int q = Integer.parseInt(scanner.nextLine());
    
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
