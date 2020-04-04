import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Triplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {     //Eg arr = [1 2 2 4]    r = 2

        Map<Long, Long> potential = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            
            long a = arr.get(i);
            long key = a / r;
            
            if (counter.containsKey(key) && a % r == 0) {
                count += counter.get(key);
                System.out.println(count + " count ");
            }
            
            if (potential.containsKey(key) && a % r == 0) {
                long c = potential.get(key);
                counter.put(a, counter.getOrDefault(a, 0L) + c);
                System.out.println("Present in Potential, ADDED IN COUNTER MAP " + counter);
            }

            // Every number can be the start of a triplet.
            potential.put(a, potential.getOrDefault(a, 0L) + 1); 
            System.out.println("Added in Potential " + potential);
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(nr[0]);
        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);
        bufferedReader.close();
        
    }
}
