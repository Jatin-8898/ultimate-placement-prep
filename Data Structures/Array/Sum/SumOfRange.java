import java.util.*;
public class SumOfRange {
  
  	public static void main(String[] args) {
       
	    SumOfRange sor = new SumOfRange();
        int[] arr = {1, -2, 3, 10, -8, 0};
 	    int size = 6;

	    // Calling the preprocessing function once
	    sor.preprocessing(arr, size);

	    // These are the different queries that we are asking
       	System.out.println("Query 1 sumRange(0,2) is equal to: " + sor.sumOfRange(0, 2));
	    System.out.println("Query 2 sumRange(1,4) is equal to: " + sor.sumOfRange(1, 4));
	    System.out.println("Query 1 sumRange(3,3) is equal to: " + sor.sumOfRange(3, 3));
  	}
  
    // Initializing sum array globally with a large integer value
	private int[] sum = new int[10];
   
 	// Considering n is not equal to 0
    private void preprocessing(int[] arr, int n){

	    sum[0] = arr[0];
	 
   		for(int i = 1; i <= n - 1; i++){
			sum[i] = sum[i - 1] + arr[i];
			System.out.println(Arrays.toString(sum));
    	}
	}
    
   
    // Assuming we are asking genuine queries and not out of bound i and j values 
    private int sumOfRange(int i, int j){
      
	    if(i == 0){
			  return sum[j];
	    }else{
	         return sum[j] - sum[i - 1];
   		 }	

    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        