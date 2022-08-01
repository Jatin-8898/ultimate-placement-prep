class FindDuplicate{
	/*Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

	For example, let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.*/
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 3, 6, 6};
		findDuplicate(arr);
	}
	static void findDuplicate(int a[]){
		int i;
		int n = a.length;
		System.out.println("The Repeating Elements are: ");

		/*traverse the list for i= 0 to n-1 elements
		{
		  check for sign of A[abs(A[i])] ;
		  if positive then
		     make it negative by   A[abs(A[i])]=  -A[abs(A[i])];
		  else  // i.e., A[abs(A[i])] is negative
		     this   element (ith element of list) is a repetition
		}
		*/
		for (i=0; i<n; i++) {

			if(a[Math.abs(a[i])]  >= 0){
				a[Math.abs(a[i])] =  -a[Math.abs(a[i])];	//this is to make the -ve sign
			}else
				System.out.println(Math.abs(a[i]) + " ");   //if alreaady -ve means we have seen so Repetition
		}

	}
}