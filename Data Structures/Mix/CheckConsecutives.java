import java.util.*;
import java.lang.*;
import java.io.*;

class CheckConsecutives
{
	public static void main (String[] args) throws java.lang.Exception
	{
    
        int[] a = {1,1,1,2,3};
        if(ChecKConsecutive(a,1)){
            System.out.println("YES");
        }
	}
	
	 private static boolean ChecKConsecutive(int[] a, int key)
    {
        int len = a.length;
        
        if(len ==0)
            return false;
        
        if(len==1)
            return true;
            
        int lastIndex = -1;
        
        for(int i=0;i<len;i++)
        {
            if(a[i] == key)
            {
                if(lastIndex != -1 && lastIndex + 1  != i)
                    return false;
                
                lastIndex = i;
            }
            continue;
        }
        return true;
    }
}
