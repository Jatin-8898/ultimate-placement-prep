public class SubSequence {

    // is the string s a subsequence of the string t
    public static boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == 0)
            return true;

        int i = 0;
        for (int j = 0; j < n; j++) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            if (i == m)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "pro";
        String t = "xxprxoxxgraxmmxarxxpxroxxgraxmmar";
        System.out.println(isSubsequence(s, t));
    }

}