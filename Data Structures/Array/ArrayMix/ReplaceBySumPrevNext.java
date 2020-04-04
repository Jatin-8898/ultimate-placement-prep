import java.util.*;
import java.io.*;
class ReplaceBySumPrevNext{
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6};
        int arr1[] = { 3, 2, 1};
        getSum(arr);
        getSum(arr1);
    }
    private static void getSum(int[] a){
        int first = a[0] + a[1];
        int last = a[a.length-1] + a[a.length-2];
        int sum = 0;

        System.out.print(first + " ");
        for (int i = 1; i < a.length-1; i++) {
            sum = a[i-1] + a[i+1];
            System.out.print(sum + " ");
        }
        System.out.print(last + " ");
    }
}