import java.util.*;
class NumberChecker{
	/*
	Given an integer array as input, find out the integers which contains the digits 1,2,3 numbers in its formation . The order of 1,2,3 need
	not be sequential.
	In case multiple numbers qualifies the condition, The outcome should be ordered based on numeric value (lesser number first followed
	by greater number and so on..) and separated by comma.
	In case no number qualifies the conditions, it should return -1.
	Example:
	Input :
	1456
	345671
	43218
	123
	Output: 123, 43218
	Explanation: In the above example, as there are 2 numbers(43218,123) which qualifies the condition, we need to sort the output in
	ascending order seperated by comma.
	*/

	public static void main(String[] args) {
		int[] a = {1456, 345671, 43218,123 };
		System.out.println(findQualifiedNumbers(a));
	}

	static String findQualifiedNumbers(int[] numberArray) {
		
		Arrays.sort(numberArray);

		String num = "", res = "";
		
		for (int i : numberArray) {		
			
			num = i + "";				//add the number in the STRING of num

			if (num.indexOf("1") != -1 && num.indexOf("2") != -1 && num.indexOf("3") != -1) {
				res += i + ",";			//if it contains 123 in its index append it to the string
			}
		}
		
		//If the res is blank then display -1 else return the substr from 0 to len-1
		return res.equals("") ? "-1" : res.substring(0, res.length() - 1);
	}

}