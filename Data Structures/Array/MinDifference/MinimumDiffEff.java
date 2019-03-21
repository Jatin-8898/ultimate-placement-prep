import java.util.Arrays; 
class MinimumDiffEff{

	/*
		This works in O(n logn)
		Since  Comparing all adjacent pairs in sorted array and keep track of minimum difference. 
		This step takes O(n) time
	*/

	public static void main(String[] args) {	
		int arr[] = new int[]{1, 5, 3, 19, 18, 25}; 
        System.out.println("Minimum difference is "+ findMinDiff(arr, arr.length)); 
	}

	
    static int findMinDiff(int[] arr, int n) 
    { 
           // Sort array in non-decreasing order 
           Arrays.sort(arr);  //this takes O(n logn)
           
           // Initialize difference as infinite 
           int diff = Integer.MAX_VALUE; 
           
           // Find the min diff by comparing adjacent pairs in sorted array 
           for (int i=0; i<n-1; i++) 
              if (arr[i+1] - arr[i] < diff) 
                  diff = arr[i+1] - arr[i]; 
           
           // Return min diff 
           return diff; 
    } 
}