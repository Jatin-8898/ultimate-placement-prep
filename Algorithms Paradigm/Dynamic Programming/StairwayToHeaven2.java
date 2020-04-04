public class StairwayToHeaven2 
{
    
	public static void main(String args[]) {

	    StairwayToHeaven2 sth2 = new StairwayToHeaven2();
            int[] fee = {2, 1, 3, 1, 2};
	        System.out.println(sth2.calculate(fee, 5));
	}
    
    

	private int calculate(int[] fee, int n){
	    int[] minFee = new int[n + 1];
	    // Base cases
	    minFee[0] = 0;
	    minFee[1] = minFee[2] = fee[0];
	    
	    // 'i' sets the stair number
	    for(int i = 3; i <= n; i++){
	        // general recurrence relation
	        minFee[i] = Math.min(minFee[i - 1] + fee[i - 1], Math.min(minFee[i - 2] + fee[i - 2], minFee[i - 3] + fee[i - 3]));
	    }
	    
	    return minFee[n];
	}

}
