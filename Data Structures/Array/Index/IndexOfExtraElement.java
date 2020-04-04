import java.util.*;
import java.io.*;
class IndexOfExtraElement{
    /* 
        Time complexity : O(n)
     */
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 9, 10, 12};
        int[] b = {2, 4, 6, 8, 10, 12};
        indexOfExtraElement(a,b);
    }
    private static void indexOfExtraElement(int[] a, int[] b){
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        int index = 0;

        while(i < n && j < m){
            if(a[i] != b[j]){
                index = i;
                break;
            }
            i++; j++;
        }
        System.out.println(index);
    }
}