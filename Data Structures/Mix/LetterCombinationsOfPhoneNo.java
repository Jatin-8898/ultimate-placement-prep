// Java implementation of the approach 
import java.io.*; 
import java.util.*; 

/* 
0 
1
2 => abc
3 => efg
...
so on

Input: arr[] = {2, 3}
Output: ad ae af bd be bf cd ce cf

Input: arr[] = {9}
Output: w x y z
 */
class LetterCombinationsOfPhoneNo 
{ 
	// Function to return a vector that contains all the generated letter combinations 
	static ArrayList<String> letterCombinationsUtil(int[] number, int n, String[] table) 
	{ 
        // To store the generated letter combinations 
        ArrayList<String> list = new ArrayList<>(); 
        
        Queue<String> q = new LinkedList<>(); 
        q.add(""); 
        System.out.println(q+" q");

        while(!q.isEmpty()) 
        { 
            String s = q.poll(); 
            System.out.println(s+" Removed from q");

            // If complete word is generated  push it in the list 
            if (s.length() == n) 
                list.add(s); 
            else
            { 
                String val = table[number[s.length()]];  //eg number[1] viz 2 and table[2] = abc
                System.out.println(val+" got value from the table");
                
                for (int i = 0; i < val.length(); i++) 
                { 
                    q.add(s + val.charAt(i));   //Add ie popped element from q & the new ele frm val
                    System.out.println(q + " Added in queue");
                } 
            } 
        } 
        return list; 
	} 

	// Function that creates the mapping and calls letterCombinationsUtil 
	static void letterCombinations(int[] number, int n) 
	{ 
        // table[i] stores all characters that corresponds to ith digit in phone 
        String[] table = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" }; 

        ArrayList<String> list = letterCombinationsUtil(number, n, table); 
        
        for (int i = 0; i < list.size(); i++)   // Print the contents of the list 
        { 
            System.out.print(list.get(i) + " "); 
        } 
	} 
	public static void main(String args[]) 
	{ 
        int[] number = { 2, 3 }; 
        int n = number.length; 
        letterCombinations(number, n); 
	} 
} 

