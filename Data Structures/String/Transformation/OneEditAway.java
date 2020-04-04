class OneEditAway{

	/*Either changing ,deleting or adding a single char make the 2 string equal
	then r called as 1 Edit away*/

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "abcd";
		System.out.println(isOneEditAway(s1,s2));
		
		System.out.println(isOneEditAway("abcdef", "abqdef"));  // should return true
        System.out.println(isOneEditAway("abcdef", "abccef"));  // should return true
        System.out.println(isOneEditAway("abcdef", "abcde"));  // should return true
        System.out.println(isOneEditAway("aaa", "abc"));  // should return false
		System.out.println(isOneEditAway("abc", "bcc"));  // should return false

	}

	private static Boolean isOneEditAway(String s1, String s2){

		/*Basically there are 3 cases:
			1. When the diff is 2
			2. When they r of Same length so check if diff is >1 then return false
			3.  
		*/

		/*If sl=5 - s2=4 is greater than 2 then no need to compare coz they r not one edit away
		OR if s2=5 - s1 =4 is greater than 2 then return false*/
		if(s1.length() - s2.length() >=2  || s2.length() - s1.length() >=2){
			return false;
		
		}else if(s1.length() == s2.length()){
			return isOneEditAwayOfSameLength(s1,s2);
		

		}else if(s1.length() >  s2.length()){
			return isOneEditAwayOfDifferentLength(s1 ,s2);


		}else{                  //means s2 is greater so pass s2 first
			return isOneEditAwayOfDifferentLength(s2 ,s1);

		}
		
	}

	private static Boolean isOneEditAwayOfSameLength(String s1, String s2){
		int count_diff = 0;
		
		for (int i=0; i<s1.length() ; i++) {
			
			//check the charat in both the strings.
			if(s1.charAt(i) != s2.charAt(i)){
				count_diff++;
			}

			//When diff is more than 1 return false 
			if(count_diff > 1)
				return false;
		}

		return true;
	}


	private static Boolean isOneEditAwayOfDifferentLength(String s1, String s2){
		int i = 0;
		int count_diff = 0;

		while(i < s2.length()){
			
			if(s1.charAt(i + count_diff) == s2.charAt(i))
				i++;
			else
				count_diff++;

			if(count_diff > 1)
				return false;
		}

		return true;
	}
}