class FibDynamic{

	/*HERE we r using the memoization technique becoz this is much more efficeient than the 
	recursive since this works in O(n) times*/
	public static void main(String[] args) {
		int n = 8;
		int[] memo = new int[n+1];	
		int res = dynamicFib(n,memo);
		System.out.println(res);
	}

	private static int dynamicFib(int n,int[] memo){
		int result = 0;

		if(memo[n] != 0)
			return memo[n];

		if(n==1 || n==2)
			result = 1;
		else{
			result  = dynamicFib(n-1,memo) + dynamicFib(n-2,memo);
			memo[n] = result;
		}

		return result;
	}

}