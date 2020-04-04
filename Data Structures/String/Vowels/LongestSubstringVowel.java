import java.util.*;
class LongestSubstringVowel{
	public static void main(String[] args) {
		String s = "aaaeeeh";
		int res = LongestSubstring(s);
		System.out.println(res);
	}

	private static boolean isVowel(char c){
		return (c =='a' || c=='e' || c=='i' || c=='o'  || c=='u' );
	}

	private static int LongestSubstring(String s){
		
		int count = 0, res = 0;
		char[] str = s.toCharArray();

		for (int i=0; i< str.length; i++) {
			
			// Increment current count 
            // if s[i] is vowel 
			if(isVowel(str[i])){
				count++;
			}

			else{
				// check previous value 
                // is greater then or not
				res = Math.max(res,count);
				//wen not equal put count as 0
				count = 0;
			}

		}
			
		return 	res;
	}
}