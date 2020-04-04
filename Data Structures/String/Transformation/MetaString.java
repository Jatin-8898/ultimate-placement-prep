import java.util.*;
import java.util.Collection;


public class MetaString{

	/*The idea is to take 2 words from the input 
	Eg: Converse and Conserve and then swap the characters to check
	whether the two Strings are equal or not.
	If yes then it is a Meta String*/
	/* Meta strings are the strings which can be made equal by exactly one swap 
	in any of the strings. Equal string are not considered here as Meta strings.*/
	/*1. Check if both strings are of equal length or not, if not return false.
	2.Otherwise, start comparing both strings and count number of unmatched characters
	 and also store the index of unmatched characters.
	3.If unmatched characters are more than 2 then return false.
	4.Otherwise check if on swapping any of these two characters in any string 
	would make the string equal or not.
	5.If yes then return true. Otherwise return false.*/

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE STRING: ");
		String names = s.nextLine();

		String[] namesList = names.split(",");

		String firstString =  namesList[0];
		String secondString = namesList[1];

		for(String words : namesList ){
			//System.out.println(words);	
		}

		System.out.println(areMetaStrings(firstString,secondString) ? "TRUE" :"FALSE");


		
	}

	private static boolean areMetaStrings(String s1, String s2){
		int len1  = s1.length();
		int len2  = s2.length();

		//Return false if length is not equal
		if(len1 != len2)
			return false;

		//To store the indexes
		int previous = -1 , current = -1;

		int count = 0;

		//Keep the pointer on first letter of both Strings
		for(int i=0; i < len1; i++){		//Converse and Conserve

			//If the current character doesnt match
			if(s1.charAt(i) != s2.charAt(i)){

				//Count the unmatched charcaters
				count++;

				//If unmatched is greater than 2 then return
				if(count > 2)
					return false;

				//Store both the unmatched Characters of both the Strings
				//v will be stored in prev and s will be stored in curr
				previous = current;
				current = i;		//current now has v
			}
		}

		/*Now Check if previous unmatched of string1 is equal to curr unmatched of string2
		and also check for curr unmatched character and return only wen count ==2 and the
		charcters are matched*/
		 return (count == 2 && s1.charAt(previous) == s2.charAt(current) &&
		 	s1.charAt(current) == s2.charAt(previous));
	}
}//end of class



		/*Random random = new Random();

		char[] firstStringContent = firstString.toCharArray();
		for(int i=0; i<firstStringContent.length; i++){
			//System.out.println(firstStringContent[i]);	
			int index = random.nextInt(i+1);
			char temp = firstStringContent[index];
			firstStringContent[index] = firstStringContent[index+1];
			firstStringContent[index] = temp;

			System.out.println(firstStringContent[i]);
			if(firstStringContent.toString().equals(secondString)){
				System.out.println("TRUE");
			}else{
				System.out.println("FALSE");
			}
		}*/
		

		
		/*List<String> letters = Arrays.asList(firstString);
		Collections.shuffle(letters);
		StringBuilder shuffledString = new StringBuilder(firstString.length());
		for(String k : letters){
			shuffledString.append(k);
		}		
		System.out.println(shuffledString);*/