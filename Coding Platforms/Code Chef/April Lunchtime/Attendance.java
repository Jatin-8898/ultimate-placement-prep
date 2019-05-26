
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Attendance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int i=1; i<=T; i++)
		{
		    int N=sc.nextInt();
		    String first[]=new String[N];
		    String last[]=new String[N];
		    for (int j=0; j<N; j++)
		    {
		        first[j]=sc.next();
		        last[j]=sc.next();
		    }
		    int flag=0;
		    for (int x=0; x<N; x++)
		    {
		        flag=0;
		        for (int y=0; y<N; y++)
		        {
		            if (y==x)
		            {
		                continue;
		            }
		            else if (first[x].equals(first[y]))
		            {
		                System.out.println(first[x]+" "+last[x]);
		                flag=1;
		                break;
		            }
		           
		        }
                if (flag==0)
                    System.out.println(first[x]);
		    }
		}
	}
}

/* ALTERNATE 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class CodeChef {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            String ar[] = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = br.readLine();
                String firstName = ar[i].split(" ")[0];

                if (map.containsKey(firstName)) {
                    Integer a = map.get(firstName);
                    map.put(firstName, a + 1);
                } else {
                    map.put(firstName, 1);
                }
            }
            for (int i = 0; i < n; i++) {
                String firstName = ar[i].split(" ")[0];

                if (map.get(firstName) > 1) {
                    System.out.println(ar[i]);
                } else {
                    System.out.println(firstName);
                }

            }

        }
        br.close();

    }

}
*/