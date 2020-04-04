import java.util.Arrays;

public class ClosestSumPair {
    public static void main(String[] args) {
       
        int[] a1 = {-1, 3, 8, 2, 9, 5};
        int[] a2 = {4, 1, 2, 10, 5, 20};
        int aTarget = 24;
        int[] res = closestSumPair(a1, a2, aTarget); //should return {5, 20} or {3, 20}
        for(int i:res)
            System.out.print(i + " ");


        int[] b1 = {7, 4, 1, 10};
        int[] b2 = {4, 5, 8, 7};
        int bTarget = 13;
        int[] res1 = closestSumPair(b1, b2, bTarget); //should return {4, 8}, {7, 7}, {7, 5}, or {10, 4}
        for(int i:res1)
            System.out.print(i + " ");


        int[] c1 = {6, 8, -1, -8, -3};
        int[] c2 = {4, -6, 2, 9, -3};
        int cTarget = 3;
        int[] res2 = closestSumPair(c1, c2, cTarget); //should return {-1, 4} or {6, -3}
        for(int i:res2)
            System.out.print(i + " ");


        int[] d1 = {19, 14, 6, 11, -16, 14, -16, -9, 16, 13};
        int[] d2 = {13, 9, -15, -2, -18, 16, 17, 2, -11, -7};
        int dTarget = -15;
        int[] res3 = closestSumPair(d1, d2, dTarget); //should return {-16, 2}, {-9, -7}
        for(int i:res3)
            System.out.print(i + " ");
    }

    // a1 and a2 are the given arrays, and target is the target sum.
    // It should return an array of two numbers as the result, one from each array.
    public static int[] closestSumPair(int[] a1, int[] a2, int target) {
        int[] a1Sorted = Arrays.copyOf(a1, a1.length);
        Arrays.sort(a1Sorted);
        
        int[] a2Sorted = Arrays.copyOf(a2, a2.length);
        Arrays.sort(a2Sorted);

        int i = 0;
        int j = a2Sorted.length - 1;
        
        int smallestDiff = Math.abs(a1Sorted[0] + a2Sorted[0] - target);
        int[] closestPair = {a1Sorted[0], a2Sorted[0]};

        while (i < a1Sorted.length && j >= 0 ) {
            
            int v1 = a1Sorted[i];
            int v2 = a2Sorted[j];
            int currentDiff = v1 + v2 - target;

            if (Math.abs(currentDiff) < smallestDiff) {
                smallestDiff = Math.abs(currentDiff);
                closestPair[0] = v1; 
                closestPair[1] = v2;
            }

            if (currentDiff == 0) {
                return closestPair;
            }
            else if (currentDiff < 0) {
                i += 1;
            }
            else {
                j -= 1;
            }
        }

        return closestPair;
    }
}
