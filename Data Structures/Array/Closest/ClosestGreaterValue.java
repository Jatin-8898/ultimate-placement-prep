// Java program to find closest greater value for 
// every array element 
import java.util.*; 

class ClosestGreaterValue { 
	public static void closestGreater(int[] arr) 
	{ 
		// Insert all array elements into a TreeSet 
		TreeSet<Integer> set = new TreeSet<Integer>(); 
		for (int i = 0; i < arr.length; i++) 
			set.add(arr[i]); 


		// Find smallest greater element for every array element 
		for (int i = 0; i < arr.length; i++) { 
			Integer greater = set.higher(arr[i]); 
			if (greater == null) 
				System.out.print(-1 + " "); 
			else
				System.out.print(greater + " "); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int[] arr = { 10, 5, 11, 10, 20, 12}; 
		closestGreater(arr); 
	} 
} 
