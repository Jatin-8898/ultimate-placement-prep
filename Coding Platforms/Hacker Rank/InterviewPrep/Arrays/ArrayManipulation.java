import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.

For example, the length of your array of zeros . Your list of queries is as follows:

    a b k
    1 5 3
    4 8 7
    6 9 1
Add the values of  between the indices  and  inclusive:

index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]

	The largest value is 10 after all operations are performed.
*/


public class ArrayManipulation {

	/*you are adding sum to a[p] and adding negative sum at a[q+1]. 
	which make sure that when you add element from a[p] to a[q] sum is added only once and it should be subtracted at a[q+1] as this sum span from p to q only. 
	Rest array element are either 0 or some other input sum. max of addition will be output.
	*/

    public static void main(String[] args) throws IOException {
      
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        long [] array = new long[N + 1]; //Create arr of size n+1
        
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            
            array[a-1] += k;     //since arr index starts with 0 and we r adding k
            System.out.println("ARR[a-1] "+array[a-1]);
            
            array[b]   = array[b] - k;   //here subtract the element k 
            System.out.println("ARR: "+ array[b]);
        }
        scan.close();
        
        
      
        long sum = 0,
             max = 0;

        for (int i = 0; i < N; i++) {
            sum += array[i];
            System.out.println("SUM "+sum);
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
   
    }
        
}
