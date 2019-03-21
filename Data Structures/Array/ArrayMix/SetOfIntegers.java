import java.util.*;

public class SetOfIntegers{

	static int count = 0;

	/*The task is to find out the elements present between two Integers
	which are already in the array ie A[] = 3 4 5 9.
	The program should find 3 and 9 and return the count as 2 since 4,5 r present */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total Number of Elements: ");
		int num  = s.nextInt();

		int a[] = new int[num];		//Create an array of size num
		System.out.println("Enter the Elements: ");
		for(int i=0; i<num; i++){
			a[i] = s.nextInt();
		}

		System.out.println("Enter the x element");
		int x = s.nextInt();
		System.out.println("Enter the y element");
		int y = s.nextInt();
		
		int res = CountTheSetOfIntegers(a,x,y);
		System.out.println("Numbers Between x and y are: "+res);
	}

	private static int CountTheSetOfIntegers(int a[],int x, int y){

		for (int i=0; i<a.length; i++) {
			if(a[i] != x && a[i] < y){
				count++;			
			}
		}
		return (count)-1;
	}

}








/*System.out.println("ENTER THE STRING: ");
		String name = s.nextLine();
		//System.out.println(name);
		char[] charName = name.toCharArray();
		for(int i=0; i<charName.length; i++){
			System.out.println(charName[i]);	
		}*/