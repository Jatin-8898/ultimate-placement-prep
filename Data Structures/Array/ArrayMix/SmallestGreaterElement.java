class SmallestGreaterElement{
	
	/*An array is given of n length, and we need to calculate the next greater element for each element in given array. If next greater element is not available in given array then we need to fill ‘_’ at that index place.*/

	public static void main(String[] args) {
		int a[] = {6 ,3 ,9 ,8 ,10 ,2 ,1 ,15 ,7};
		int n = a.length;
		smallestGreaterElement(a,n);
	}

	/*A simple solution is to use two loops nested. The outer loop picks all elements one by one and inner loop finds the next greater element by linearly searching from beginning to end.*/
	static void smallestGreaterElement(int a[],int n){

		for (int i=0; i<n; i++) {

			//Find the closest greater element for arr[j] in the entire array.
			int diff = Integer.MAX_VALUE;	//eg 100
			int closest  = -1;


				//This loops compares eg 6 with every element in array and eg finds 7 so prints it.
				for (int j=0; j<n; j++) {
					
					//We check if number is smaller and store the diff
					//We iterate until the end of the array by storing diff
					//If we found the diff to be smaller we make it the diff and closest as j

					if(a[i] < a[j] && a[j] - a[i] < diff){//wen 6 < 9
						//System.out.println("HERE " + a[i] + " " + a[j]);
						diff = a[j]  - a[i];	//3
						closest = j;			//now 9
						//System.out.println("CLOS: "+closest);
					}
				}


			if(closest == -1)
				System.out.print("_ ");
			else
				System.out.print(a[closest] + " ");	
			
		}
	}
}