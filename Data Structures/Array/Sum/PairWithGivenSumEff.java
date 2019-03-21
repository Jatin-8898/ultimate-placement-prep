
import java.util.*;
import java.lang.*;
import java.io.*;

/*	
		This works in O(n)
		We achived this by applying binary search.
*/
class PairWithGivenSumEff
 {
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    
	    while(t-- > 0){
	        int n = s.nextInt();
	        int a[] = new int[n];
	        
	        for(int i=0; i<n; i++)
	            a[i] = s.nextInt();
	            
	       int sum = s.nextInt();     
	       
	       pairWithGivenSum( a,  sum);
	                 
	    }
	    
	 }
	 private static void pairWithGivenSum(int[] a, int sum){
	    int flag = 0;
	    int low = 0;
	    int high = a.length-1;
	    
	    while(low < high){
	        
	        if(a[low] + a[high] > sum){
	            high--;
	            
	        }else if(a[low] + a[high] < sum){
	            low++;
	        }
	        
	        else{
	            System.out.print(a[low] + " "+ a[high] + " "+ sum + "\n");
	            flag = 1;
	            low++;
	        }
	        
	    }

	    if(flag==0){
	        System.out.println("-1");
	    }
	    
	 }
	 
}