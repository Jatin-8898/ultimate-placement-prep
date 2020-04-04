class SubArrayWithGivenSum{
	/*Find subarray with given sum | Set 1 (Nonnegative Numbers)
	Given an unsorted array of nonnegative integers, find a continous subarray 
	which adds to a given number
	EG:		arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
		
	Ouptut: Sum found between indexes 2 and 4.
	NOTE the program find continuos Indexes only 

	*/
	public static void main(String[] args) {
		int a[] =  {32, 4, 20, 3, 10, 5};
		int sum = 33;
		int n = a.length;
		int res = findIndexesWithGivenSum(a,sum,n);	
	}
	
	private static int findIndexesWithGivenSum(int a[],int sum,int n){
		int currentSum = a[0];	//Eg 32
		int start = 0 , i;
		

		for ( i=1; i<=n; i++) {

			// If curr_sum exceeds the sum, then remove the starting elements
			while(currentSum > sum && start < i-1){
				currentSum = currentSum - a[start];	//Remove the 0th element index since it became 36
				start++;					//Go to next index ie 1st index of array and so on
			}

			 // If curr_sum becomes equal to sum, then return true
			if(currentSum  ==  sum){
				int p = i-1;
				System.out.println("SUM FOUND BETWEEN INDEX "+ start+ " and "+p);
				return 1;
			}		

			//If its smaller than sum keep on Adding this element to currentSum
			if(i < n)
				currentSum += a[i];

		}

		System.out.println("No subarray found");
        return 0;
			
	}
}