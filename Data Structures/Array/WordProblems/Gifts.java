// Java implementation of above approach 
import java.util.*; 

class Gifts 
{ 
    static int numBoxes(int A[], int n, int K) 
    { 

        Arrays.sort(A); 

        // Try to fit smallest box with current heaviest box (from right side) 
        int i = 0, j = n - 1; 
        int ans = 0; 
        while (i <= j) { 
            ans++;              //Incr ans count everytime we enter the loop
            
            if (A[i] + A[j] <= K) {     //Only Case here if Weight satisfies the total Capacity
                i++; 
            }

            j--;        //Dec j everytime
            
        } 

        return ans; 
    } 

    // Driver program 
    public static void main(String args[]) 
    { 
        //int A[] = { 3, 2, 2, 1 }, K = 3; 
        int A[] = {3, 5, 3, 4}, K = 5;

        int n = A.length; 
        System.out.println(numBoxes(A, n, K)); 

    }   
} 
