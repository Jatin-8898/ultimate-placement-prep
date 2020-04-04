import java.util.ArrayList; 

public class DistinctPermutation { 

	// Function that returns true if string s is present in the Arraylist 
	static boolean isPresent(String s, ArrayList<String> Res) 
	{ 
		// If present then return true 
		for (String str : Res) { 
			if (str.equals(s)) 
				return true; 
		} 
		return false; 
	} 

	// Function to return an ArrayList containg all the distinct permutations of the string 
	static ArrayList<String> distinctPermute(String str) 
	{ 
		// If string is empty 
		if (str.length() == 0) { 
			ArrayList<String> baseRes = new ArrayList<>(); 
			baseRes.add(""); 
			return baseRes; 
		} 

		// Take first character of str 
		char ch = str.charAt(0); 

		// Rest of the string after excluding the first character 
		String restStr = str.substring(1); 

		// Recurvise call 
		ArrayList<String> prevRes = distinctPermute(restStr); 

		// Store the generated sequence into the resultant Arraylist 
		ArrayList<String> Res = new ArrayList<>(); 
		for (String s : prevRes) { 
			for (int i = 0; i <= s.length(); i++) { 
				String f = s.substring(0, i) + ch + s.substring(i); 

				// If the generated string is not already present in the Arraylist 
				if (!isPresent(f, Res)) 

					Res.add(f); // Add the generated string to the Arraylist 
			} 
		} 
		return Res; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String s = "abbb"; 
		System.out.println(distinctPermute(s)); 
	} 
} 