import java.util.*;
import java.lang.*;
import java.io.*;

class Pair{
    int i;
    int j;
    
    Pair(int x, int y){
        i = x;
        j = y;
    }
    
}

class FourElementsSum{

	public static void main (String[] args){

	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    
	    while(t-- > 0){
	        int n = s.nextInt();
	        int a[] = new int[n];
	        
	        for(int i=0; i<n; i++)
	            a[i] = s.nextInt();
	            
	        int sum = s.nextInt();
	        
	        if(getFourElements(a,sum))
	            System.out.println(1);
	       else
	            System.out.println(0);
	    }
	    
	 }


	 private static boolean getFourElements(int[] a, int sum){
        HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
        
        for(int i =0; i<a.length; i++){
            
            
            for(int j = i+1; j<a.length; j++){
                
                int current = a[i]+ a[j];
                int diff = sum - current;
                
                 // Now we need to find if there're different numbers k and l such that a[k] + a[l] == rest and k < i and l < i  but we have 'map'  prepared for that
                if(map.containsKey(diff)){
                    return true;

                    /* System.out.println("Found sum");
                	Pair p = map.get(rest);
                	System.out.println(a[i]+" + "+a[j]+" + "+a[p.i] +" + "+a[p.j]+" = "+sum);
                	*/
                }
                
            }  
            
            
            // now let's put in 'map' hashtable all possible map  a[i] + a[k] where k < i
            for(int k=0; k<i; k++){ 
                map.put(a[i] + a[k], new Pair(i,k) );    	//Inserting into the map
            }
            
        }
        
        return false;
	 }
	 
}