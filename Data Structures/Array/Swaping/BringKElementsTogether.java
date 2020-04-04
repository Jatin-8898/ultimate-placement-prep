// Java program to find minimum 
// swaps required to club all elements less than or equals to k together 
import java.lang.*; 
/* 
    A simple approach is to use two pointer technique and sliding window.

    1. Find count of all elements which are less than or equals to ‘k’. Let’s say the count is ‘cnt’

    2.Using two pointer technique for window of length ‘cnt’, each time keep track of how many elements in this range are greater than ‘k’. Let’s say the total count is ‘bad’.

    3.Repeat step 2, for every window of length ‘cnt’ and take minimum of count ‘bad’ among them. This will be the final answer.

    Time complexity: O(n)
    Auxiliary space: O(1)
*/
class BringKElementsTogether { 
        
    //function to find minimum swaps required to club all elements less than or equals to k together 
    static int minSwap(int arr[], int n, int k) { 
        
        int count = 0; 
        for (int i = 0; i < n; ++i) // Find count of elements which are less than equals to k 
            if (arr[i] <= k) 
                ++count;        //eg 3

        int bad = 0; 
        for (int i = 0; i < count; ++i) // Find unwanted elements in current window of size 'count' 
            if (arr[i] > k) 
                ++bad;      //eg 2

        // Initialize answer with 'bad' value of current window 
        int ans = bad; 
        for (int i = 0, j = count;  j < n;  ++i, ++j) {     //2, 1, 5, 6, 3     k=3

            if (arr[i] > k)  // Decrement count of previous window 
                --bad; 

            if (arr[j] > k) // Increment count of current window 
                ++bad; 

            ans = Math.min(ans, bad);   // Update ans if count of 'bad' is less in current window 
        } 
        return ans; 
    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {2, 1, 5, 6, 3}; 
        int n = arr.length; 
        int k = 3; 
        System.out.print(minSwap(arr, n, k) + "\n"); 

        int arr1[] = {2, 7, 9, 5, 8, 7, 4}; 
        n = arr1.length; 
        k = 5; 
        System.out.print(minSwap(arr1, n, k)); 
    } 
} 

