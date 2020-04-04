import java.util.*;

class BitSubArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int P = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }
            int ans = solve(n, P, a);
            System.out.println(ans);
        }
    }

    public static int solve(int n, int P, int[] a) {
        int ans = 0;
        int min;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = 0;
            for (int j = i; j < a.length; j++) {
                min = a[i] & a[j];
                if (min < minVal) {
                    minVal = min;
                }
            }
        }
        ans = Math.abs(minVal - P);
        return ans;
    }
}
