import java.util.*;
public class MakeAnagram {

	public static int deletionRequired(String a, String b) {
		/*Declare the integer array of 26 ie total alphabets*/
		int[] lettercounts = new int[26];

		/*For each char c convery the string to the Character array*/
		for(char c : a.toCharArray()){
			lettercounts[c - 'a']++;		//Increment the Lettercount array ie a-a = 0
			//System.out.println(Arrays.toString(lettercounts));
		}

		/*For each char c convery the string to the Character array*/
		for(char c : b.toCharArray()){
			lettercounts[c - 'a']--;		//Decrement the Lettercount array
			//System.out.println(Arrays.toString(lettercounts));
		}
		
		//System.out.println(Arrays.toString(lettercounts));

		int result = 0;
		for(int i : lettercounts){			//for each i in lettercounts
			result = result + Math.abs(i);  //Count the number 
		}

		return result;
	}

	public static void main(String[] args) {
	
		String  a = "abc";
		String  b = "cbc";

		System.out.println("The Total number of deletions required to make Both strings Anagram is : "+ deletionRequired(a, b));
	}

}



/*

This changes the inital code but is optimized

Map<String, Integer> magazineMap;
boolean isValid;

public Solution(String magazine, String note) {
    magazineMap = new HashMap<String, Integer>();
    isValid = true;

    for (String word : magazine.split(" ")) {
        Integer i = magazineMap.get(word);

        if (i == null) {
            magazineMap.put(word, 1);
        } else {
            magazineMap.put(word, i + 1);
        }
    }

    for (String word : note.split(" ")) {
        Integer i = magazineMap.get(word);

        if (i == null || magazineMap.get(word) == 0) {
            isValid = false;
            break;
        } else {
            magazineMap.put(word, i - 1);
        }
    }
}

public boolean solve() {
    return isValid;
}
*/


/*
	try (final Scanner in = new Scanner(System.in)) {

		final int numMagazineWords = in.nextInt();
		final int numRansomWords = in.nextInt();

		final Map<String, Integer> magazineWordsToCounts = new HashMap<>();
		IntStream.range(0, numMagazineWords).mapToObj(i -> in.next()).forEach(word -> magazineWordsToCounts.merge(word, 1, (a, b) -> a + b));

		final Map<String, Integer> ransomWordsToCounts = new HashMap<>();
		IntStream.range(0, numRansomWords).mapToObj(i -> in.next()).forEach(word -> ransomWordsToCounts.merge(word, 1, (a, b) -> a + b));

		boolean ransomNotePossible = true;

		for (final String word : ransomWordsToCounts.keySet()) {
			if (ransomWordsToCounts.get(word) > magazineWordsToCounts.getOrDefault(word, 0)) {
				ransomNotePossible = false;
				break;
			}
		}
		if (ransomNotePossible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
*/