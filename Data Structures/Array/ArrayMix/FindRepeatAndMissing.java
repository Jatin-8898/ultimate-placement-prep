public class FindRepeatAndMissing {
	static int x, y;

	static void getTwoElements(int arr[], int n)
	{
		/* Will hold xor of all elements and numbers from 1 to n */
		int xor1;

		/* Will have only single set bit of xor1 */
		int set_bit_no;

		int i;
		x = 0;
		y = 0;

		xor1 = arr[0];

		/* Get the xor of all array elements */
		for (i = 1; i < n; i++)
			xor1 = xor1 ^ arr[i];
		for (i = 1; i <= n; i++)
			xor1 = xor1 ^ i;

		/* Get the rightmost set bit in set_bit_no */
		set_bit_no = xor1 & ~(xor1 - 1);

		/* Now divide elements into two sets by comparing
	rightmost set bit of xor1 with the bit at the same
	position in each element. Also, get XORs of two
	sets. The two XORs are the output elements. The
	following two for loops serve the purpose */
		for (i = 0; i < n; i++) {
			if ((arr[i] & set_bit_no) != 0)
				/* arr[i] belongs to first set */
				x = x ^ arr[i];

			else
				/* arr[i] belongs to second set*/
				y = y ^ arr[i];
		}
		for (i = 1; i <= n; i++) {
			if ((i & set_bit_no) != 0)
				/* i belongs to first set */
				x = x ^ i;

			else
				/* i belongs to second set*/
				y = y ^ i;
		}
		System.out.println(x + " "+ y);
		/* *x and *y hold the desired output elements */
		boolean isMissing = true;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] == x){
				isMissing = false;
				break;
			}
		}
		if(isMissing)
			System.out.println(" The missing element is " + x + " The repeating number is " + y);
		else
			System.out.println(" The missing element is " + y + " The repeating number is " + x);
	}
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 2, 5, 5, 6, 7 };

		int n = arr.length;
		getTwoElements(arr, n);
	}
}

// This code is contributed by Gitanjali.
