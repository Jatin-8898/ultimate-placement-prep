import java.util.*;
class TransformToOther{

	/*Given two strings A and B, the task is to convert A to B if possible. 
	The only operation allowed is to put any character from A and insert it at front. 
	Find if it’s possible to convert the string. 
	If yes, then output minimum no. of operations required for transformation.*/
	
	public static void main(String[] args) {
		String s1 = "EACBD";
        String s2 = "EABCD";

		int res = minTransformation(s1,s2);
		System.out.println("ENTERED: "+ s1 +" " + s2);
		System.out.println("Result is: "+ res);
	}

	private static int minTransformation(String s1, String s2){
		
		int len1 = s1.length();
		int len2 = s2.length();

		if(len1 != len2)
			return -1;

		int i, j, res = 0;
		int count [] = new int [256];

		 // count characters in A
         
        // subtract count for every character in B
        for(i = 0; i < len1; i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
		
		// Check if all counts become 0 if not return -1
		for(i = 0; i < 256; i++)	
            if(count[i] != 0)
                return -1;


        i = s1.length() - 1;
        j = s2.length() - 1;
 
        while(i >= 0)
        {
            // If there is a mismatch, then 
            // keep incrementing result 'res'
            // until B[j] is not found in A[0..i]
            if(s1.charAt(i) != s2.charAt(j))
                res++;
            else
                j--;
            	i--;         
        }
        return res;      


	}


}