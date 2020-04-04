class SubsetSumEfficient{
	/*
	We can solve the problem in Pseudo-polynomial time using Dynamic programming. We create a boolean 2D table subset[][] and fill it in bottom up manner. The value of subset[i][j] will be true if there is a subset of set[0..j-1] with sum equal to i., otherwise false. Finally, we return subset[sum][n]
	*/
	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2}; 
        int sum = 9; 
        int n = set.length; 
        if (isSubsetSum(set, n, sum) == true) 
            System.out.println("Found a subset with given sum"); 
        else
            System.out.println("No subset with given sum");
	}

	 static boolean isSubsetSum(int set[],  int n, int sum) {
	 	//the value will be true if theres a subset
	 	boolean subset[][] = new boolean[sum+1][n+1];

	 	for (int i=0; i<=n; i++) {			//If sum is 0 then ans is correct
	 		subset[0][i]  = true;
	 	}

	 	for (int i=1; i<=sum; i++) {	//If sum is not 0 and set is empty,  then answer is false
	 		subset[i][0] = false;
	 	}

	 	for (int i = 1; i <= sum; i++) 			//Fill table in bottom up manner
        { 
            for (int j = 1; j <= n; j++) 
            { 
                subset[i][j] = subset[i][j-1]; 

                if (i >= set[j-1]) 
                subset[i][j] =    subset[i][j]     ||     subset[i - set[j-1]][j-1]; 
            } 
        }

        for (int i = 0; i <= sum; i++) 				//for printing table
        	for (int j = 0; j <= n; j++) 
            	System.out.println (subset[i][j] +" " + i + " " + j); 
      
        return subset[sum][n]; 
	 } 
}