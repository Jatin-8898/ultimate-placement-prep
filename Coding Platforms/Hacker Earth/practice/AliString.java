import java.util.*;
/*
He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)
*/

class AliString {
    public static void main(String args[] ) throws Exception {
      
        Scanner scan = new Scanner(System.in);
        String s1 = "12X345-67";
        String s = "22X644-62";
        System.out.println(checkString(s1));
        System.out.println("=================================");
        System.out.println(checkString(s));
        
    }

    private static String checkString(String str){
    	int len = str.length();

        int n1 = Integer.parseInt(str.substring(0,1));
        int n2 = Integer.parseInt(str.substring(1,2));
        if((n1+n2) % 2 != 0) {
            return "invalid";
        }

        String vow = str.substring(2,3);
        if(vow.equals("A") || vow.equals("E") || vow.equals("I") || vow.equals("O") || vow.equals("U") || 
        	vow.equals("Y")) {
            return "invalid";
        }

        int n3 = Integer.parseInt(str.substring(3,4));
        int n4 = Integer.parseInt(str.substring(4,5));
        int n5 = Integer.parseInt(str.substring(5,6));
        if((n3+n4) % 2 != 0 || (n4+n5) %2 != 0) {
            return "invalid";
        }

        int n6 = Integer.parseInt(str.substring(7,8));
        int n7 = Integer.parseInt(str.substring(8,9));
        if((n6+n7) % 2 != 0) {
            return "invalid";
        }

        return "valid";
    }
    
}
