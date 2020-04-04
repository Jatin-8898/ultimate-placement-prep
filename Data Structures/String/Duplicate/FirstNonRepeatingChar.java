//import java.util.*;
class FirstNonRepeatingChar{
	/*
	Given a string, find the first non-repeating character in it. For example, if the input string is GeeksforGeeks, then output should be ‘f’ and if input string is GeeksQuiz, then output should be ‘G’.
	
		There are 4 possible solutions to this problem.
	*/
	public static void main(String[] args) {
		String str  = "!GeeksFor!Geeks";
		int index  = firstNonRepeatingChar(str);
		if (index == Integer.MAX_VALUE)
        	System.out.print("Either all characters are repeating or string is empty");
        else
        	System.out.println("First Non repeating Char:" + str.charAt(index));


        System.out.println("\nUSING LINKEDHASHMAP: " +firstNonRep(str));
        System.out.println("\nUSING SET AND ARRAYLIST: " +firstNonRepChar(str));
        System.out.println("\nUSING LINKEDHASHMAP: " +firstNonRep(str));
	}

	static int firstNonRepeatingChar(String str){
		int NO_OF_CHARS = 256;
		int arr[] = new int[NO_OF_CHARS];

		for (int i=0; i<NO_OF_CHARS; i++) {
			arr[i]  = -1;
		}

		//the above loop intializes all the elements as -1
		for (int i=0; i<str.length(); i++) {

			//If neg make it postive
			if(arr[str.charAt(i)] == -1)
				arr[str.charAt(i)] = i;

			//If neg again means it repeated again
			else
				arr[str.charAt(i)] = -2;

		}

		int res = Integer.MAX_VALUE;
		for (int i=0; i<NO_OF_CHARS; i++) {

			// If this character occurs only once and appears before the current result, then 
        	// update the result
			if(arr[i] >= 0)
				res = Math.min(res, arr[i]);
		}

		return res;
	}

	/*
		* Step 1: get character array and loop through it to build a hash table with char and their count. 
		* Step 2: loop through LinkedHashMap to find an entry with value 1, that's your first non-repeated character, as LinkedHashMap maintains insertion order.
	*/
	static char firstNonRep(String str){
		Map<Character, Integer> map = new LinkedHashMap<>();

		for(char c: str.toCharArray())
			map.put(c,  map.containsKey(c) ?  map.get(c) + 1 :  1);

		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			
			if(entry.getValue() == 1)
				return entry.getKey();
		} 
		throw new RuntimeException("NOT FOUND");
	}


	/* 
		* Finds first non repeated character in a String in just one pass. 
		* It uses two storage to cut down one iteration, standard space vs time 
		* trade-off.Since we store repeated and non-repeated character separately, 
		* at the end of iteration, first element from List is our first non 
		* repeated character from String. 
	*/
	static char firstNonRepChar(String str){
		Set<Character> repeating  = new HashSet<>();
		List<Character> nonrepeating  = new ArrayList<>();

		for (int i=0; i<str.length() ; i++) {
			
			char letter = str.charAt(i);

			if(repeating.contains(letter))				//if it has continue
				continue;

			if(nonrepeating.contains(letter)){			//coz in nonrepeating if again came remove it
				nonrepeating.remove( (Character) letter);
				repeating.add(letter);					//and add it to the repeating set
			}
			else{
				nonrepeating.add(letter);				//when occur 1st time put it in nonrepeating list
			}
		}

		return nonrepeating.get(0);					//the list doesnt contains any rep element so return 0th

	}



	/*
	 * Step 1 : Scan String and store count of each character in HashMap 
	 * Step 2 : traverse String and get count for each character from Map. 
	 * Since we are going through String from first to last character, 
	 * when count for any character is 1, we break, it's the first 
	 * non repeated character. Here order is achieved by going * through String again. */

	public static char firstNonRepeatedCharacter(String word) {
	  HashMap < Character, Integer > scoreboard = new HashMap < > (); 
	  	// build table [char -> count] 
	  	for (int i = 0; i < word.length(); i++) { 
		  	char c = word.charAt(i); 
			  
			if (scoreboard.containsKey(c)) { 
			  	scoreboard.put(c, scoreboard.get(c) + 1); 
			  
			} else { 
			  	scoreboard.put(c, 1); 
			} 
		} 
	  	
	  	// since HashMap doesn't maintain order, going through string again 
	  	for (int i = 0; i < word.length(); i++) { 
		  	char c = word.charAt(i); 
		  	
		  	if (scoreboard.get(c) == 1) { 
		  		return c; 
		  	} 
		} 
		  	
		throw new RuntimeException("Undefined behaviour"); 
	}
}