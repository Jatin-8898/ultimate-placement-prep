class FindWordGreaterThanK{
	/*
		The program should print the words eg string python since their length is greater than k
	*/

	public static void main(String[] args) {
		String s = "String in python is fun";
		int k = 3;
		findWordsGreaterThanSizeK(s, k);
	}
	private static void findWordsGreaterThanSizeK(String s, int k){
		
		StringBuffer newString = new StringBuffer();

		for (int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) != ' '){			//if its not a space add it to the new String
				newString.append(s.charAt(i));


			}else{			//Wen we occur the space check for the size if greater then print it.
				if(newString.length() > k){
					System.out.print(newString + " ");
				}
				int n = newString.length();
				newString.delete(0,n);
			}
		}

	}
}