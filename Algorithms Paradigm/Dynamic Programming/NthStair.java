import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int M = 1000000007; 
    
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    int[] dp = new int[100000 + 1]; 

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=100000; i++)
            dp[i] = (dp[i-1] % M +dp[i-2] %M ) %M;// Do pre computation of numbers for given constraint

        while(t > 0){
            int n = s.nextInt();

            System.out.println( dp[n]);   // Print dp[i] till N
            t--;   
        }         
        s.close();
	}
	 
}