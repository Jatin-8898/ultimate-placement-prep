/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Common
{
	public static void main (String[] args) //throws java.lang.Exception
	{
		try {
		    
		    Scanner sc = new Scanner(System.in);
		    int n = Integer.parseInt(sc.nextLine());
            for(int p=0; p<n; p++)
            {
                String line1 = sc.nextLine();
                String line2 = sc.nextLine();

                String s1[] = line1.split(" ");
                String s2[] = line2.split(" ");
                
                HashSet<String> h = new HashSet<>();
                for(int i=0;i<s1.length;i++)
                    h.add(s1[i]);

                int flag=0;
                for(int i=0;i<s2.length;i++)
                {
                    if(h.contains(s2[i]))
                    {
                        System.out.println("Yes");
                        flag=1;
                        break;
                    }
                }
                if(flag == 0)
                    System.out.println("No");
            }
		    
		} catch(Exception e) {
            System.out.println(e);
		}
		
	}
}
