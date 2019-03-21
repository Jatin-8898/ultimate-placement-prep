import java.util.HashSet;
import java.util.*;
class MonkAndHisFriends{

	/*First line contains an integer T. T test cases follow.
	First line of each case contains two space-separated integers N and M.
	Second line contains N + M space-separated integers, the candies of the students.

	Output:
	For each test case, output M new line, Monk's answer to the M students.
	Print "YES" (without the quotes) or "NO" (without the quotes) pertaining to the Monk's answer*/
	/*1					NO
	2 3					NO
	3 2 9 11 2			YES

	Initially students with 3 and 2 candies are in the class.
	A student with 9 candies enters, No student with 9 candies in class. Hence, "NO"
	A student with 11 candies enters, No student with 11 candies in class. Hence, "NO"
	A student with 2 candies enters, Student with 2 candies found in class. Hence, "YES"
*/



	
	public static void main(String[] args) {
		/*This problem can be solved by map simply add the candy no. as key and value of it as 1.
		Then check for the all M values and if you find the value correspond to the key not 1 then simply output no and add that value into the map.*/
	}

	private static checkIfAlreadyPresentInArray(){

		Scanner s = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int t = s.nextInt();                 

       for(int j=0;j<t;j++){
           
           int n = s.nextInt();
           int m = s.nextInt();
           
          
           Set<Integer> set = new HashSet<>();
           for(int i=0; i<n; i++){
               int num = s.nextInt();
               set.add(num);
               
           }
           
            for (int i = 0; i < m; i++) {
                 int num2 = s.nextInt();
                 
                 if(set.contains(num2)){
                     ans.append("YES\n");
                 
                 }else{
                  	set.add(num2);
                    ans.append("NO\n");
                 } 
            }
           
           System.out.println(ans);
           
       }
	}
}