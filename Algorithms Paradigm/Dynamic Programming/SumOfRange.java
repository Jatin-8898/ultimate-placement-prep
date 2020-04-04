public class SumOfRange {
  
    // Initializing sumUntil array globally with a large integer value
	private int[] sumUntil = new int[100000];

   
   // Considering n is not equal to 0
    private void preprocessing(int[] myArray, int n){

        sumUntil[0] = myArray[0];
        
        for(int i = 1; i <= n - 1; i++){
            sumUntil[i] = sumUntil[i - 1] + myArray[i];
        }
    }
    
    // Assuming we are asking genuine queries and not out of bound i and j values 
    private int sumOfRange(int i, int j){
      
	    if(i == 0){        
		    return sumUntil[j];   
	    }

	    else{
	        return sumUntil[j] - sumUntil[i - 1];
        }

    }
    
    

	public static void main(String[] args) {
	    SumOfRange sor = new SumOfRange();
        int[] myArray = {1, -2, 3, 10, -8, 0};
       
 	    int size = 6;  

	    // Calling the preprocessing function once
	    sor.preprocessing(myArray, size);  

	    // These are the different queries that we are asking
        System.out.println("Query 1> sumRange(0,2) is equal to: " + sor.sumOfRange(0, 2));
   
	    System.out.println("Query 2> sumRange(1,4) is equal to: " + sor.sumOfRange(1, 4));
  	
	    System.out.println("Query 1> sumRange(3,3) is equal to: " + sor.sumOfRange(3, 3));
  
    }

}