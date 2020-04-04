class FindIndexOfLastOccur{
	public static void main(String[] args) {
		String s = "geeks efte";
		Character x = 'e';

		int res = findTheLastIndexInString(s,x); 
		if(res == -1)
			System.out.println("NOT FOUND");
		else
			System.out.println("Found at " + res);
	}

	private static int findTheLastIndexInString(String s, char x){
		//The naive solution would be to traverse from the left of the String and store the count
		
		/*	But and Efficient soltution would be to Start from the right of the string and return the index 	of it.
		*/

		for(int i=s.length()-1  ; i>=0;  i--){
			
			if(s.charAt(i) == x)
				return i;
		}
		return -1;
	}
}