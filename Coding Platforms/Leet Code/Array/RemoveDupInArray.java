package Array;

class RemoveDupInArray {

	/*This program just returns the index of the duplicate element found in the array 
	which is sorted or it can return the element thats it 
		O(n) Solution
	*/

	public static void main(String[] args) {
		int[] a = {1,1,2,3,4,5,5,6,7};	
		int ans = removeDuplicates(a);
		System.out.println("Duplicate Elment is at INDEX : "+ ans);
	}

	public static int removeDuplicates(int[] A) {
		int len = A.length;
		int i = 0;
		
		if (len <= 1)
			return len;
		
		for (int j = 1; j < len; j++) {


			//When the element r not same eg 2 3 them go ahead
			if (A[j] != A[i]){
				A[++i] = A[j];	//this moves the pointer ahead in both ie i and j
				//System.out.println(A[j] + " "+ A[++i] + " ");
			}

		
		}

		//return i + 1;
		//to return the dup element 
		return A[i+1];
	}
}