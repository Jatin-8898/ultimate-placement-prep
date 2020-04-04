import java.util.*;

class Pallindrome{
	public static void main(String[] args) {
		System.out.println(checkForPallindrome("abccba"));
		System.out.println(checkForPallindrome("I did, Did I"));
	}

	public static boolean checkForPallindrome(String str){
		
		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder originalString  = new StringBuilder(str.length());
		String lowerCase = str.toLowerCase();

		for(int i=0; i< lowerCase.length(); i++){
			
			char c = lowerCase.charAt(i);
			
			if(c>='a' &&  c<='z'){
				originalString.append(c);
				stack.push(c);
			}
		}

		StringBuilder reversedString =  new StringBuilder(stack.size());

		while(!stack.isEmpty()){
			reversedString.append(stack.pop());
		}

		return reversedString.toString().equals(originalString.toString());
	}
}
