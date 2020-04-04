import java.util.*;
class RemoveDupInString{
	
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(unique(s));
    }


    private static String unique(String s){
        String str = new String();
        int len = s.length();

    	//loop to traverse the string and check for repeating chars using IndexOf() method in Java
        for (int i=0; i<len; i++) {
	
        	//Char at ith index of s
        	char c = s.charAt(i);	//Eg: g ie at 0th put it in char c

        	//If its present it returns the index so dont put in str 
        	//If not present ie returns -1 store it in str
        	if(str.indexOf(c) < 0){         //If index is not repeated then put it
        		str += c;                   //this only put unique ones first time
	        }                               //Wen saw again it wont put in str
        }       
        return str;
    }
}