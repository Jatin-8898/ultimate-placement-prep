import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndValidStrings {

    // Complete the isValid function below.
    static boolean isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : s.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        //System.out.println(map);

        TreeMap<Integer, Integer> countMap = new TreeMap<>();   //This will keep Sorted
        for (int count : map.values()) {
            countMap.put(count, countMap.getOrDefault(count, 0) + 1);
        }
        //System.out.println("HERE :"+countMap);
        //System.out.println(countMap.firstKey() + " "+ countMap.lastKey());

        return countMap.size() == 1 || 
            (countMap.size() == 2     && (
                (countMap.firstKey() + 1 ==countMap.lastKey() && countMap.get(countMap.lastKey()) == 1)
                || (countMap.firstKey() == 1 && countMap.get(countMap.firstKey()) == 1)));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
        String s = scanner.nextLine();
        if (isValid(s))
            System.out.println("YES");
        else
            System.out.println("NO");
        scanner.close();
    }
}
