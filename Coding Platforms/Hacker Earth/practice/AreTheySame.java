/*You are given two strings. You have to check if the strings are permutations of each other and output "YES" or "NO" accordingly without quotes.


Input: 
2 lines of input each containing a string. (a to z and 0 to 9) 
Output: 
A single line containing YES or NO.


Constraints:
String would not contain any spaces. size of string < 100 */

import java.util.*;
class AreTheySame {
    
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
    
        String s1 = s.nextLine();                 // Reading input from STDIN
        String s2 = s.nextLine();                 // Reading input from STDIN
    
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
    
        int flag =0;
		if(s1.length()!=s2.length())
			System.out.println("NO");
		else{
	
			for(int i=0;i<char1.length;i++)
			{
				if(char1[i]==char2[i])
					continue;
				else
					flag = 1;
			}
	
			if(flag==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
    }
}
