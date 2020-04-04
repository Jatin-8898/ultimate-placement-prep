import java.util.*;
class FindMultiples{
	/*  Multiples of 3 and 5 WITHOUT using % operator
		Write a short program that prints each number from 1 to n on a new line.

		For each multiple of 3, print “Multiple of 3” instead of the number.
		For each multiple of 5, print “Multiple of 5” instead of the number.
		For numbers which are multiples of both 3 and 5, print “Multiple of 3. 
		Multiple of 5.” instead of the number.
	*/

	public static void main(String[] args) {
		findMultiples(20);
	}

	private static void findMultiples(int n){
		int a = 3;
		int b = 5;
		for (int i=1; i<=n; i++) {
			String s = "";

			//Found multiple of 3, Increment a by 3 and print
			if(i == a){
				a += 3;
				s += "Multiple of 3";

			} 
			//Found multiple of 5,Increment b by 5 and print
			if(i == b){	
				b += 5;
				s += "Multiple of 5";

			}

			if(s == ""){
				System.out.println(i);
			}else{
				System.out.println(s);
			}	

		}
	}
}