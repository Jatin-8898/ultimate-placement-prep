// Java program to find number of subarrays with sum exactly equal to k. 
import java.util.HashMap; 
import java.util.Map; 

public class SumEqualToK{ 
	
	// Function to find number of subarrays with sum exactly equal to k. 
	static int findSubarraySum(int arr[], int n, int sum) 
	{ 
		//HashMap to store number of subarrays starting from index zero having particulr value of sum. 
		HashMap <Integer, Integer> map = new HashMap<>(); 
		
		int res = 0; 
		int currSum = 0;                // Sum of elements so far.
		
		for (int i = 0; i < n; i++) { 
		
			// Add current element to sum so far. 
			currSum += arr[i]; 
		
			//If currSum is equal to desired sum,then new subarray is found.So incr count of subarray. 
			if (currSum == sum) 
				res++;		 
		
			// currSum exceeds given sum by currSum - sum. Find number of subarrays having this sum and exclude those subarrays from currSum by increasing count by same amount. 
			if (map.containsKey(currSum - sum)) 
				res += map.get(currSum - sum); 
                
                
			// Add currSum value to count of different values of sum. 
			Integer count = map.get(currSum); 
			if (count == null) 
				map.put(currSum, 1); 
			else
				map.put(currSum, count + 1); 
		} 	
		return res; 
	} 
	public static void main(String []args){ 
		
		int arr[] = { 10, 2, -2, -20, 10 }; 
		int sum = -10; 
		int n = arr.length; 
		System.out.println(findSubarraySum(arr, n, sum)); 
	} 
} 

