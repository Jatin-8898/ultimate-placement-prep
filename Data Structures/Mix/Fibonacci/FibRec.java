class FibRec{

	/*Very vry inefficient becoz it works in 
    Time complextiy O(2^n)          NEVER USE THIS 
	*/
	public static void main(String[] args) {
		int n = 10;		//if n=1000000000 gives Stack Overflow error
		int res = recursiveFib(n);
		System.out.println(res);
	}

	private static  int recursiveFib(int n){
		int result = 0;

		if(n==1 || n==2)
			return 1;

        result  = recursiveFib(n-1) + recursiveFib(n-2);
		return result;
	}
}