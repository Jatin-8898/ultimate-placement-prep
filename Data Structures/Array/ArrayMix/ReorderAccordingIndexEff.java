import java.util.*;

class ReorderAccordingIndexEff{
	/*
	We can solve it Without Auxiliary Array. Below is algorithm.

	1) Do following for every element arr[i]
	   a) While index[i] is not equal to i
	       (i)  Store array and index values of the target (or 
	            correct) position where arr[i] should be placed.
	            The correct position for arr[i] is index[i]
	       (ii) Place arr[i] at its correct position. Also
	            update index value of correct position.
	       (iii) Copy old values of correct position (Stored in
	            step (i)) to arr[i] and index[i] as the while 
	            loop continues for i.
	*/
	public static void main(String[] args) {
		int arr[] = new int[]{50, 40, 70, 60, 90}; 
     	int index[] = new int[]{3,  0,  4,  1,  2}; 
     	reorderAccordingIndex(arr,index);

     	System.out.println("Reordered array is: "); 
        System.out.println(Arrays.toString(arr)); 

        System.out.println("Modified Index array is:"); 
        System.out.println(Arrays.toString(index)); 
	}

	private static void reorderAccordingIndex(int[] arr, int[] index){

		
        for (int i=0; i<arr.length; i++){ 			// Fix all elements one by one 
            
            while (index[i] != i) 					// While index[i] and arr[i] are not fixed 
            { 
                // Store values of the target (or correct)  position before placing arr[i] there 
                int  oldTargetI  = index[index[i]]; 
                System.out.println("H "+oldTargetI);
                char oldTargetE  = (char)arr[index[i]]; 
                System.out.println(oldTargetE);
       
                //Place arr[i] at its target(correct)position.Also copy corrected index for new position 
                arr[index[i]] = arr[i]; 
                index[index[i]] = index[i]; 
       
                // Copy old target values to arr[i] and index[i] 
                index[i] = oldTargetI; 
                arr[i]   = oldTargetE; 
            } 
        } 
	}

}