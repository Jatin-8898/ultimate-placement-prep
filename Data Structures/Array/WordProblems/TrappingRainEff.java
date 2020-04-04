// JAVA Code For Trapping Rain Water 
import java.util.*; 

class GFG { 
	
	static int findWater(int arr[], int n) 
	{ 
		
		int result = 0;         // initialize output 
        int left_max = 0; 
        int right_max = 0;    
        int lo = 0;
        int  hi = n-1;   // indices to traverse the array 
		
		while(lo <= hi) 
		{ 
			if(arr[lo] < arr[hi]) 
			{ 
				if(arr[lo] > left_max)          // update max in left 
                    left_max = arr[lo]; 
				else
				    result += left_max - arr[lo];       // water on curr element = max - curr 
                
                lo++; 
			} 
			else
			{ 
				if(arr[hi] > right_max)     // update right maximum 
				    right_max = arr[hi]; 
				else
				    result += right_max - arr[hi]; 
                
                hi--; 
			} 
		} 
		
		return result; 
	} 
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 
					3, 2, 1, 2, 1}; 
		int n = arr.length; 
		
		System.out.println("Maximum water that "
					+ "can be accumulated is "
					+ findWater(arr, n)); 
		
    } 
}