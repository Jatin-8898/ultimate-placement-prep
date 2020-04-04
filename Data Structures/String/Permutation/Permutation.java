import java.util.*;

public class Permutation {

    /*
     * The task is to find all the poss Permutations Eg:ABC then ABC ACB BAC BCA CBA
     * CAB
     */
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    private static void permute(String str, int l, int r) {
        // Base Case
        if (l == r)
            System.out.println(str);
        else
            for (int i = l; i <= r; i++) {

                // Call the swap
                str = swap(str, l, i);
                // System.out.println("AFTER SWAP: "+str);

                // Permute ie Recursion
                permute(str, l + 1, r);

                // BackTrack to the original str
                str = swap(str, l, i);
                // System.out.println("BACK TO ORIGINAL : "+str);

            }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray(); // Convert into Char []

        // Swap
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }
}