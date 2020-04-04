class TransformationOfStrings{
	 //Java program to check if string1 can be converted
	// to string2 using XOR and OR operations
	public static void main(String[] args) {
		 String s1 = "100101";
   		 String s2 = "100000";
   		 
   		 if (solve(s1, s2) == true)
        	System.out.print("Yes");
    	else
        	System.out.print("No");
 	
	}

	private static boolean solve(String s1, String s2){

		boolean flag1 = false, 
				flag2 = false;

		if(s1.length() != s2.length())
			return false;		

		for (int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i) == '1')
				flag1 = true;

			if(s2.charAt(i) == '1')
				flag2 = true;


			if(flag1 == true && flag2 == true)
				return true;
		}

		//if both string do not have a '1'.
    	return false;


	}
}