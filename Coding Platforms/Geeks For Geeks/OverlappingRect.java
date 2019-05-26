import java.util.*;
import java.lang.*;
import java.io.*;

class Point{
    int x, y;
    
    Point(int value){
        x = value;
        y = value;    
    }
    
}

class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner s = new Scanner(System.in);
	    int t =  s.nextInt();
	    
	    while(t>0){
	        Point l1, r1,     l2, r2;
	        l1.x = s.nextInt();
	        l1.y = s.nextInt();
	        r1.x = s.nextInt();
	        r1.y = s.nextInt();
	        l2.x = s.nextInt();
	        l2.y = s.nextInt();
	        r2.x = s.nextInt();
	        r2.y = s.nextInt();
	        if (doOverlap(l1, r1, l2, r2)) 
                System.out.println("1"); 
            else
                System.out.println("0"); 
	        t--;
	    }
	 }
	 
	 static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) 
    { 
        // If one rectangle is on left side of other 
        if (l1.x > r2.x || l2.x > r1.x) 
            return false; 
      
        // If one rectangle is above other 
        if (l1.y < r2.y || l2.y < r1.y) 
            return false; 
      
        return true; 
    } 
}