class FindPrimeNumberWithGivenSum{
	public static void main(String[] args) {
		int n = 74;
		findPrimePair(n);

	}

	private static void findPrimePair(int n){
		// Generating primes using Sieve
        boolean isPrime[]  =  new boolean[n + 1];
        SieveOfEratosthenes(n, isPrime);

        // Traversing all numbers to find first pair
        for (int i = 0; i < n; i++)
        {

        	//The idea is to compute the prime numbers 
            if (isPrime[i] && isPrime[n - i])
            {
                System.out.print(i + " " + (n - i) + " ");
                return;
            }
        }
	}






	private static boolean SieveOfEratosthenes(int n, boolean[] isPrime){
		
		//By default 0 n 1 are false
		isPrime[0] = isPrime[1] = false;

		for (int i=2; i<n; i++) {
			isPrime[i] = true;
		}

		//Always start with 4 thats y we did 2*2

		//for eg 2 then 2*2 4 should be less than 10
		for (int p=2;  p*p <= n ; p++) {
			
			//Coz if its false no need to mark it again
			if(isPrime[p] == true){

				//Now mark it as false all the multiples of 2 3 5 7
				for (int i=p*2;   i<=n;   i = i + p) {
					isPrime[i] = false; 
				}

			}
		}
		return false;
	}
}