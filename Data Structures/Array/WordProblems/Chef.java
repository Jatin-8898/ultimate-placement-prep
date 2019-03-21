import java.util.*;
import java.io.*;
class Chef{
	
	public static void main(String[] args) throws IOException {
	    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    int T=Integer.parseInt(br.readLine());
	    while(T>0)
	    {
	        int f=0;
		    String newline=br.readLine();
		    String a[]=newline.split(" ");
		    int N=Integer.parseInt(a[0]);
		    int X=Integer.parseInt(a[1]);
		    String line=br.readLine();
		    String b[]=line.split(" ");
		    for(int i=0;i<N;i++)
		    {
		        if(Integer.parseInt(b[i])==X || Integer.parseInt(b[i])>X)
		        {
		            f=1;
		            break;
		        }
		    
		    }
		    if(f==1)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    T--;
	    }
	}
}