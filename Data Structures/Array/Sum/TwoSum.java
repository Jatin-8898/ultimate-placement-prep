class TwoSum{	 //all pairs in the array that sum up to S
	
	/*	
		This fucnction returns the index of the numbers whose sum = required sum
	 */
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 1, 4, 8};
		int sum = 8;

		TwoSum obj = new TwoSum();
		int found[] = obj.twoSum(arr,sum);
		for(int i : found)
			System.out.print (i+" ");
	}

	public int[] twoSum(int[] arr, int sum){

		//Two pointers i and j
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {

				//Check if the (sum-a[i] == a[j])
				if( sum - arr[i]   ==  arr[j] ){
					System.out.println("The elements are: " + arr[i] + " " + arr[j]);
					System.out.print("The index is: ");
					return new int[]{i,j};
				}
				
			}	
		}
		throw new IllegalArgumentException("NOT FOUND");
	}
}