class CountInversion{
	/*
		This works in  O(n^2) complexity
	*/
	public static void main(String[] args) {
		 int arr[] = new int[] { 1, 20, 6, 4, 5 }; 
		 System.out.println("Number of inversions are "+ getInversionCount(arr, arr.length)); 
	}
	private static int getInversionCount(int[] arr, int n){

		int count = 0;

		for (int i=0; i<n-1; i++) {
			
			for (int j=i+1; j<n; j++) {
				
				if(arr[i] > arr[j])
					count++;
			}
		}

		return count;
	}
}