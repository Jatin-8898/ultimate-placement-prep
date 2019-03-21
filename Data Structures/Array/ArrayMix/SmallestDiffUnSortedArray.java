import java.util.*;
/*
This algorithm takes O(m log m + n log n) time to sort and O(m + n) time to find the minimum difference. Therefore, the overall runtime is O(m log m + n log n).
*/
class SmallestDiffUnSortedArray{
	
	public static void main(String[] args) {
		int A[] = {1, 2, 11, 5}; 
        int B[] = {4, 12, 19, 23, 127, 235};        //eg 11 12 diff is 1
          
        System.out.println(findSmallestDifference(A, B)); 
	}

	private static int findSmallestDifference(int[] a1, int[] a2){

		Arrays.sort(a1); 
        Arrays.sort(a2); 

        int a=0, b=0;
		int minDiff = Integer.MAX_VALUE;

		while (a < a1.length && b < a2.length) {

            if (Math.abs(a1[a] - a2[b])   <     minDiff) 	//find min diff nd update min diff
                minDiff = Math.abs(a1[a] - a2[b]); 
      
           
            if (a1[a] < a2[b]) 				 // if value less then move in first array
                a++; 
            else 							//if greater than move in second array
                b++; 
        } 
        return minDiff;

	}
}