class MaxDiffNiceSolution{
	/*
		Maximum difference between two elements such that larger element appears after the smaller number

		Input : arr = {2, 3, 10, 6, 4, 8, 1}
		Output : 8
		Explanation : The maximum difference is between 10 and 2.

		Input : arr = {7, 9, 5, 6, 3, 2}
		Output : 2
		Explanation : The maximum difference is between 9 and 7.
	*/
	public static void main(String[] args) {
		int[] arr ={2,3,10,6,4,8,1};
		getMaxDiff(arr);

	}
	private static void getMaxDiff(int[] a){

		int maxDiff = -1;

		int maxRight = a[a.length-1];		//keep on the last element

		for (int i = a.length-2;  i>=0 ;  i--) {
			
			if(a[i] >   maxRight)		//Search for the Maximum Element from the right
				maxRight = a[i];		//if found update maxRight


			else{

				if(maxRight - a[i]  > maxDiff)	//similar to find the max code
					maxDiff = maxRight - a[i];
			}
		}
		System.out.println("Max DIfference is: "+ maxDiff);
	}
}