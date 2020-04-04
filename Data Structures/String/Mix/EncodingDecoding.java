class EncodingDecoding{
	public static void main(String[] args) {
		
		String s = "AAAABBBCCD";
		String res = encodeString(s);
		System.out.println("RESULT IS : " + res);
	}

	private static String encodeString(String str){

		StringBuilder sb = new StringBuilder("");
        int i=0, count;

          	while(i < str.length()){	//while we dont reach the end
	             count=1;				//first time so count 1
	             sb.append(str.charAt(i));	//store it in new String
	             i++;						//inc i
	              

	             /*until we get a match keep on incrementing count and move the pointer i*/
	            while(i<str.length() && str.charAt(i) == str.charAt(i-1)){	
	                 count++;
	                 i++;
	            }
	            
	            /*Store the count in the String*/
	            sb.append(count);
           }
           
        return sb.toString();
	}
}