// A JAVA program to sort an array according 
// to the order defined by another array
import java.io.*;
import java.util.Arrays;
 
 /*Given two arrays A1[] and A2[], sort A1 in such a way that the relative order among the elements will be same as those are in A2. For the elements not present in A2, append them at last in sorted order.*/

class RelativeSort{
   
    /*Method 1 (Using Sorting and Binary Search)
    Let size of A1[] be m and size of A2[] be n.
    1) Create a temporary array temp of size m and copy contents of A1[] to it.
    2) Create another array visited[] and initialize all entries in it as false. visited[] is used to mark those elements in temp[] which are copied to A1[].
    3) Sort temp[]
    4) Initialize the output index ind as 0.
    5) Do following for every element of A2[i] in A2[]
    …..a) Binary search for all occurrences of A2[i] in temp[], if present then copy all occurrences to A1[ind] and increment ind. Also mark the copied elements visited[]
    6) Copy all unvisited elements from temp[] to A1[].

    Time complexity: The steps 1 and 2 require O(m) time. Step 3 requires O(mLogm) time. Step 5 requires O(nLogm) time. Therefore overall time complexity is O(m + nLogm).*/

    public static void main(String args[])
    {
        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2[] = {2, 1, 8, 3};
        int m = A1.length;
        int n = A2.length;
        System.out.println("Sorted array is ");
        sortAccording(A1, A2, m, n);
        printArray(A1, m);
    }


    /* A Binary Search based function to find
    index of FIRST occurrence of x in arr[].
    If x is not present, then it returns -1 */
    private static int first(int arr[], int low, int high, int x, int n)
    {
       if(high >= low){
        
            /*mid  = low+high/2*/
            int mid = low + (high-low) / 2;

            //Wen we found the X at the MID
            if( (mid==0 || x > arr[mid-1])   && arr[mid] == x)
                return mid;

            //WEn the x is greater than mid go to right ie mid+1
            if( x > arr[mid])
                return first(arr, (mid+1), high, x, n);

            //Else case wen x is small go left ie mid-1
            return first(arr, low, (mid-1), x, n);

        }

        //Wen not found ie high <= low
        return -1;
    }
      
    // Sort A1[0..m-1] according to the order
    // defined by A2[0..n-1].
    private static void sortAccording(int A1[], int A2[], int m,  int n)
    {
        // The temp array is used to store a copy 
        // of A1[] and visited[] is used to mark the 
        // visited elements in temp[].
        int temp[] = new int[m], visited[] = new int[m];
        for (int i = 0; i < m; i++)
        {
            temp[i] = A1[i];
            visited[i] = 0;
        }
      
        // Sort elements in temp
        Arrays.sort(temp);
         
        // for index of output which is sorted A1[]
        int ind = 0;  
      
        // Consider all elements of A2[], find them
        // in temp[] and copy to A1[] in order.
        for (int i = 0; i < n; i++){

            // Find index of the first occurrence
            // of A2[i] in temp
            int f = first(temp, 0, m-1, A2[i], m);
      
            // If not present, no need to proceed
            if (f == -1) 
                continue;
      
            // Copy all occurrences of A2[i] to A1[]
            for (int j = f; (j < m && temp[j] == A2[i]);  j++){
                
                A1[ind++] = temp[j];
                visited[j] = 1;
            }
        }
      
        // Now copy all items of temp[] which are 
        // not present in A2[]
        for (int i = 0; i < m; i++)
            if (visited[i] == 0)
                A1[ind++] = temp[i];
    }
      

    // Utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
      
    
}
/*
We can also customize compare method of a sorting algorithm to solve the above problem. For example qsort() in C allows us to pass our own customized compare method.
1. If num1 and num2 both are in A2 then number with lower index in A2 will be treated smaller than other.
2. If only one of num1 or num2 present in A2, then that number will be treated smaller than the other which doesn’t present in A2.
3. If both are not in A2, then natural ordering will be taken.

Time complexity of this method is O(mnLogm) if we use a O(nLogn) time complexity sorting algorithm. We can improve time complexity to O(mLogm) by using a Hashing instead of doing linear search.
 // A C++ program to sort an array according to the order defined
// by another array
#include <stdio.h>
#include <stdlib.h>
 
// A2 is made global here so that it can be accesed by compareByA2()
// The syntax of qsort() allows only two parameters to compareByA2()
int A2[5];
int size = 5; // size of A2[]
 
int search(int key)
{
    int i=0, idx = 0;
    for (i=0; i<size; i++)
        if (A2[i] == key)
            return i;
    return -1;
}
 
// A custom comapre method to compare elements of A1[] according
// to the order defined by A2[].
int compareByA2(const void * a, const void * b)
{
    int idx1 = search(*(int*)a);
    int idx2 = search(*(int*)b);
    if (idx1 != -1 && idx2 != -1)
        return idx1 - idx2;
    else if(idx1 != -1)
        return -1;
    else if(idx2 != -1)
        return 1;
    else
        return ( *(int*)a - *(int*)b );
}
 
// This method mainly uses qsort to sort A1[] according to A2[]
void sortA1ByA2(int A1[], int size1)
{
    qsort(A1, size1, sizeof (int), compareByA2);
}
 
// Driver program to test above function
int main(int argc, char *argv[])
{
    int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8, 7, 5, 6, 9, 7, 5};
 
       //A2[] = {2, 1, 8, 3, 4};
    A2[0] = 2;
    A2[1] = 1;
    A2[2] = 8;
    A2[3] = 3;
    A2[4] = 4;
    int size1 = sizeof(A1)/sizeof(A1[0]);
 
    sortA1ByA2(A1, size1);
 
    printf("Sorted Array is ");
    int i;
    for (i=0; i<size1; i++)
        printf("%d ", A1[i]);
    return 0;
}
*/