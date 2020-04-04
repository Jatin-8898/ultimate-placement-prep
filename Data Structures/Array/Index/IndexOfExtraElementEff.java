// Java code for above approach 
class GFG 
{ 
	// Function to find Index 
	static int find_extra_element_index(int[] arrA, int[] arrB) 
	{ 
		int extra_element = sum(arrA) - sum(arrB); 	// Calculating extra element 
	
		return indexOf(arrA, extra_element); // returns index of extra element 
	} 
	
	// function return sum of array elements 
	static int sum(int[] arr) 
	{ 
		int sum = 0; 
		for (int i = 0; i < arr.length; i++) 
			sum += arr[i]; 
		return sum; 
	} 
	
	// function return index of given element 
	static int indexOf(int[] arr, int element) 
	{ 
		for (int i = 0; i < arr.length; i++) 
			if (arr[i] == element) 
                return i;     
		return -1; 
	} 
	
	// Driver Code 
	public static void main(String[] args) 
	{ 
		int[] arrA = {2, 4, 6, 8, 10, 12, 13}; 
		int[] arrB = {2, 4, 6, 8, 10, 12}; 
		System.out.println(find_extra_element_index(arrA, arrB)); 
	} 
} 
