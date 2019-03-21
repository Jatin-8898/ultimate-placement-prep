import java.lang.*;
import java.io.*;
import static java.lang.Character.*;
import java.util.*;
class SaveTheIronMan
 {
	public static void main (String[] args)
	 {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    
	    while(t-- > 0){
	       String s = scan.nextLine();
	       if(saveIronMan(s) == true)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	       
	    }
	    
	 }
	 private static boolean saveIronMan(String s){
	    char[] chars = s.toCharArray();
	    int i = 0;
	    int j = s.length() - 1;
	    
	    while(i < j){
	        while(!isLetterOrDigit(chars[i]) && i < j )
	            i++;
	        
	        while(!isLetterOrDigit(chars[j]) && i < j )
	            j--;
	        
	        if(Character.toLowerCase(chars[i]) != toLowerCase(chars[j]))
	            return false;
	        
	        i++;
	        j--;
	        
	    }
	    return true;
	 }
	 
}