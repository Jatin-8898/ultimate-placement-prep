class MoveNegToLeftSide{
	public static void main(String[] args) {
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
	}	
}