class SortStringByCharacter{
	/*
		This is when no sorting technique is applied so works for 
		O(n2)
	*/

	public static void main(String[] args) {
		String s = "geeks";
		System.out.println(sortString(s));
	}
	private static String sortString(String s){

		StringBuffer  sb = new StringBuffer();

		for (int i='a'; i<'z'; i++) {		//outer loop for a to z

			for (int j=0; j<s.length() ; j++) {		//pick each element if it matches the order
				
				if(s.charAt(j) == i)
					sb.append(s.charAt(j));			//append it in sb
			}
			
		}

		return sb.toString();
	}
}