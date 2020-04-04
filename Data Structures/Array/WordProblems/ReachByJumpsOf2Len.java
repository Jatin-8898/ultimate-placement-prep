import java.io.*;
/* 
    Input: k = 10, d1 = 4, d2 = 6, arr[] = {10, 15, 20}
    Output: 1 0 1
    10 can be reached from k with no extra move.
    20 can be reached with k + d1 + d2 = 10 + 4 + 6 = 20

    Input: k = 8, d1 = 3, d2 = 2, arr[] = {9, 4}
    Output: 1 1

    => So, any number x that is reachable from k should satisfy (x – k) % gcd = 0.
 */

class ReachByJumpsOf2Len { 
    // Recursive function to return gcd of a and b 
	static int __gcd(int a, int b) 
	{ 
        if(b == 0)  return a;
        return __gcd(b, a%b);
	} 

    // Function that returns the vector containing result for the reachability of the required numbers 
    static void reachTheNums(int nums[], int k, int d1, int d2, int n) 
    { 
        int i; 
        int ans[] = new int[n]; 
        int gcd = __gcd(d1, d2); 

        for (i = 0; i < n; i++) { 
            int x = nums[i] - k; 

            // If distance x is coverable 
            if (x % gcd == 0) 
                ans[i] = 1; 
            else
                ans[i] = 0; 
        } 

        for (i = 0; i < n; i++) 
            System.out.print(ans[i] + " "); 
    } 

	public static void main (String[] args) { 
        int nums[] = { 9, 4 }; 
        int n = nums.length; 
        // Starting number K 
        int k = 8; 

        // Sizes of jumps d1 and d2 
        int d1 = 3, d2 = 2; 

        reachTheNums(nums, k, d1, d2, n); 
	} 
} 
