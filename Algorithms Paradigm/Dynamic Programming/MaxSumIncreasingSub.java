class MaxSumIncreasingSub{
	
	/*	WORKS IN O(n^2)
		THE ONLY DIFF IS INSTEAD OF ADDDING 1 we add the arr[i] to get the length
	*/

	public static void main(String[] args) {
		int arr[] = { 1, 101, 2, 3, 100, 4, 5 }; 
        int n = arr.length; 
        System.out.println("Length of max subseq is " + MaxLongestSub( arr, n ));
	}


	private static int MaxLongestSub(int arr[], int n){
		int maxSub[]  = new int[n];		//Create dp table of size of arraylength
		int max =  0;

		for (int i=0; i<n; i++) {		//Init everything in table as 1
		 maxSub[i] = 1;
		}

		for(int i=1; i<n; i++){				//ahead pointer
			for (int j=0; j<i; j++){

				// Check if 22 is greater than 10 maxSub[i] is 1 and maxSub[j] is also 1
				//if not greater then move forward eg 33 is greater than 10 so maxSub[33] becomes 2
				//Likewise we go on filling tha table in bottom up and return the max
				if( arr[i] > arr[j]  && maxSub[i] <  maxSub[j] + arr[i])
				 	maxSub[i] = maxSub[j] + arr[i];
			}
		}

		/* Pick maximum of all maxSub values */
           for ( int i = 0; i < n; i++ ) 
              if ( max < maxSub[i] ) 
                 max = maxSub[i]; 
  
            return max; 
	}
}