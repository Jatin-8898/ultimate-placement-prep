// Java program to count total number of ways 
// to reach n-th stair with all jumps alowed 
class ClimbNStairs { 
    /* 
        Solution =>      2^(n-1)
    */
	static int calculateLeaps(int n) 
	{ 
		if (n == 0) 
			return 1; 
		return (1 << (n - 1)); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		System.out.println(calculateLeaps(5)); 
	} 
} 