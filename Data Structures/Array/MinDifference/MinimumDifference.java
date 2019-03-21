import java.util.*;

class MinimumDifference{
	public static void main(String[] args) {
		int[] arr = new int[]{2, 35, 6, 19, 18, 25};	//18 19
		System.out.println("Minimum difference is "+ findMinDiff(arr)); 
	}

	private static int findMinDiff(int[] arr){
		Arrays.sort(arr);

		int minDiff = Integer.MAX_VALUE;

		for (int i=0; i<arr.length-1; i++) {
			
			if(arr[i+1] - arr[i] < minDiff)		//Like Minimum code
				minDiff = arr[i+1] - arr[i];
		}
		return minDiff;
	}
}