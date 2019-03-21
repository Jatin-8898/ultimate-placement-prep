import java.util.Collections;
import java.util.*;

class ArrayMisc{
	public static void main(String[] args) {
		int[] n = {3,1,9,5,2,8,3,4};
		Arrays.sort(n);
/*		for(int item:n){
			System.out.print(item + " ");
		}
*/		System.out.printf("SORTED: %s",Arrays.toString(n));


		/*REMEMBER:
		Collections works on Integer and not on Primitve datatypes such as int,char*/

		Integer[] b = {1,4,6,5,2,9,3,7,4};
		
		Arrays.sort(b, Collections.reverseOrder());

		System.out.println("\nDESCENDING ORDER: ");
		for(int item:b)	
			System.out.print(item + " "); 
	}
}