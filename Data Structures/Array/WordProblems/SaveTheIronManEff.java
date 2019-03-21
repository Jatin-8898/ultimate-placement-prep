import java.lang.*;
import java.io.*;
import static java.lang.Character.*;
import java.util.*;
class SaveTheIronManEff
 {
	public static void main (String[] args) throws Exception
	 {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine().trim());
	    
	    while(t-- > 0){
	       String str = br.readLine().trim().toLowerCase();
	       saveIronMan(str);
	            
	    }
	    
	 }
	 private static void saveIronMan(String str){
	    int i = 0;
	    int j = str.length() - 1;
	    int flag = 1;
	    
	    while(i <= j){
	        while(!isAlphaNum(str.charAt(i)) && i<=j )
	            i++;
	        
	        while(!isAlphaNum(str.charAt(j)) && i<=j )
	            j--;
	        
	        if(str.charAt(i)!=str.charAt(j) && isAlphaNum(str.charAt(i)) && isAlphaNum(str.charAt(j))){
	            flag = 0;
	            break;
	            
	        }else{
	            i++;
	            j--;
	        }
	    }
        if(flag==1)
	        System.out.println("YES");
	    else
	        System.out.println("NO");
   
	    
	 }
	 
	  public static boolean isAlphaNum(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
            return true;
        }
        else{
            return false;
        }
    }
	 
}