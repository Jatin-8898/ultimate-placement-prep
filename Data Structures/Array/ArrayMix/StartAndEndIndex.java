// Java program to find starting and ending indexes of repeated numbers in an array 

class StartAndEndIndex { 
	
	static void findIndex(int a[], int n, int key) 
	{ 
		int start = -1; 

		// Traverse from beginning to find first occurrence 
		for (int i = 0; i < n; i++) { 
			if (a[i] == key) { 
				start = i; 
				break; 
			} 
		} 
        
		if (start == -1) {  //If element is not present no need to find Last Occ , Directly Return
			System.out.println("Key not present in array"); 
			return; 
		} 

		// Traverse from end to find last occurrence. 
		int end = start; 
		for (int i = n - 1; i >= start; i--) { 
			if (a[i] == key) { 
				end = i; 
				break; 
			} 
        } 
        
		if (start == end) 
			System.out.println("Only one key is present at index : " + start); 
		else { 
			System.out.println("Start index: " + start); 
			System.out.println("Last index: " + end); 
		} 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int a[] = { 1, 2, 7, 8, 8, 9, 8, 0, 0, 0, 8 }; 

		// Key to find 
		int key = 8; 

		// Calling method 
		findIndex(a, a.length, key); 
	} 
} 
