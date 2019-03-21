class RelativeComplement{
	/*Given two sorted arrays arr1 and arr2 of size m and n respectively. We need to find relative complement of two array i.e, arr1 – arr2 which means that we need to find all those elements which are present in arr1 but not in arr2.
	*/
	public static void main(String[] args) {
		int arr1[] = {3, 6, 10, 12, 15};
        int arr2[] = {1, 3, 5, 10, 16};
        int n = arr1.length;
        int m = arr2.length;
        relativeComplement(arr1, arr2, n, m);
	}
/*	1. Take two pointers i and j which traverse through arr1 and arr2 respectively.
	2. If arr1[i] element is smaller than arr2[j] element print this element and increment i.
	3. If arr1 element is greater than arr2[j] element then increment j.
	4. otherwise increment i and j.
*/
	private static void relativeComplement(int arr1[],int arr2[], int n ,int m){
		int i = 0, j = 0;
		
		while(i < n   &&    j < m){
			if(arr1[i] < arr2[j]){
				System.out.print(arr1[i] + " ");
				i++;

			}else if(arr1[i] > arr2[j]){
				j++;
			
			}else if(arr1[i] == arr2[j]){
				i++;
				j++;
			}
		}


		while(i < n)
			System.out.print(arr1[i] + " ");
	}
}