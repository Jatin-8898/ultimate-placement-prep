class Equilibrium{
	/*The idea is to get total sum of array first. Then Iterate through the array and keep updating the left sum which is initialized as zero. In the loop, we can get right sum by subtracting the elements one by one.

	1) Initialize leftsum  as 0
	2) Get the total sum of the array as sum
	3) Iterate through the array and for each index i, do following.
	    a)  Update sum to get the right sum.  
	           sum = sum - arr[i] 
	       // sum is now right sum
	    b) If leftsum is equal to sum, then return current index. 
	    c) leftsum = leftsum + arr[i] // update leftsum for next iteration.
	4) return -1 // If we come out of loop without returning then there is no equilibrium index
    
    */
	public static void main(String[] args) {
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		int n = arr.length;
		System.out.println("THE INDEX WHICH IS EQUILIBRIUM IS: " +findEqui(arr,n));

	}

	private static int findEqui(int arr[], int n){
		int sum = 0;
		int leftSum = 0;
		int i;

		for(i=0; i<n;i++)			/*Calulcate the sum of the array*/
			sum = sum + arr[i];


		for (i=0; i<n; i++) {	
			sum = sum - arr[i];		//sum is now right sum for index i 
			
			if(sum == leftSum)		//if it becomes same return value
				return i;

			leftSum = leftSum + arr[i];		//else keep adding the sum to the leftSUm
		}

		return -1;
	}
}