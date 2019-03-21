import java.util.*;
class ReorderAccordingIndex{
	/*
	A Simple Solution is to use an auxiliary array temp[] of same size as given arrays. Traverse the given array and put all elements at their correct place in temp[] using index[]. Finally copy temp[] to arr[] and set all values of index[i] as i
	*/

	public static void main(String[] args) {
		int arr[] = new int[]{50, 40, 70, 60, 90}; 
     	int index[] = new int[]{3,  0,  4,  1,  2}; 
     	int ans[] = reorderAccordingIndex(arr,index);

        System.out.println("Reordered array is: "); 
        System.out.println(Arrays.toString(ans)); 

        Arrays.sort(index);
        System.out.println("Modified Index array is:"); 
        System.out.println(Arrays.toString(index)); 
	}

	private static int[] reorderAccordingIndex(int[] arr, int[] index){

		int temp[] = new int[arr.length];

		for (int i=0; i<arr.length ; i++) {
			
			temp[ index[i] ]  = arr[i]; //Put the values of arr at the temp's index eg 50 is at pos 3 in temp
		}								//since index[i] will give 3 so at index store the value

		return temp;
	}
}