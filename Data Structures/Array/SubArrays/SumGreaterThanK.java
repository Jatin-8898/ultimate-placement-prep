// Java O(n) solution for finding smallest subarray  with sum greater than x 
import java.io.*; 

class SumGreaterThanK 
{ 
// Returns length of smallest 
// subarray with sum greater than x. If there is no subarray with given sum, then returns n+1 
    static int smallestSubWithSum(int arr[], int n, int x) 
    { 
        // Initialize current sum and minimum length 
        int curr_sum = 0, min_len = n + 1; 

        // Initialize starting 
        // and ending indexes 
        int start = 0, end = 0; 
        while (end < n) 
        { 
            // Keep adding array elements while current  sum is smaller than x 
            while (curr_sum <= x && end < n) 
            { 
                // Ignore subarrays with negative sum if x is positive. 
                if (curr_sum <= 0 && x > 0) 
                { 
                    start = end; 
                    curr_sum = 0; 
                } 

                curr_sum += arr[end++]; 
            } 

            // If current sum becomes 
            // greater than x. 
            while (curr_sum > x && start < n) 
            { 
                // Update minimum length if needed 
                if (end - start < min_len) 
                    min_len = end - start; 

                // remove starting elements similar to SLiding Window
                curr_sum -= arr[start++]; 
            } 
        } 
        return min_len; 
    } 


// Driver Code 
    public static void main (String[] args) 
    { 
        int arr1[] = {- 8, 1, 4, 2, -6}; 
        int x = 6; 
        int n1 = arr1.length; 
        int res1 = smallestSubWithSum(arr1, 
                                    n1, x); 
        if(res1 == n1 + 1) 
            System.out.println("Not possible"); 
        else			
            System.out.println (res1); 
} 
} 
