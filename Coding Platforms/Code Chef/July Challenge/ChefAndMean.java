import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		try{
    		Scanner sc = new Scanner(System.in);
    		int T = sc.nextInt();
    		
    		while(T-- > 0){
    		    int n = sc.nextInt();
    		    long sum = 0l;
    		    double avg = 0; 
    		    Integer arr[] = new Integer[n];
    		    int a[] = new int[n];
    		    
    		    for(int i=0; i<n; i++)
    		      arr[i] = sc.nextInt();
    		    
    		    Set<Integer> s = new HashSet<>(Arrays.asList(arr)); 
    		    
    		    if(s.size() == 1){
    		        System.out.println("1");
    		        continue;
    		    }
    		    
    		    for(int i = 0; i < arr.length; i++)
                    a[i] = arr[i].intValue();
    		    
    		    for(int i = 0; i < a.length; i++)
                    sum = sum + a[i];
                    
                avg = ((double)sum / (double)n);
                
                int index = -1;
               
                for (int i = 0; i < a.length; i++) { 
                    if (a[i] == avg) {
                        index = i;
                        break; 
                    } 
                }
                
                if(index != -1)
                    System.out.println(index+1);
                else    
                    System.out.println("Impossible");
    		    
            }
            sc.close();
		
		    
		}catch(Exception e){
		}
	}   //end of main
	
}   //end of class