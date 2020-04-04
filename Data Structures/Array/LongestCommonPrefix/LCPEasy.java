import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int t = Integer.parseInt(s.nextLine());
	    
	    while(t-- > 0){
	        int n=Integer.parseInt(s.nextLine());
    	    String[] input=s.nextLine().split(" ");
    	     
    	    Arrays.sort(input);
    	     
            int first=input[0].length();
            int last=input[n-1].length();
            
            int min=Math.min(first,last);
            
            StringBuilder sb=new StringBuilder("");

            for(int i=0; i<min; i++)
            {
                if(input[0].charAt(i)==input[n-1].charAt(i))
                    sb.append(input[0].charAt(i));
                else
                    break;
            }
            if(sb.length()>0)
                System.out.println(sb.toString());
            else
                System.out.println("-1");
        }
        s.close();
	}
 }	 