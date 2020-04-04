// Java implementation of the above approach 
import java.util.*; 
class KthMissingInUnsorted 
{ 
	// Function to find the sum of minimum of all subarrays 
	static int findKth(int arr[], int n, int k) 
	{ 
		HashSet<Integer> set = new HashSet<>(); 
		int count = 0; 

		for (int i = 0; i < n; i++)     	// Insert all the elements in a set 
			set.add(arr[i]); 

		// Find the maximum and minimum element 
		int max = Arrays.stream(arr).max().getAsInt(); 
		int min = Arrays.stream(arr).min().getAsInt(); 


		for (int i = min+1; i < max; i++)    // Traverse from the minimum to maximum element 
		{ 
			if (!set.contains(i))   // Check if "i" is set 
				count++; 

			if (count == k)     	// Check if it is kth set 
				return i; 
        }  
        
		return -1;  // If no kth element is missing
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int arr[] = {2, 10, 9, 4}; 
		int n = arr.length; 
		int k = 5; 
		System.out.println(findKth(arr, n, k)); 
	} 
} 
