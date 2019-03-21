class EfficientSearchInSortedRotated{
	/*
	1) Find middle point mid = (l + h)/2
	2) If key is present at middle point, return mid.
	3) Else If arr[l..mid] is sorted
	    a) If key to be searched lies in range from arr[l]
	       to arr[mid], recur for arr[l..mid].
	    b) Else recur for arr[mid+1..r]
	4) Else (arr[mid+1..r] must be sorted)
	    a) If key to be searched lies in range from arr[mid+1]
	       to arr[r], recur for arr[mid+1..r].
	    b) Else recur for arr[l..mid] */
	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 6;
        
        int i = search(arr, 0, n-1, key);
        if (i != -1) 
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
	}

	private static int search(int[] arr,int low,int high,int key){
		if(low > high)
			return -1;

		int mid = (low + high) /2;

		if(arr[mid] == key)
			return mid;


		// If arr[l...mid] is sorted 
		if(arr[low] <= arr[mid]){
			/* As this subarray is sorted, we can quickly check if key lies in half or other half */
            if(key >= arr[low] && key < arr[mid])	//if its in left subarray
            	return search( arr,  low, mid-1, key); //go in left subarray

            return search( arr, mid+1, high, key); //else right subarray

		}

		/* If arr[l..mid] is not sorted, then arr[mid... r] must be sorted*/
        else if(key >= arr[mid] && key <= arr[high])  {	
        	return search(arr, mid+1, high, key);		//Search in the right side
        
        }
        else{									//else again find the key in left side
        	return search(arr, low, mid-1, key);
        }

	}

}