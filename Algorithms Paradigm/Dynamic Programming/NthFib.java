import java.util.*;

class NthFib {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int  t = s.nextInt();                 // Reading input from STDIN
        int[] dp = new int[801]; 

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<84;i++)
            dp[i] = dp[i-1]+dp[i-2];     // Do pre computation of numbers for given constraint

        while(t > 0){
            int n = s.nextInt();
    
            for(int i=0;i<n;i++)
               System.out.print( dp[i]+" ");   // Print dp[i] till N
            
            System.out.println();
            t--;
        }
        s.close();
    }
}
