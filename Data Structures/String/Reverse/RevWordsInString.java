import java.util.*;

/*SEE THE OTHER ONE THIS ONE IS NOT PROPER*/

class RevWordsInString{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int t =  s.nextInt();
	    
	    String given = "";
	    StringBuffer ans = new StringBuffer();
	    String reversedString;

	    while(t > 0){
	    	System.out.println("ENTER THE STRING");
			given = s.next();
			int count = 0;

			for (int i=0; i<given.length(); i++) {
				
				count++;				
				if(given.charAt(i) == '.'){
					reversedString = reverse(given, count-1);	//since array index from 0
					i++;
					count++;
					System.out.println("VALUE OF i:" + i);
					System.out.println("VALUE OF COUNT IS:" + count);
				
				}else if(given.charAt(i) == given.length()) {
					reversedString = reverse(given, count-1);
					System.out.println("VALUE OF COUNT IS:" + count);
				}

			}	        
	       
	        
	        t--;
	    }
	}

	static String reverse(String s, int end){

		String rev = "";
		for (int i= end-1;  i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}	

}

/*          given = s.nextLine();
	        wordBegin = given.toCharArray();

			while(wordBegin){	            	
	        
	            countChars++;	
	            if(given.charAt(i) == '.'){
	            	reverse(wordBegin, countChars-1);	
            		wordBegin = countChars + 1; 


	            }else if(given.charAt(i) == '\0'){
	            	reverse(wordBegin, countChars-1);	
	            }
	        }
	        
			reverse(wordBegin, countChars - 1); 	        
	        */