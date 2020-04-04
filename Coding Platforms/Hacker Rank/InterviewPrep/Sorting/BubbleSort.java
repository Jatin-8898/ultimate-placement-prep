import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        boolean isSorted = false;
        int index = a.length-1;
        int swaps = 0;

        while(!isSorted){
            isSorted  = true;
            for(int i=0; i<index; i++){
                if(a[i] > a[i+1]){
                    swap(a, i, i+1);
                    swaps++;
                    isSorted = false;
                }
            }
            index--;
        }
        System.out.println("Array is sorted in "+ swaps +" swaps." + "\n"+
                            "First Element: " + a[0] + "\n"+
                            "Last Element: " + a[a.length-1] + "\n");
    }
    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]  = a[j];
        a[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);
        scanner.close();
    }
}
