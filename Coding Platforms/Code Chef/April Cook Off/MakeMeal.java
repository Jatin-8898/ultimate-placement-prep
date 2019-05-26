/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeMeal
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    try {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		while(t > 0){
		    
		    int n = Integer.parseInt(sc.nextLine());
		    String s[] = new String[n];
		    
		    for(int i=0 ; i<n; i++){
		        s[i] = sc.nextLine();
		    }
            
            HashMap<Character, Integer>  hmap  = new HashMap<>();
            int count = 0;

            for (int i = 0; i < s.length; i++) {
                
                String c = s[i].toString();

                for(int j =0; j < c.length(); j++){
                    
                    char a = c.charAt(j);
                
                    Integer co = hmap.get(a);
                    //System.out.println("COUNT Of "+a+ " "+co);

                    if (hmap.get(a) == null){
                        if(a=='c'|a=='o'|a=='d'|a=='e'|a=='h'|a=='f')
                            hmap.put(a, 1);  
                        else
                            count = 0;     
                    }
                    else{
                        hmap.put(a, ++co);
                    }
                }
            }
            

            for (Map.Entry<Character,Integer> entry : hmap.entrySet()){
                
                //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

                if(hmap.get('c')>=2 && hmap.get('o')>=1 && hmap.get('d')>=1 && hmap.get('e')>=2 && hmap.get('h')>=1 && hmap.get('f')>=1){
                
                    count++;
                    Integer cCount = hmap.get('c');
                    Integer oCount = hmap.get('o');
                    Integer dCount = hmap.get('d');
                    Integer eCount = hmap.get('e');
                    Integer hCount = hmap.get('h');
                    Integer fCount = hmap.get('f');
    
                    hmap.put('c', --cCount);
                    hmap.put('o', --oCount);
                    hmap.put('d', --dCount);
                    hmap.put('e', --eCount);
                    hmap.put('h', --hCount);
                    hmap.put('f', --fCount);

                    System.out.println(hmap);
                
                }else if(hmap.get('c')<2 && hmap.get('o')<1 && hmap.get('d')<1 && hmap.get('e')<2 && hmap.get('h')<1 && hmap.get('f')<1){
                    count  = 0;
                }
            }

            
            System.out.println(count);
            t--;
            }
            sc.close();

	    } catch(Exception e) {}
	}
}
