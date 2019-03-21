class SortArrayOfZeroOneTwo{
	/*Sort an array of 0s, 1s and 2s
	Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. 
	The functions should put all 0s first, then all 1s and all 2s in last.
	Examples: 	Input :  {0, 1, 2, 0, 1, 2}
				Output : {0, 0, 1, 1, 2, 2}
	
	The unknown region is shrunk while maintaining these conditions

	Lo := 1; Mid := 1; Hi := N;
	while Mid <= Hi do
	Invariant: a[1..Lo-1]=0 and a[Lo..Mid-1]=1 and a[Hi+1..N]=2; a[Mid..Hi] are unknown.
	case a[Mid] in
	0: swap a[Lo] and a[Mid]; Lo++; Mid++
	1: Mid++
	2: swap a[Mid] and a[Hi]; Hi–
	*/

	public static void main(String[] args) {
		int arr[] = {2, 1, 1, 2, 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sortElements(arr, arr.length);
		System.out.println("SORTED ARRAY: ");
		printArray(arr,arr.length);
		
	}
	private static void printArray(int arr[], int arr_size)
    {
        for (int i = 0; i < arr_size; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }

	private static void sortElements(int[] a, int n){
		int low = 0;
		int high = n-1;
		int mid = 0;
		int temp = 0;

		while(mid <= high){

			switch(a[mid]){		//			low	     mid	
				case 0:			//Eg 0 0 0  1  1  1   0  1 1 2 2

					//We will swap low and mid to make it sorted
					temp = a[low];
					a[low] = a[mid];
					a[mid] = temp;
					mid++;
					low++;
					break;

							//		low   mid
				case 1:		//Eg 0 0 0 1 1 1
					mid++;
					break;

							//				mid     hi
				case 2:		//Eg 0 0 0 1 1  2    1   2    2

					//We will swap with high to make it sorted
					temp = a[mid];
					a[mid] = a[high];
					a[high] = temp;
					high--;
					break;
			}
		}
	}
}