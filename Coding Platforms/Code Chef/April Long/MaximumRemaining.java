
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximumRemaining {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int first, second = 0;
        first = Integer.MIN_VALUE; 
        for (int i = 0; i < a.length ; i++) { 
            
            if(a[i] > first) {
                second = first; 
                first = a[i]; 
            
            } else if (a[i] > second && a[i] != first) {
                second = a[i]; 
            }    
            else if(a[i-1] == a[i]){
                second = 0;    
            }   
        }
         
        System.out.println(second);
        s.close();
    }
}
