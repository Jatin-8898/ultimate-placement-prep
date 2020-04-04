// Java implementation to divide N into 
// maximum number of segments 
// of length a, b and c 
import java.util.*; 
class MinNoSegmentsLenABC 
{ 
	// function to find the maximum  number of segments 
	static int maximumSegments(int n, int a, int b, int c) 
	{ 
		// stores the maximum number of segments each index can have 
        int dp[] = new int[n + 10]; 
        
        Arrays.fill(dp, -1);    // initialize with -1 

        dp[0] = 0;  // 0th index will have 0 segments base case 

		for (int i = 0; i < n; i++)     // traverse for all possible segments till n 
		{ 
			if (dp[i] != -1) 
			{ 
				if(i + a <= n ){ //avoid buffer overflow 
				    dp[i + a] = Math.max(dp[i] + 1, dp[i + a]); 
                    System.out.println(i+ " "+a+" "+dp[i+a]+ " HERE a ");
                }    
                    
				if(i + b <= n ){ //avoid buffer overflow 
				    dp[i + b] = Math.max(dp[i] + 1,	 dp[i + b]); 
                    System.out.println(i+ " "+b+" "+dp[i+b]+ " HERE b ");
                }					
				if(i + c <= n ){ //avoid buffer overflow 
                    dp[i + c] = Math.max(dp[i] + 1, dp[i + c]); 
                    System.out.println(i+ " "+c+" "+dp[i+c]+ " HERE c ");
                }
			} 
        } 
        for (int i : dp) {
            System.out.print(i + " ");
        }
		return dp[n]; 
	} 

	// Driver code 
	public static void main(String arg[]) 
	{ 
		int n = 7, a = 5, b = 2, c = 5; 
		System.out.print(maximumSegments(n, a, b, c)); 
	} 
} 
