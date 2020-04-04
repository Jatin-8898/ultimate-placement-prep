class CountStringFormed{
	/*Given a length n, count the number of strings of length n that can be made using ‘a’, ‘b’ and ‘c’ with at-most one ‘b’ and two ‘c’s allowed.

	Examples :

	Input : n = 3 
	Output : 19 
	Below strings follow given constraints:
	aaa aab aac aba abc aca acb acc baa
	bac bca bcc caa cab cac cba cbc cca ccb 

	Input  : n = 4
	Output : 39

	O(1) solution is given
*/
	public static void main(String[] args) {
		int n = 3;
		System.out.println(countStr(n));
	}


    // Efficient Sol
	static int countStr(int n){ 
    
    	return 1 + (n * 2) +  (n * ((n * n) - 1) / 2); 
    }




    /*Exponential solution*/
    static int countString(int n,  int bCount,  int cCount) 
	{	 
	    // Base cases 
	    if (bCount < 0 || cCount < 0) 
	    	return 0; 
	    if (n == 0) 
	    	return 1; 
	    if (bCount == 0 && cCount == 0) 
	    	return 1; 
	  
	    // Three cases, we choose, a or b or c 
	    // In all three cases n decreases by 1. 
	    int res = countStr(n - 1, bCount, cCount); 
	    res += countStr(n - 1, bCount - 1, cCount); 
	    res += countStr(n - 1, bCount, cCount - 1); 
	  
	    return res; 
    }  
    
    static int countStr(int n,  int bCount,  int cCount) 
    { 
        // Base cases 
        if (bCount < 0 || cCount < 0) return 0; 
        if (n == 0) return 1; 
        if (bCount == 0 && cCount == 0) return 1; 
    
        // Three cases, we choose, a or b or c 
        // In all three cases n decreases by 1. 
        int res = countStr(n - 1, bCount, cCount); 
        res += countStr(n - 1, bCount - 1, cCount); 
        res += countStr(n - 1, bCount, cCount - 1); 
    
        return res; 
    } 
}