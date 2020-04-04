class RepeatedString{
	public static void main(String[] args) {
		
		String s = "abc";
		int n =10;

		int ans = getRepeatedCount(s,n);
		System.out.println(ans);
	}

	private static long getRepeatedCount(String s, int n){
		long count = 0;
        
        for(char c: s.toCharArray()){
            if(c == 'a')
                count++;
        }
        
        long factor = n/s.length();     //Count the factors ie 10/3 will give 3
        count  = factor * count; 		//Xply the 3 with 2 ie 6
        
        /*abc abc abc */				//This gives us length 9 now we want 10 so we took mod
        
        long rem = n % s.length();		//It will return in the remaing chars required,In this case 1
        for(int i=0; i<rem; i++){
            if(s.charAt(i) == 'a')		//if its a count it.
                count++;				//count becomes 7 so return
        }

        return count;
	}
}