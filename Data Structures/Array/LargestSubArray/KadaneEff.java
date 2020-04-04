import java.util.*;
import java.lang.*;
import java.io.*;
/*
	I/P
		2
		3
		1 2 3
		4
		-1 -2 -3 -4


	Output
		6
		-1
*/
class KadaneEff
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
	         
	        int currMax = a[0];
	        int gMax = a[0];
	        
	        for(int i=1; i<n; i++){
	           currMax = Math.max(a[i], currMax + a[i]);
	           gMax = Math.max(currMax, gMax);
	        }
	        System.out.println(gMax);
	     
	    }   
	    
	 }
	 
	 
}