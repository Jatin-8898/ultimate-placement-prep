class SieveOfEratosthenes{
	/*Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.

	Example:

	Input : n =10
	Output : 2 3 5 7 

	Input : n = 20 
	Output: 2 3 5 7 11 13 17 19

	The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller than 10 million or so
*/
	public static void main(String[] args) {
		/*The idea is to mark all the numbers eg till 50 which r multiple of 2 3 & 5 as false
		the numbers left are the prime numbers which are true*/

		int n = 50;
		sieveOfEratosthenes(n);
	}

	private static void sieveOfEratosthenes(int n){	//eg 10

		//Create a boolean array and mark it as true
		boolean[] arr = new boolean[n+1];
		for (int i=0; i<arr.length; i++) {
			arr[i] = true;
		}

		//Always start with 4 thats y we did 2*2

		//for eg 2 then 2*2 4 should be less than 10
		for (int p = 2;     p * p <= n ;   p++) {
			
			//Coz if its false no need to mark it again
			if(arr[p] == true){

				//Now mark it as false all the multiples of 2 3 5 7
				for (int i = p * 2;   i<=n;   i += p) {
					arr[i] = false; 
				}

			}

		}

		for(int i = 2; i <= n; i++)
        {
            if(arr[i] == true)
                System.out.print(i + " ");
        }

	}
}