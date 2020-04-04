import java.util.*;


public class MinRotateToGetCurrentString{
	
	/*Given a string, we need to find the minimum number of rotations 
	required to get the same string..*/
	
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING:");	
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); 

		int result = findRotations(str);
		System.out.println(result);
	}


	private static int findRotations(String s){
		
		int length = s.length();
 		String temp = s + s;
		
		for (int i = 1; i<=length; i++) {
			//substring from i index of original string size i.e. str.length()+i.
			String subStr = temp.substring(i, length+i);	

			// if substring matches with original string
            // then we will come out of the loop.
			if(s.equals(subStr))
				return i;
			
		}
		
        return length;

	}

}