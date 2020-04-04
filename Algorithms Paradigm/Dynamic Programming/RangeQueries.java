class RangeQueries{
	/*
	An efficient approach would be to take another array and store the product of all elements upto element with index i in the i’th index of the array. But there is a catch here. If any of the elements in the array is 0, the dp array will contain 0 from then onwards. Hence we should be getting 0 as our answer even if that 0 does not lie in the range between lower and upper.
	
	To solve this case, we have used another array called countZeros which will contain the number of ‘0’s the array contains upto index i.
	
	Now if countZeros[upper]-countZeros[lower] > 0, it signifies that there is a 0 in that range and hence the answer would be 0. Else we would proceed accordingly.
	*/
	public static void main(String[] args) {
		long[] arr = new long[] { 0, 2, 3, 4, 5 }; 
        int[] lower = {1, 2}; 
        int[] upper = {3, 2};      
        findProduct(arr, lower, upper);
	}

	static void findProduct(long[] arr, int[] lower, int[] upper) { 
        int n = arr.length; 
        long[] preProd = new long[n]; 		//dp
        int[] countZeros = new int[n]; 
  
        long prod = 1; // stores the product 
		int count = 0;	//keep count of zeroes

		for(int i=0; i<n; i++){
			
			if(arr[i]==0)
				count++;
			else
				prod  = prod * arr[i];

			preProd[i] = prod;		//store the value in the dp
			countZeros[i]  = count;		//store zero count in array
		}


		//Now the table is ready in O(n) let us answer the queries in O(1)
		for (int i = 0; i < lower.length; i++) { 
            int l = lower[i]; 
            int u = upper[i]; 
  			
  			if(l == 1){									//Range starts from 1st element

                if (countZeros[u - 1] == 0) 			// range does not contain any zero 
                    System.out.println(preProd[u - 1]); 
                else 									// zeros are present in the range
                    System.out.println(0); 

  			}else{										// range starts from any other index 

  				 // no difference in countZeros indicates that there are no zeros in the range 
                if (countZeros[u - 1] - countZeros[l - 2] == 0) 
                    System.out.println(preProd[u - 1] / preProd[l - 2]); 
                else 										// zeros are present in the range 
                    System.out.println(0); 	
  			}
  		}
    }   
}