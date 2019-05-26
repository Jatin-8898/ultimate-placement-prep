
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ring {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int x = s.nextInt();

            int val = a;
            int count = 0;

            while (val < b) {
                val += x;
                count++;
                //System.out.println(val + "  " + count);
            }
            if(val == b)
                System.out.println(count+1);
            else    
                System.out.println(count);    

            t--;
        }
        s.close();
    }
}
