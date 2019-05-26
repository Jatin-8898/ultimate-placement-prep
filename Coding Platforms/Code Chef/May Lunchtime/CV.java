/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CV
{
	public static void main (String[] args) 
	{
		try {
		    
		    Scanner sc = new Scanner(System.in);
		    int t = Integer.parseInt(sc.nextLine());
		    
    		while(t-- > 0){
    		    
    		    int n = Integer.parseInt(sc.nextLine());
    		    
    		    
    		    //Base Case
    		    /* if(n == 1){
    		        System.out.println(0);
    		    } */
    		    
    		    String s = sc.nextLine();
    		    
    		    int count  = 0;
    		    
    		    for(int i=0; i<s.length()-1; i++){
    		        
    		        if (isConsonant(s.charAt(i)) && isVowel(s.charAt(i+1)))
    		               ++count; 
    		    }
    		
    		    System.out.println(count);
    		}
		    
		} catch(Exception e) {
		    System.out.println(e);
		}
		
	}
	
	// Function to check for consonant 
    private static boolean isConsonant(char ch) 
    { 
        // To handle lower case 
        ch = Character.toUpperCase(ch); 
       
        return !(ch == 'A' || ch == 'E' ||  ch == 'I' || ch == 'O' ||  ch == 'U') && ch >= 65 && ch <= 90; 
    } 

    private static boolean isVowel(char ch) 
    { 
        // To handle lower case 
        ch = Character.toUpperCase(ch); 
       
        return (ch == 'A' || ch == 'E' ||  ch == 'I' || ch == 'O' ||  ch == 'U') && ch >= 65 && ch <= 90; 
    } 
}
