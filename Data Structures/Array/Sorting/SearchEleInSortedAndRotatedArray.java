import java.util.Arrays;

class SearchEleInSortedAndRotatedArray{
	/*An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
	*/
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 2};
		int key = 1;
		int res = pivotedSearch(arr,key);
		System.out.println(res);
	}

	private static int pivotedSearch(int arr[], int key){
		int n = arr.length;

		int pivot  = findPivot(arr,0,n-1);		//Get the middle element

		// If we didn't find a pivot, then 
       // array is not rotated at all
       if (pivot == -1)
           return binarySearch(arr, 0, n-1, key);
       
       // If we found a pivot, then first 
       // compare with pivot and then
       // search in two subarrays around pivot
       if (arr[pivot] == key)
           return pivot;


       if (arr[0] <= key)
           return binarySearch(arr, 0, pivot-1, key);


       return binarySearch(arr, pivot+1, n-1, key);
	} 


	private static int binarySearch(int arr[], int low, int high, int key)
    {
       if (high < low)
           return -1;
        
       int mid = (low + high)/2;  /* low + (high - low)/2; */      

       if (key == arr[mid])
           return mid;

       if (key > arr[mid])
           return binarySearch(arr, (mid + 1), high, key);

       return binarySearch(arr, low, (mid -1), key);
    }


	private static int findPivot(int[] arr, int low, int high){
		if(low<high){//Base case

			if(high == low)
				return low;

			int mid = high+low/2;		//get mid

			if(mid < high && arr[mid] > arr[mid+1])
				return mid;

			if(mid > low  && arr[mid] < arr[mid-1])
				return (mid-1);

			if(arr[low] >= arr[mid])
				return findPivot(arr,  low,  mid-1);


			return findPivot(arr,   mid+1,  high);


		}else{
			return -1;
		}
	}

}