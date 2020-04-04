// Java program to make GCD 
// of array a mutiple of k. 
import java.io.*; 

class GFG 
{ 
    static int MinOperation(int a[],  int n, int k) 
    { 
        
        int result = 0; 
        
        for (int i = 0; i < n; ++i) 
        { 
            // If array value is not 1 and it is greater than k then we can increase the r decrease the remainder obtained by dividing k from the ith value of array so that we get the number which is either closer to k or its multiple 
            if (a[i] != 1 && a[i] > k) 
                result = result + Math.min(a[i] % k,    k - a[i] % k); 
            
            else
                // Else we only have one choice which is to increment the value to make equal to k 
                result = result + k - a[i]; 
        } 
        return result; 
    } 

    // Driver code 
    public static void main (String[] args) 
    { 
        int arr[] = {4, 5, 6}; 
        int n = arr.length; 
        int k = 5; 
        System.out.println(MinOperation(arr, n, k)); 
    
    } 
} 
