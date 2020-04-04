// Java program to check if the characters in the given string forms a Palindrome  in O(1) extra space 
import java.io.*; 

class FormPalInO1Space 
{ 

    // Utilty function to get the position of first character in the string 
    static int firstPos(String str, int start, int end) 
    { 
        int firstChar = -1; // Get the position of first character in the string 
        
        for(int i = start; i <= end; i++) 
        { 
            if(str.charAt(i) >= 'a'&& str.charAt(i) <= 'z') 
            { 
                firstChar = i; 
                break; 
            } 
        } 
        
        return firstChar; 
    } 

    // Utilty function to get the position of last character in the string 
    static int lastPos(String str, int start, int end) 
    { 
        int lastChar = -1;          // Get the position of lastcharacter in the string 
    
        for(int i = start; i >= end; i--) 
        { 
            if(str.charAt(i) >= 'a'&& str.charAt(i) <= 'z') 
            { 
                lastChar = i; 
                break; 
            } 
        } 
        
        return lastChar; 
    } 



    // Function to check if the characters in the given string forms a Palindrome in O(1) extra space 
    static boolean isPalindrome(String str) 
    { 
        int firstChar = 0, 
            lastChar = str.length() - 1; 
        boolean ch = true; 

        for (int i = 0; i < str.length(); i++) 
        { 
            firstChar = firstPos(str, firstChar, lastChar); 
            lastChar = lastPos(str, lastChar, firstChar); 

            // break, when all letters are checked 
            if (lastChar < 0 || firstChar < 0) 
                break; 

            if (str.charAt(firstChar) == str.charAt(lastChar)) 
            { 
                firstChar++; 
                lastChar--; 
                continue; 
            } 
            
            // if mismatch found, break the loop 
            ch = false; 
            break; 
        } 

        return ch; 

    } 

    // Driver code 
    public static void main (String[] args) 
    { 
        String str = "m a 343 la y a l am"; 	
        if(isPalindrome(str)) 
            System.out.print("YES"); 
        else
        System.out.println("NO"); 
    } 
} 
