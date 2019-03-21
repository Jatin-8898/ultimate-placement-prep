class MaximumDiff{

	/*
	This works in 0(n^2) coz the outer loop picks the elements one by one and the inner loops compares each element and then gives the max difference
	*/
	public static void main(String[] args) {
		int[] arr = {2,3,10,6,4,8,1};
		getMaxDiff(arr);
	}

	private static void getMaxDiff(int[] a){

		int maxDiff = a[1] - a[0];

		for (int i=0;   i<a.length;   i++) {
	
			for (int j=i+1;   j<a.length;   j++) {

				if(a[j]  - a[i] > maxDiff){	
					maxDiff = a[j] - a[i];	//Same like finding the max Element	
				}
			}
		}
		System.out.println("Max Difference: "+ maxDiff);
	}
}

