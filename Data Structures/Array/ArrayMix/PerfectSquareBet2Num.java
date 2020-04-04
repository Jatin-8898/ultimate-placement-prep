// Java program to count squares between a and b 
public class PerfectSquareBet2Num { 

	static int countSquares(int a, int b) 
	{ 
		int cnt = 0; // Initialize result 

		// Traverse through all numbers 
		for (int i = a; i <= b; i++) 
			
			for (int j = 1; j * j <= i; j++)    // Check if current number 'i' is perfect square 
				if (j * j == i) 
					cnt++; 
		return cnt; 
    } 
    /*
        Method 2 (Efficient) We can simply take square root of ‘a’ and square root of ‘b’ and count the perfect squares between them using

        =>  floor(sqrt(b)) - ceil(sqrt(a)) + 1

        We take floor of sqrt(b) because we need to consider numbers before b.
        We take ceil of sqrt(a) because we need to consider numbers after a.

        For example, let b = 24, a = 8.  floor(sqrt(b)) = 4, ceil(sqrt(a)) = 3.  
        And number of squares is 4 - 3 + 1= 2. The two numbers are 9 and 16.  
    */
    static double countSquaresEff(int a, int b) 
    { 
        return (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1); 
    } 

    // Driver Code 
	public static void main(String[] args) 
	{ 
		int a = 9, b = 25; 
        System.out.println("Count of squares is " + countSquares(a, b)); 
        System.out.print("Count of squares is Eff " + (int)countSquaresEff(a, b)); 
	} 
} 
