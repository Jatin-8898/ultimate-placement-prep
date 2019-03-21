import java.util.Arrays;

class ChocolateDistribution{
	public static void main(String[] args) {
		int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28,42, 30, 44, 48, 43,50};
        int m = 7;  // Number of students
        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, m));
	}

	private static int findMinDiff(int arr[],int size,int students){
		
		if(size==0 || students==0)
			return 0;

		//Sort the array
		Arrays.sort(arr);	

		//no of Students can be more than array size ie Packets
		if(size < students)
			return -1;

		//find the Largest number of chocloates
		int min_diff = Integer.MAX_VALUE;

		//Find the subarray of size students such that the diff between 
		//Max and min element is Minimum
		int first =0 , last= 0;

		for (int i=0; (i + students -1) < size; i++) {
			
			int diff = arr[i+students-1] - arr[i];


			//if the diff is less than Largest diff store it
			if(diff < min_diff){

				min_diff = diff;
				first = i;
				last = i + students - 1;
			
			}
		}
		return (arr[last] - arr[first]);

	}
}