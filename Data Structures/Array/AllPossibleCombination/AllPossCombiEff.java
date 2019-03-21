import java.util.*;
class AllPossCombiEff{
	public static void main(String[] args) {
		int arr[] = {5,8,3,9}; 
        int r = 2; 
        int n = arr.length; 
        printCombination(arr, n, r);
	}

	// The main function that prints all combinations of size r in arr[] of size n
    static void printCombination(int arr[], int n, int r) 
    { 
        // A temporary array to store all combination one by one 
        int data[]=new int[r]; 
  
        // Print all combination using temprary array 'data[]' 
        combinationUtil(arr, n, r, 0, data, 0); 
    } 

    

	static void combinationUtil(int arr[], int n, int r, int index, int data[], int i) 
    { 
        //We found a pair ie Current combination is ready to be printed, print it 
        
        if (index == r) 
        { 
            
            for (int j=0; j<r; j++) {
                System.out.print(data[j]+" "); //this will print 5 8 like that
            }
            System.out.println("");         //for enter
            
        	return; 
        } 
  
        // When no more elements are there to put in data[] 
        if (i >= n) 
            return; 
  

        data[index] = arr[i]; 

        // current is included, put next at next location 
        combinationUtil(arr, n, r, index+1, data, i+1); 
  
        // current is excluded, replace it with next (Note that i+1 is passed, but index is not changed) 
        combinationUtil(arr, n, r, index, data, i+1); 

        //The above line will help us toget 5 8, 5 3 , 5 9 for input 5,8,3,9 coz we r not changing the INDEX
    } 
  

    

}