// Java program to reverse a string preserving spaces. 
public class RevStrPreservingSpaces 
{
    
    /* Create a string to store result. Mark the space position of the given string in this string.
    
    Insert the character from input string into the result string in reverse order.
    
    While inserting the character check if the result string already contains a space at index ‘j’ or not. 
    
    If it contains, we copy the character to the next position.
 */


	// Function to reverse the string and preserve the space position 
	static void reverses(String str) { 
			
		char[] inputArray = str.toCharArray(); 
		char[] result = new char[inputArray.length]; 

		// Mark spaces in result 
		for (int i = 0; i < inputArray.length; i++) { 
			if (inputArray[i] == ' ') { 
				result[i] = ' '; 
			} 
		} 
		
		// Traverse input string from beginning and put characters in result from end 
		int j = result.length - 1; 
		for (int i = 0; i < inputArray.length; i++) { 
			
				// Ignore spaces in input string 
				if (inputArray[i] != ' ') { 
								
					// ignore spaces in result. 
					if (result[j] == ' ') {         //Case Space: Decr j when we encounter an "space"
						j--; 
                    }	 
                    
                    //Normally keep putting the chars & decr j 
					result[j] = inputArray[i]; 
					j--; 
				} 
		} 
		System.out.println(String.valueOf(result)); 
	}	 
	
	public static void main(String[] args) 
	{ 
		reverses("intern at geeks for geeks"); 
	} 
} 
