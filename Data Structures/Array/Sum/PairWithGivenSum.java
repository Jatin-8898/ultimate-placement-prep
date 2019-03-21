import java.util.*;
import java.lang.*;
import java.io.*;
/*
	This works in O(n^2) 
*/
class PairWithGivenSum
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
	       int flag = 0;     
	            
	       for (int i=0; i<a.length; i++) {
			    for (int j=i+1; j<a.length; j++) {  
			        
			        if(sum - a[i] == a[j]){
			            flag  = 1;
			            System.out.print(a[i] + " "+ a[j] + " "+ sum + "\n");
			        }
			    }
	       }
	       
	       if(flag==0)
	            System.out.println("-1");
	                 
	    }
	    
	 }
	
	 
}