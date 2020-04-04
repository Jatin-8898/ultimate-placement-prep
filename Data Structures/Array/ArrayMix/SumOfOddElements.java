import java.util.*;
import java.io.*;
/* 
    eg  4 => 1+3
        5 => 1+3
        7 => 1+3+5
        9 => 1+3+5+7
*/
class  SumOfOddElements{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<20; i++){        //Fill List with 20 Numbers
            l.add(i);
        }    
    
        int[] a = new int[(l.size()*2)+1];   //Create Double Size + 1 
        
        for (int i = 0; i < l.size(); i++) {
            int n = l.get(i);
    
            int sum = 0; 
            for (int j = 1, k=j+1; j <= n; j++, k+=2) {     //Idea is to store the squares at 2 indexes
                sum = (j * j); 
                a[k-1] = a[k] =  sum;
            }
            System.out.println("ODD ELEMENTS SUM UPTO " + n + " IS: "+ a[n]);
        }
    }
}