// Java program to find uncommon elements 
// of two sorted arrays 
import java.io.*; 

class UncommonElements { 
	
	static void printUncommon(int arr1[], int arr2[], int n1, int n2) 
	{ 

		int i = 0, j = 0, k = 0; 
		while (i < n1 && j < n2) { 

			// If not common, print smaller 
			if (arr1[i] < arr2[j]) { 
				System.out.print(arr1[i] + " "); 
				i++; k++; 
			} 
			else if (arr2[j] < arr1[i]) { 
				System.out.print(arr2[j] + " "); 
				k++; j++; 
			} 

			// Skip common element 
			else { 
				i++; j++; 
			} 
		} 

		// printing remaining elements 
		while (i < n1) { 
			System.out.print(arr1[i] + " "); 
			i++; k++; 
		} 
		while (j < n2) { 
			System.out.print(arr2[j] + " "); 
			j++; k++; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int arr1[] = { 10, 20, 30 }; 
		int arr2[] = { 20, 25, 30, 40, 50 }; 

		int n1 = arr1.length; 
		int n2 = arr2.length; 

		printUncommon(arr1, arr2, n1, n2); 
	} 
} 

