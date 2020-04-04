// Java program to find the repeating and missing elements using Maps 

import java.util.*; 

public class MissingAndRepeated { 
	public static void main(String[] args) 
	{ 
		int[] arr = { 4, 3, 6, 2, 1, 1 ,8};   int max = arr.length; 

		Map<Integer, Boolean> map = new HashMap<>();        //Boolean is true when no is present

		for (Integer i : arr) 
			if (map.get(i) == null)  
				map.put(i, true); 
			else  
				System.out.println("Repeating = " + i); 
        
		for (int i = 1; i <= max; i++) 
			if (map.get(i) == null) 
				System.out.println("Missing = " + i); 
    } 
    
    /* ANOTHER SOL 
    
    Traverse the array. While traversing, use the absolute value of every element as an index and make the value at this index as negative to mark it visited. 
    
    If something is already marked negative then this is the repeating element. 
    
    To find missing, traverse the array again and look for a positive value.
    */
    static void printTwoElements(int arr[], int size) 
    { 
        int i; 
        System.out.print("The repeating element is "); 
  
        for (i = 0; i < size; i++) { 
            int abs_val = Math.abs(arr[i]); 
            if (arr[abs_val - 1] > 0) 
                arr[abs_val - 1] = -arr[abs_val - 1]; 
            else
                System.out.println(abs_val); 
        } 
  
        System.out.print("And the missing element is "); 
        for (i = 0; i < size; i++) { 
            if (arr[i] > 0) 
                System.out.println(i + 1); 
        } 
    } 
} 
