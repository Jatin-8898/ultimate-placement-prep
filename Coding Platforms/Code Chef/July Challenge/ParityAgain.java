/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ParityAgain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    
		    Scanner s = new Scanner(System.in);
		    int t = s.nextInt();
		    
    		while(t-- > 0){
                
                int e=0;
                int o=0;
                int q = s.nextInt();
                Set<Integer> set = new HashSet<>();
                
                for(int i=0; i<q; i++)
                {
                    int x = s.nextInt();
                    
                    if(set.contains(x)) //If element already present print it
                    {
                       System.out.println(e+" "+o);
                       continue; 
                    }
                    
                    e=0;
                    o=0;
                    
                    if(!set.isEmpty())
                    {
                        List<Integer> list = new ArrayList<>();
                        Iterator<Integer> setIterator = set.iterator();
                    
                        //Add in List First
                        while(setIterator.hasNext()){
                            list.add(setIterator.next() ^ x);   //Now xor 4 ^ 2
                        }
                        
                        //Add in Set Now
                        Iterator<Integer> setIterator2 = list.iterator();
                        while(setIterator2.hasNext()){          
                            set.add(setIterator2.next());
                        }
                    }
                    
                    
                    set.add(x);     //First time it will be added here
                    
                    Iterator<Integer> setIterator3 = set.iterator(); //iter set
                    while(setIterator3.hasNext()){
                        
                        if(hasOddOnes(setIterator3.next()))
                            o++;
                        else
                            e++;
                    }
                    
                    System.out.println(e+" "+o);
                }
                s.close();
            }
            
		    
		} catch(Exception e) {
		    System.out.println(e);
		}
		
	}
	
	public static boolean hasOddOnes(int n) {
        int count = 0;
        while(n != 0) {
            n = n&(n-1);
            count++;
        }

        return (count%2 == 0)? false: true;
    }
}