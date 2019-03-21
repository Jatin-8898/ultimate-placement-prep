import java.util.*;
class RevArrayInPlace{
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7}; 
		reverse(numbers); 
	}

	private static void reverse(int[] input){
		
		if(input == null || input.length <= 1)
			return;

		//The idea is to take the element from the last and swap with first and iterate till n/2
		for (int i = 0; i < input.length / 2; i++) {

			 int temp = input[i]; // swap numbers 
			 input[i] = input[input.length - 1 - i]; 
			 input[input.length - 1 - i] = temp; 
		}

		System.out.println(Arrays.toString(input));

	}


}