class RodCutter {

    /*Given a rod of length n inches and an array of prices that contains prices of all pieces of size smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example, if length of the rod is 8 and the values of different pieces are given as following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)


	length   | 1   2   3   4   5   6   7   8  
	--------------------------------------------
	price    | 1   5   8   9  10  17  17  20
	And if the prices are as following, then the maximum obtainable value is 24 (by cutting in eight pieces of length 1)
*/

    public static void main(String args[])
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "+
                            cutRod(arr, size));
 
    }
    /* Returns the best obtainable price for a rod of length
       n and price[] as prices of different pieces */
    static int cutRod(int price[], int n)
    {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
 
        // Recursively cut the rod in different pieces and
        // compare different configurations
        for (int i = 0; i<n; i++)
            max_val = Math.max(max_val,  price[i] + cutRod(price, n-i-1));
 
        return max_val;
    }
 
   


/*DYNAMIC SOL
// A Dynamic Programming solution for Rod cutting problem
class RodCutting
{
    // Returns the best obtainable price for a rod of
       length n and price[] as prices of different pieces 
    static int cutRod(int price[],int n)
    {
        int val[] = new int[n+1];
        val[0] = 0;
 
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i<=n; i++)
        {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val, 
                                   price[j] + val[i-j-1]);
            val[i] = max_val;
        }
 
        return val[n];
    }
 
    public static void main(String args[])
    {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is " +
                            cutRod(arr, size));
    }
}
*/


    /*private int rodCutter(int[] cost, int n){
  
	      // Initializing rod array
	      int[] rod = new int[n + 1];
	      rod[0] = 0;
	 

	      // Loop for each rod length 'i'
	      for(int i = 1; i <= n; i++){
	  
		      int maxValue = Integer.MIN_VALUE;
	         
	          // Loop for smaller cut lengths 'j'
		      for(int j = 1; j <= i; j++){
	        
		      // Updating maxValue
			  maxValue = Math.max(maxValue, cost[j] + rod[i - j]);

	       }
	  
	       	 rod[i] = maxValue;

	       }
	   
	    return rod[n];
}



	 public static void main(String[] args) {

	       RodCutter rc = new RodCutter();
	    
	       int[] cost = {1, 5, 8, 9, 10, 17, 17, 20};
	  
	       int size = cost.length-1;                
	       // n is always 1 less than cost array length because 0th element is cost[0]
	    
	       System.out.println("Maximum value that can be earned by cutting up the rod and selling the pieces of the cost array {0, 2, 4, 7, 8} is: " + rc.rodCutter(cost, size));

	  }
*/

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        