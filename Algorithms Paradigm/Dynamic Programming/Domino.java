public class DominoArrangements 
{
    
	public static void main(String args[]) {

	        DominoArrangements da = new DominoArrangements();
       
	        System.out.println("The number of domino arrangements for n = 6 is " + da.numberOfArrangements(6));
    
	}
    
    

	private int numberOfArrangements(int n){
        
		int[] ways = new int[n + 1];
    
		// Base cases    
       
	        ways[0] = 1;
        
	        ways[1] = 1;
        
       
	        for(int i = 2; i <= n; i++){
        
		    ways[i] = ways[i - 1] + ways[i - 2];
        
		}
        
  
	        return ways[n];
    
	}

}
