import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;


public class LarryArray {

    // Complete the larrysArray function below.
    static String larrysArray(int[] A) {
    
        // int temp, i ;
        String ans = "";
        String result = "";
      

        int swaps = getElementSwaps(A);
        if(swaps % 2 == 0){
            ans  = "YES";
        }else{
            ans = "NO";
        }
        //String result = Integer.toString(swaps);
        result = result.concat(ans);
        return result;
    }
    
    public static int getElementSwaps(int[] A) {
          
          int shifts = 0;
          //starting at 2nd element as first element is already sorted.
          //Loop Invariant - left part of the array is already sorted.

          for (int i = 1; i < A.length; i++) {

            int moveMe = A[i];
            int j = i;

            while (j > 0  &&  moveMe < A[j - 1]) {
              
              //Move element
              A[j] = A[j - 1];
              --j;
              ++shifts;   //increase the count as element swap is happend
            }

            A[j] = moveMe;

          }
          return shifts;
    }
    
    
  
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] A = new int[n];

            String[] AItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(AItems[i]);
                A[i] = AItem;
            }
            String result = larrysArray(A);
           // String result = Arrays.toString(a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}







