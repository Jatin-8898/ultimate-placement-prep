class MoveNegToRightSide{
	/*Given an unsorted array of both negative and positive integer. The task is place all negative element at the end of array without changing the order of positive element and negative element.
	*/


	/*HERE EXTRA SPACE IS ALLOWED THAT IS WE USED ANOTHER ARRAY FOR DOING THE TASK*/

	public static void main(String[] args) {
		/*The problem becomes easier if we are allowed to use extra space. 
		1. Idea is create an empty array (temp[]). 
		2. First we store all positive element of given array and then we 
		    store all negative element of array in Temp[]. 
		3. Finally we copy temp[] to original array or return temp directly.
		*/

		int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };
        int n = arr.length;
 
        int[] a = segregateElements(arr, n);
        for(int i: a)
        	System.out.print(i + " ");
	}


	private static int[] segregateElements(int[] arr,int n){

		int[] temp = new int[n];

		int j =0;	//Index for the temp array 

		for (int i=0; i<n; i++) {	//Copy all the +ve elements into the temp array.
			
			if(arr[i] >=  0){
				temp[j++] = arr[i];
			}
		}


		//If the array contains all the +ve or -ve numbers
		if(j == n  ||  j == 0)
			return new int[0];


		for (int i=0; i<n; i++) {	//Copy all the -ve elements into the temp array.
			
			if(arr[i] <  0){
				temp[j++] = arr[i];
			}
		}


		return temp;


	}
}