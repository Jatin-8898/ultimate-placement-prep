class LongestPallindromicSequence{
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
        System.out.println("Length is: " + longestPalSubstr(str));
	}

	static int longestPalSubstr(String str) {
        int n = str.length();   // get length of input string
 
        // table[i][j] will be false if substring str[i..j] is not palindrome. Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];
 
        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
 
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
         
        // Check for lengths greater than 2. k is length of substring
        for (int k = 3; k <= n; ++k) {
             
            for (int i = 0; i < n - k + 1; ++i) // Fix the starting index
            {
                // Get the ending index of substring from starting index i and length k
                int j = i + k - 1;
 
                // checking for sub-string from ith index to jth index iff str.charAt(i+1) to 
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
 
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is ");
        printSubStr(str, start, start + maxLength - 1);
         
        return maxLength; // return length of LPS
    }

    static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }
}