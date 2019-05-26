import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Make
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner((System.in));
        int T=s.nextInt();
        while(T-- > 0)
        {
            int n = s.nextInt();
            int arr[] = new int[6];
            int c=0, o=0, d=0, e=0, h=0, f=0;
            String s1[] = new String[n];
            for(int j=0; j<n; j++)
            {
                s1[j] = s.next();
                for(int k=0;k<s1[j].length();k++)
                {
                    if(s1[j].charAt(k)=='c')
                        c++;
                    if(s1[j].charAt(k)=='e')
                        e++;
                    if(s1[j].charAt(k)=='d')
                        d++;
                    if(s1[j].charAt(k)=='o')
                        o++;
                    if(s1[j].charAt(k)=='h')
                        h++;
                    if(s1[j].charAt(k)=='f')
                        f++;
                }
            }
            arr[0]=(c/2);
            arr[1]=(e/2);
            arr[2]=o;
            arr[3]=d;
            arr[4]=h;
            arr[5]=f;
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }


	}
}


