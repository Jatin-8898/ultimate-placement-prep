
import java.util.*;
class ChefAndTeacher{
	/*Chef's math teacher gave him an assignment where he had to find whether there can be a pair(x,y) of prime numbers such that their sum is equal to N.

	Chef was bored trying to figure it out manually so he asked you for help.
	
	Help chef finding out whether there is any pair of primes such that their sum is equal to N
	

	The first line of the input contains an integer T denoting the number of test cases.
	Every test case contains a single integer N 
		Input:
		3
		10
		11
		15

		Output:
		YES
		NO
		YES
*/
	public static void main(String[] args) {


		/*
		SOLVE USING SEIVE OF ERATOSTHENES IN ARRAYMIX	
	
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of test cases ");
		int t = s.nextInt();

		while(t!=0){
			System.out.println("Enter the number ");
			int n = s.nextInt();

			boolean res = isPrimePair(n);
			if(res == true)
				System.out.println("YES\n");
			else
				System.out.println("NO\n");	

			t--;
		}
	}

	private static boolean isPrimePair(int sum){
		int[] found = generatePrime(sum);

		for (int i=0; i<found.length; i++) {
			for (int j=i+1; j<found.length; j++) {

				//Check if the (sum-a[i] == a[j])
				if( sum - found[i]   ==  found[j] ){
					return true;
				}
			}	
		}
		return false;
	}

	private static int[] generatePrime(int n){
		int flag;
		int[] arr = new int[n];
		int k = 0;


		for (int i=2; i<=n; i++) {
			flag = 1;

			for (int j=2; j<=i/2; j++) {
				
				if(i%j == 0){	//Number is not prime
					flag = 0;
					break;
				}
			}

			if(flag == 1){
				arr[k] =  i;	//is Prime so store it in array
				//System.out.println(arr[k]);
				k++;
			}


			
		}

		return arr;

	}
}