class CountSqaure{

	public static void main(String[] args) 
	{ 
		int m = 4, n = 3; 
		System.out.println("Count of squares is " + countSquares(m, n)); 
	} 

	static int countSquares(int m, int n) 	{ 
	
		if (n < m) 
	    { 
	        // swap(m, n) 
	        int temp = m; 
	        m = n; 
	        n = temp; 
	    } 	
		
		
			// Now n is greater dimension,  apply formula 
			return n * (n+1) * (3 * m-n + 1 ) / 6;
		} 
	
	
}