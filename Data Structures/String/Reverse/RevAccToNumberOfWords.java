/* 
Approach : If number of words are even then even position’s words come first and also reverse that particular word, and if number of words are odd then odd position’s words come first and also reverse that particular word, after then the remaining words are appended in order. For e.g.

    Ashish Yadav Abhishek Rajput Sunil Pundir.

    In the above string, the number of words is even then "Yadav Rajput Pundir" comes at the even position and then the final output will be:

    ridnuP tupjaR vadaY Ashish Abhishek Sunil
 */
class RevAccToNumberOfWords 
{ 

	// Reverse the letters of the word 
	static void reverse(char str[], int start, int end) 
	{ 
        char temp; 
		while (start <= end) 
		{ 
			temp = str[start];         //NORMAL STR REVERSE
			str[start] = str[end]; 
			str[end] = temp; 
			start++; 
			end--; 
        }
        System.out.println(str[start] + " " + str[end] + " ");
	} 

	// This function forms the required string 
	static void reverseletter(char str[], int start, int end) 
	{ 

		int wordStart, totalWords; 
		for (wordStart = totalWords = start; totalWords < end; totalWords++) 
		{ 
			if (str[totalWords] == ' ') 
			{ 
                System.out.println("CAME HERE");
                continue; 
			} 

			// Checking the number of words  present in string to reverse 
			while (totalWords <= end && str[totalWords] != ' ') 
			{ 
                System.out.println(totalWords + " tot  " + str[totalWords]);
                totalWords++; 
            } 
            
			totalWords--; 

            // Reverse the letter of the words 
            System.out.println( str[wordStart] + " " +str[totalWords]);
			reverse(str, wordStart, totalWords); 
		} 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		char str[] = "Ashish Yadav Abhishek Rajput Sunil Pundir".toCharArray(); 
		reverseletter(str, 0, str.length - 1); 
		System.out.printf("%s", String.valueOf(str)); 
	} 
} 

