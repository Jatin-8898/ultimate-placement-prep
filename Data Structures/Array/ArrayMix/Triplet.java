// Java implementation of the above approach 
import static java.lang.Math.abs; 
import java.util.*; 
/* 
    Efficient approach: If we sort the given listay, we can improve the efficiency of the algorithm. This efficient approach uses the two-pointer technique as follows:

    Sort the given listay.
    Loop over the listay and fix the first element of the possible triplet, list[i].
    Then fix two pointers, one at i + 1 and the other at n – 1. And look at the sum,
    If the sum is smaller than the sum we need to get to, we increase the first pointer.
    Else, If the sum is bigger, we decrease the end pointer to reduce the sum.
    We also update the closest sum found so far.

*/
class Triplet 
{ 
    static int solution(Vector<Integer> list, int x) 
    { 
        Collections.sort(list);          // Sort the list 

        int closestSum = Integer.MAX_VALUE;  // To store the closets sum 

        for (int i = 0; i < list.size() - 2; i++)  // Fix the smallest number among the three integers 
        { 
            // Two pointers initially pointing at the last and the element next to the fixed element 
            int ptr1 = i + 1;
            int ptr2 = list.size() - 1; 

            while (ptr1 < ptr2)       // While there could be more pairs to check 
            { 
                // Calculate the sum of the current triplet 
                int sum = list.get(i) + list.get(ptr1) + list.get(ptr2); 

                // If the sum is more closer than the current closest sum 
                if (abs(x - sum) < abs(x - closestSum))
                    closestSum = sum; 

                // If sum is greater then x then decrement the second pointer to get a smaller sum 
                if (sum > x)            //Same as Shrinking Window concept
                    ptr2--;
                else                // Else increment the first pointer  to get a larger sum 
                    ptr1++; 
            } 
        } 
        return closestSum;  // Return the closest sum found 
    } 
    public static void main(String[] args) 
    { 
        Vector list = new Vector(listays.asList( -1, 2, 1, -4 )); 
        int x = 1; 
        System.out.println(solution(list, x)); 
    } 
} 

