class LongestIncreasingSubseq{

	/*	Works in O(n^2)		*/

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
        int n = arr.length; 
        System.out.println("Length of LongestIncreasingSubseq is " + longestCommonSub( arr, n ) );
	}


	private static int longestCommonSub(int arr[], int n){
		int lis[]  = new int[n];		//Create dp table of size of arraylength
		int max =  0;

		for (int i=0; i<n; i++) {		//Init everything in table as 1
			lis[i] = 1;
		}

		for(int i=1; i<n; i++){				//ahead pointer
			for (int j=0; j<i; j++){

				// Check if 22 is greater than 10 lis[i] is 1 and lis[j] is also 1
				//if not greater then move forward eg 33 is greater than 10 so lis[33] becomes 2
				//Likewise we go on filling tha table in bottom up and return the max
				if( arr[i] > arr[j]  && lis[i] < lis[j]+1)	//since we want max(2,3) like that
					lis[i] = lis[j] + 1;
			}
		}

		/* Pick maximum of all LIS values */
           for ( int i = 0; i < n; i++ ) 
              if ( max < lis[i] ) 
                 max = lis[i]; 
  
  	System.out.println(max);
            return max; 
	}
}