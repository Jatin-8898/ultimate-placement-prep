
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinSwaps2 {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int n = 4;
        int[] arr = {4 ,3 ,1 ,2};
        int res = minimumSwaps(arr);
        System.out.println(res);

    }


    static int minimumSwaps(int[] a) {

		/*The soln is we want 1 at loc 0 and 2 at loc 1 and so on..*/        
        int swap = 0;
        for(int i=0; i < a.length-1 ; i++){
            
            if(a[i] !=  i+1 ){          //if the element is not in its correct position     
                
                int index = i;          //store the index
                //System.out.println("INDEX: "+index);

                while(a[index] != i+1){     //incr the index
                    index++;  
	                //System.out.println("INDEX IN WHILE: "+index);
                }
                
                //Swap them
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                
                swap++;                 //incr the swap count
                //System.out.println("SWAP COUNT: " + swap);
            }
            
        }
        return swap;

    }

    
}
