import java.util.*;
import java.lang.*;
import java.io.*;
class RotatedBy2Places
 {
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-->0){
	       
	        String s = sc.next();
	        String s2 = sc.next();
            
            //Eg amazon left rotate = azon am  & right = on amaz if it matches return true
            
    	    String s3 = s.substring(2, s.length()) + s.substring(0, 2); //Left Rotate
	        String s4 = s.substring(s.length()-2, s.length()) + s.substring(0, s.length()-2);//Righ
	         
	        if(s3.equals(s2) ||s4.equals(s2))
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
        sc.close();
	 }
	 
}