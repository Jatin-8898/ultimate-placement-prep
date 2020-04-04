import java.util.*;
import java.lang.*;
import java.io.*;
class MinimumJumps
 {
	public static void main (String[] args) throws Exception
	{
	    
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	    int t = Integer.parseInt(br.readLine());
	    
	    while(t-- > 0){
	        int n = Integer.parseInt(br.readLine());
	        int a[] = new int[n];
	        String line = br.readLine(); 
            String[] strs = line.trim().split(" ");
            
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }
	       
	       System.out.println(jump(a));
	                 
	    }
	    
	}
	  public static int jump(int[] A) {
        
        int jumps = 0, 
            curEnd = 0, 
            max = 0;
        
        for (int i = 0; i < A.length - 1; i++) {
            
            max = Math.max(max, i + A[i]);
            
            if(i >= max) 
                return -1;  
                
            if (i == curEnd) {
                jumps++;
                curEnd = max;
            }   
        }
        return jumps;
    }
}