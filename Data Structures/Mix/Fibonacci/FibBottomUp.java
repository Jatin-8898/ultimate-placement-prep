class FibBottomUp{
	public static void main(String[] args) {
		int n = 10  ;
		int res = bottomUpFib(n);
		System.out.println(res);
	}

	private static int bottomUpFib(int n){
		if(n==1 || n==2)
			return 1;

		int[] bottomUp = new int[n+1];
		bottomUp[1] = 1;
		bottomUp[2] = 1;

		for (int i=3; i<n+1; i++ ) {
			bottomUp[i] = bottomUp[i-1] + bottomUp[i-2];
		}
		return bottomUp[n];
	}
}