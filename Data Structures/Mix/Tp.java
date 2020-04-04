import java.math.BigInteger;

class Tp{
	public static void main(String[] args) {
		/*while(true){
			System.out.println("JV");
			
			BigInteger numberA = new BigInteger("987654321234567897855");
			BigInteger numberB= BigInteger.TEN;
			
			System.out.println(numberA);
			while(numberB != numberA){
				System.out.println("\nHEYA \n" + numberA +"\n");
				System.out.println("\n\n\n\n\n\n");
			}

		}*/


		// A quick way to swap using EX OR
		int a = 10,b = 20;
		a ^= b;
		b ^= a;
		a ^= b;


		/*Calculating the most significant digit: 
		To calculate the most significant digit of any number log can be directly used to calculate it.*/
		
		//Suppose the number is N then 
		/* double K = Math.log10(N);
		now K = K - Math.floor(K);
		int X = (int)Math.pow(10, K);*/
		//X will be the most significant digit




		/*Calculating the number of digits directly: 
		To calculate number of digits in a number, instead of looping we can efficiently use log :*/
		/*No. of digits in N = Math.floor(Math.log10(N)) + 1;*/



/*		Efficient trick to know if a number is a power of 2 The normal technique 
		of division the complexity comes out to be O(logN), but it can be solved using O(v) 
		where v are the number of digits of number in binary form.
*/
		/* Method to check if x is power of 2*/
		/*static boolean isPowerOfTwo (int x)
		{
		      First x in the below expression is 
		     for the case when x is 0 
		      return x!=0 && ((x&(x-1)) == 0);    
		}*/
	}
}