class MaxDiffLilEfficient{
	/*n this method, instead of taking difference of the picked element with every other element, we take the difference with the minimum element found so far. So we need to keep track of 2 things:
	
	1) Maximum difference found so far (max_diff).
	2) Minimum number visited so far (min_element).

		O(n) solution time
		O(1) space
	*/

	public static void main(String[] args) {
		int[] arr ={2, 3, 10, 6, 4, 8, 1, 21};
		getMaxDiff(arr);
	}
	private static void getMaxDiff(int[] a){

		int minElement = a[0];				//Initialise the minELement as first element eg 2
		int maxDiff = a[1] - minElement;	//Store the diff eg 1 here

		for (int i=1;  i<a.length; i++) {
			
			if(a[i] - minElement   > maxDiff)	//Get the maxDifference
				maxDiff = a[i]- minElement;

			if(a[i]  < minElement)		//Keep track of the minElement
				minElement = a[i];
		}

		System.out.println("Max DIfference: "+ maxDiff);
	}
}