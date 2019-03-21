import java.util.*;
import java.lang.*;
import java.io.*;
class PairTheMinimum
 {

	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    
	    while(t-- > 0){
	        int n = s.nextInt();
	        int a[] = new int[n*2];
	        
	        for(int i=0; i<2*n; i++)
	            a[i] = s.nextInt();
	            
	        Arrays.sort(a);			/*O(n logn)*/
	  
            int i=0;
	        while(i < n) {
	            System.out.print("("+a[i]+","+a[2*n-i-1]+")");
	            i++;
	        }
	        System.out.println("");
	                 
	    }
	    
	 }
 
}