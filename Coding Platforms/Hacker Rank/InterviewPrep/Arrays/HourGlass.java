import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass{

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<4; i++){             //for the row
            for(int j=0; j<4; j++){         //for the col
                
                int sum = findTheSum(arr, i, j);
                max = Math.max(sum,max);        //for the max sum
            }
        }
        return max;
    }
    
    static int findTheSum(int[][] a, int r, int c){         //since hourglass means this

        int sum =  (a[r+0][c+0] +    a[r+0][c+1]   + a[r+0][c+2]
                                +    a[r+1][c+1]   +
                    a[r+2][c+0] +    a[r+2][c+1]   + a[r+2][c+2]
               );
        
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
