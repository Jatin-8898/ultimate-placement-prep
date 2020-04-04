class ReverseWordsInString{

	/*
		BEST WAY IS THIS
		JUST SPLIT BY THE DOT AND PUT IT IN STRING ARRAY
		THEN APPEND IT IN NEW STRBUFFER
	*/

	public static void main(String[] args) {
		String s = "hello jatin java is amazing";		//op should be java hello
		String res = getReverse(s);		
        System.out.println("REV WORDS : "+ res);
        
		String res1 = reverseWords(s);		
        System.out.println("REV WORDS ANOTHER WAY: "+ res1);
        
        performReverse(s);
	}

	static String getReverse(String s){
		String[] splitter  = s.split(" ");

		StringBuffer finalAns = new StringBuffer();	//Create an empty string
		String temp = "";

		for (int i=0;  i<splitter.length; i++) {
			temp = splitter[splitter.length-i-1];//to get till the last index ie till hello
			finalAns.append(temp);
			finalAns.append(" ");
		}

		finalAns.deleteCharAt(finalAns.length() - 1);
		return finalAns.toString();
    }	
    
    /* ANOTHER WAY */
    static void performReverse(String st){
        String s[] = st.split(" "); 
        String ans = "";

        for (int i = s.length - 1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
        System.out.print("Reversed String: "); 
        System.out.println(ans.substring(0, ans.length() - 1)); 
    }


    /* ANOTHER APPROACH */
    static String reverseWords(String str)  // eg hello how are you
	{ 
        String temp[] = str.split(" "); 
		String result = ""; 

        // Iterate over the temp array and store the string in reverse order. 
        //keep the first element at Last place and so on
		for (int i = 0; i < temp.length; i++) { 
			
          	if (i == temp.length - 1) 
				result = temp[i] + result; 
			else
				result = " " + temp[i] + result;   // will append + " " + hello    // then how hello
		} 
		return result; 
	} 
}