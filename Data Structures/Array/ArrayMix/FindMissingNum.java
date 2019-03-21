/*Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. 
There are no duplicates in list. One of the integers is missing in the list.
 Write an efficient code to find the missing integer.
 */
class FindMissingNum{
	/*	1) XOR all the array elements, let the result of XOR be X1.
  		2) XOR all numbers from 1 to n, let XOR be X2.
  		3) XOR of X1 and X2 gives the missing number.
  	*/
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,8,9};
		int n = a.length;
		System.out.println("Missing Number is: " + getMissingNumber(a,n));	
		System.out.println("Missing Number is: " + getMiss(a,n));	
	}

	/*in O(n) Complexity*/
	static int getMissingNumber(int a[],int n){
		int x1 = a[0];
		int x2 = 1;

		/*For xor of the elements in array 1,2,3,4,5,6,8,9*/
		for (int i=1; i<n; i++) {
			x1 = x1 ^ a[i];		//1 ^ 1 so store in x1 = 0
		}


		/*For xor of ALL the elements from 1 to n+1 */
		for (int i=2; i<=n+1; i++) {//Eg: 1 2 3 4 5 6   ..   n
			x2 = x2 ^ i;
		}

		//Finds exactly one Misssing Number
		return (x1 ^ x2);
	}	

	/*ANOTHER WAY OF O(n)*/
	static int getMiss(int a[],int n){
		int i, total;
		System.out.println(n);
		total = (n+1)  * (n+2) / 2;

		for ( i=0; i<n ; i++) {
			total -= a[i];
		}
		return total;
	}

}