class LeadersOptimize{
	public static void main(String[] args) {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
        int n = arr.length; 
        printLeaders(arr, n); 
	}
	private static void printLeaders(int arr[], int n){

		int maxRight  = arr[n-1];
        System.out.print(maxRight + " "); /* Rightmost element is always leader */

		for (int i = n-2;  i>=0;  i--) {
			
			if(maxRight < arr[i]){

				maxRight = arr[i];
				System.out.print(maxRight + " ");

			}
		}
	}
}