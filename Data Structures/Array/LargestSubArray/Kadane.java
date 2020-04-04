class Kadane{
	/*Initialize:
	    max_so_far = 0
	    max_ending_here = 0

	Loop for each element of the array
	  (a) max_ending_here = max_ending_here + a[i]
	  (b) if(max_ending_here < 0)
	            max_ending_here = 0
	  (c) if(max_so_far < max_ending_here)
	            max_so_far = max_ending_here
	return max_so_far
	
	Explanation:
	Simple idea of the Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this). 
	And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). 
	Each time we get a positive sum compare it with max_so_far 
	and update max_so_far if it is greater than max_so_far
*/
	public static void main(String[] args) {
		//int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		int [] a = {-2, -3, -4, -1};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a) + "\n");

        maxSubArrayWithStartAndEndIndex(a);
	}

	static int maxSubArraySum(int[] a){
		
		int n = a.length;
		int maxSeenSoFar = 0;
        int maxEndingHere = 0;
        
        for(int i=0; i<n; i++){
            maxEndingHere = maxEndingHere + a[i];
            
            if(maxEndingHere < 0)
                maxEndingHere = 0;
            
            if(maxSeenSoFar < maxEndingHere)
                maxSeenSoFar = maxEndingHere;

        }
        return(maxSeenSoFar);
	}



/*MODIFIED KADANE WHICH RETURNS THE START AND THE END INDEX*/
static void maxSubArrayWithStartAndEndIndex(int[] a){	//-2, -3, 4, -1, -2, 1, 5, -3
	int max_so_far = 0, 
	max_ending_here = 0;
	int size = a.length, 
	start = 0,
	end = 0 ,
	s=0;
	
	for (int i = 0; i < size; i++) 
        {
            max_ending_here += a[i];
 
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
 
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
            
        }
        System.out.println("Maximum contiguous sum is " + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
}
}