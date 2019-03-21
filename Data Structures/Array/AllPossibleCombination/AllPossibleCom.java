import java.util.*;
class AllPossibleCom{
	/*
	Method 1 (Fix Elements and Recur)
	We create a temporary array ‘data[]’ which stores all outputs one by one. The idea is to start from first index (index = 0) in data[], one by one fix elements at this index and recur for remaining indexes. Let the input array be {1, 2, 3, 4, 5} and r be 3. We first fix 1 at index 0 in data[], then recur for remaining indexes, then we fix 2 at index 0 and recur. Finally, we fix 3 and recur for remaining indexes. When number of elements in data[] becomes equal to r (size of a combination), we print data[].
*/

	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 3, 1}; 
		int r = 3; 
        int n = arr.length; 
        printCombination(arr, n, r); 
	}

	// The main function that prints all combinations of size r in arr[] of size n.
    static void printCombination(int arr[], int n, int r) { 
        // A temporary array to store all combination one by one 
        int data[] = new int[r]; 
  
        // Sort array to handle duplicates
       	// Arrays.sort(arr);
    	
        // Print all combination using temprary array 'data[]' 
        combinationUtil(arr, data, 0, n-1, 0, r); 
    } 


	 static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) { 
        // Current combination is ready to be printed, print it 
        if (index == r) 
        { 
            for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 

            System.out.println(""); 
            return; 
        } 
  
        //replace index with all possible elements.The condition "end-i+1 >= r-index" makes sure that including one element at index will make a combination with remaining elements at remaining pos 
        for (int i=start;     i<=end && end-i+1 >= r-index;     i++) 
        { 
            data[index] = arr[i]; 
            combinationUtil(arr, data, i+1, end, index+1, r); 
            
            // Remove duplicates
        	/*while (arr[i] == arr[i+1])
            	 i++;*/
        } 
    } 
  
    
}