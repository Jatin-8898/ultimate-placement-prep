class RevStringWithoutTemp{
	
	public static void main(String[] args) {
		String s = "geeks";
		System.out.println(revStringUsingXOR(s, 0, s.length()));

	}

	private static String revStringUsingXOR(String s, int start , int end){

		System.out.println(s.charAt(start));
		while(start < end){

			/*s.charAt(start) =  s.charAt(start) ^ s.charAt(end);
			s.charAt(end) ^= s.charAt(start);
			s.charAt(start) ^= s.charAt(end);
			
			WORKS IN C++
			
			str[start] ^= str[end]; 
        	str[end] ^= str[start]; 
        	str[start] ^= str[end]; 

			++start;
			--end;*/

		}
		return s;
	}
}