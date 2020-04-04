// Java program to find floor and ceiling in an 
// unsorted array. 
import java.io.*; 

class FloorCielUnsortedArray 
{ 
	// Function to floor and ceiling of x in arr[] 
	public static void floorAndCeil(int arr[], int x) 
	{ 
		int n = arr.length; 
		
		// Indexes of floor and ceiling 
        int fInd = -1, 
            cInd = -1; 

		// Distances of current floor and ceiling 
        int fDist = Integer.MAX_VALUE, 
            cDist = Integer.MAX_VALUE; 

		for (int i = 0; i < n; i++) 
		{ 
			// If current element is closer than previous ceiling. 
			if (arr[i] >= x && cDist > (arr[i] - x)) 
			{ 
				cInd = i; 
				cDist = arr[i] - x; 
			} 

			// If current element is closer than previous floor. 
			if (arr[i] <= x && fDist > (x - arr[i])) 
			{ 
				fInd = i; 
				fDist = x - arr[i]; 
			} 
		} 

		if(fDist == Integer.MAX_VALUE) 
			System.out.println("Floor doesn't exist " ); 
		else
			System.out.println("Floor is " + arr[fInd]); 


		if(cDist == Integer.MAX_VALUE) 
			System.out.println("Ceil doesn't exist "); 
		else
			System.out.println("Ceil is " + arr[cInd]); 
	} 
	
	public static void main (String[] args) 
	{ 
		int arr[] = {5, 6, 8, 9, 6, 5, 5, 6}; 
		int x = 7; 
		floorAndCeil(arr, x); 
	} 
} 
