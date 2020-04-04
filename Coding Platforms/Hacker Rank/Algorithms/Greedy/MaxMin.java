import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*  So, to solve this problem, we need to:
        1) sort
        2) find the max-min of each subgroup
        3) compare the result of each subgroup with the fairness
    */
    static int maxMin(int k, int[] a) {
        int n = a.length;
        int unfairness = Integer.MAX_VALUE;  
        Arrays.sort(a);        

        for (int i = 0; i < (n - k + 1); i++){
            int temp = a[i+k-1]  - a[i];
            if (temp < unfairness) 
                unfairness = temp;
        }
        return unfairness;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
