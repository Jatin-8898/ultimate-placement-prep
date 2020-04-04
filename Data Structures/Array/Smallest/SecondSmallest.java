class SecondSmallest{
	public static void main(String[] args) {
		int[] arr = {10, 1 ,5, 2};
		int n = arr.length;
		getTheSecondSmallestElement(arr,n); 
	}

	private static void getTheSecondSmallestElement(int[] a, int n){

		int second = Integer.MAX_VALUE;
		int first = Integer.MAX_VALUE;

		for (int i=0; i<n; i++) {
			
			if(a[i] < first){		//eg 10 is less then max_value
				second = first;		//when 2nd we run make the first as second and store the first
				first = a[i];

			}else if (a[i] < second && a[i] != first) {	//if we found smaller then second 
				second = a[i];							//then update the Second value
			}	
		}
		System.out.println("THE SMALLEST IS " + first + " \nSECOND SMALLEST IS "+ second);
	}
}