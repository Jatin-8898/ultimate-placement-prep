class FirstRepeatingChar{

	public static void main(String[] args) {
		String str = "geeksforgeeks";
        int pos = findRepeatFirstN2(str);	
        if (pos == -1)
            System.out.println("Not found");
        else
        System.out.println( str.charAt(pos));
	}

	private static int findRepeatFirstN2(String s){

		int p = -1;	//initialise to -1

		for (int i=0; i<s.length(); i++) {

			for (int j= i+1; j<s.length(); j++) {
				
				if(s.charAt(i) == s.charAt(j)){	//keep pointer on i and i+1

					p = i;					//if found store i in p
					break;					//n come out of the loop

				}
			}


			if (p != -1)	//come out of ith loop 
                break;
			
		}

		return p;
	}


}