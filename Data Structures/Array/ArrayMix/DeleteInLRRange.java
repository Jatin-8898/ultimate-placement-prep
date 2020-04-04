// Java code to delete element 
// in given range 
/*  Input:
        N = 12
        A[] = { 3, 5, 3,    4, 9, 3, 1,     6, 3, 11, 12, 3}
        L = 2
        R = 7
    Output : 3 5 3 6 3 11 12 3 
 */
class GFG 
{ 

    // Delete L to R elements 
    static int deleteElement(int A[], int L, int R, int N) 
    { 
        int i, j = 0; 
        for (i = 0; i < N; i++) 
        { 
            if (i <= L || i >= R) 
            { 
                A[j] = A[i]; 
                j++; 
            } 
        } 

        // Return size of Array  after delete element 
        return j; 
    } 

    // Driver Code 
    public static void main(String args[]) 
    { 
        int A[] = new int[] { 5, 8, 11, 15, 26, 14, 19, 17, 10, 14 }; 
        int L = 2, R = 7; 
        int n = A.length; 
        int res_size = deleteElement(A, L, R, n); 
        for (int i = 0; i < res_size; i++) 
        System.out.print(A[i] + " "); 
    } 
} 

