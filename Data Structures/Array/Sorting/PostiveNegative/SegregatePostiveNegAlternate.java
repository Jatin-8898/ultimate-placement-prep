class SegregatePostiveNegAlternate{
	/*An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and negative numbers are placed alternatively. Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.*/

	public static void main(String[] args) {
		/*The solution is to first separate positive and negative numbers using partition process of QuickSort. In the partition process, consider 0 as value of pivot element so that all negative numbers are placed before positive numbers. Once negative and positive numbers are separated, we start from the first negative number and first positive number, and swap every alternate negative number with next positive number.*/

		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        rearrange(arr,n);
        for(int i: arr)
        	System.out.print(i + " ");
	}


	private static void rearrange(int[] arr,int n){
		//The idea is to apply the merge sort ie conside the pivot as 0 and sort around it.
		int i=-1;
		int temp = 0;


		//This loop makes all the neg on the left side of the array.
		for (int j=0; j<n; j++) {//eg   -1    2    -3   -4
		
			if(arr[j] < 0){		//means its negative eg -1,   now when -3

				i++;			//keep i on 0 and swap,     i is at 0 so keep it on index1 ie 2
				temp = arr[i];								
				arr[i] = arr[j];
				arr[j] = temp;			//and swap so we get -1  -3   2 -4 
			}					
		}

		//Now all the positive numbers are the end so we will swap it alternatley
		int ahead = i + 1;
		int neg = 0;

		while(ahead < n &&    neg < ahead  &&  arr[neg] < 0){
			
			temp = arr[neg];
			arr[neg] = arr[ahead];
			arr[ahead] = temp;
			ahead++;
			neg = neg + 2;		//Increment by 2 since we want alternate.

		}

	}
}