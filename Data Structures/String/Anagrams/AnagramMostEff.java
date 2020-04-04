// Java program to check if two strings are anagrams of each other 

/* 
Bit Manipulation

If we start at a value of 0 and XOR all the characters of both strings, 
We should return an end value of 0 if they are anagrams 
Because there would be an even occurrence of all characters in the anagram.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class AnagramMostEff 
{ 

    // Function to check whether two strings are anagram of each other 
    static boolean areAnagram(String str1, String str2) 
    { 
        if (str1.length() != str2.length()) // If two strings have different length 
            return false; 

        int value = 0;      // To store the xor value 

        for (int i = 0; i < str1.length(); i++) 
        { 
            value = value ^ (int) str1.charAt(i); 
            value = value ^ (int) str2.charAt(i); 
        } 

        return value == 0;      //Return true if val is 0

    } 

    // Driver code 
    public static void main(String[] args) 
    { 
        String str1 = "geeksforgeeks"; 
        String str2 = "forgeeksgeeks"; 
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are anagram of each other"); 
        else
            System.out.println("The two strings are not anagram of each other"); 

    } 
} 