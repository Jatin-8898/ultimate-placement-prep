import java.util.*;
class ChefAndPolygon{
	/*
Given the number of sides, N, of the cake Chef is baking today and also the measure of its first angle(smallest angle), A, find the measure of the Kth angle.

Input:
The first line contains a single integer T, the number of test cases.
The next T lines contain three space separated integers N, A and K, the number of sides of polygon, the first angle and the Kth angle respectively.
Output:
For each test case, print two space separated integers X and Y, such that the Kth angle can be written in the form of X/Y and gcd(X,Y)=1

Sample Input:
    1
    3 30 2
Sample Output:
    60 1


*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while(t!=0){
			int n = s.nextInt();
			int a = s.nextInt();
			int k = s.nextInt();
			int num = a * n * (n-1)  +  ((n-2) *  360-2 * a *n ) *(k-1);
			//System.out.println(num + " " +"Numerator");
			int den = n * (n-1);

			int gcd=gcd(num, den);	//Call func
			//System.out.println(gcd+ "" +"HI");
			System.out.println(num/gcd+ " " + den/gcd);

			t--;
        }
        s.close();
	}

	static int gcd(int a, int b)
	    {
	        // Everything divides 0 
	        if (a == 0 || b == 0)
	           return 0;
	      
	        // base case
	        if (a == b)
	            return a;
	      
	        // a is greater
	        if (a > b)
	            return gcd(a-b, b);
	        
	        return gcd(a, b-a);
	    }
}