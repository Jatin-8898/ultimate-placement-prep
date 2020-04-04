import java.util.HashSet;

class SubsequenceStartVowelEndConso{

	static HashSet<String> set = new HashSet<String>();

	public static void main(String[] args) {
		String s = "xabcef";
        subSequence(s);
        System.out.println(set);
	}

	private static void subSequence(String s){
		

		for (int i=0; i<s.length(); i++) {					//eg consider a i=1
			

			//if the first char is vowel then search for the char from back
			if(isVowel(s.charAt(i))){							//yes

				for (int j=(s.length()-1); j>=i; j--) {			//j is on f
						
					//test if jth char is consonant
					if(isConsonant(s.charAt(j))){				//yes

						//once we got an consonant add it to the hashet
						String sub_str = s.substring(i, j+1);	
						System.out.println(sub_str);	

						set.add(sub_str);				//put in set


						//now drop each char and recur to generate all the subsequence of substring
						for (int k=1;  k<sub_str.length()-1; k++) {
							
							StringBuffer sb = new StringBuffer(sub_str);
							
							sb.deleteCharAt(k);			//delete the char
							System.out.println("STRNG BUFFER "+sb.toString());

							subSequence(sb.toString());		//Recursive call

						}

					}
				}
			}
		}

	}

	private static boolean isVowel(char c){
		return (c =='a' || c=='e' || c=='i' || c=='o'  || c=='u' );
	}

	private static boolean isConsonant(char c){
		return !(c =='a' || c=='e' || c=='i' || c=='o'  || c=='u' );
	}

}