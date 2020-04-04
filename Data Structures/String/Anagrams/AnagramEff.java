import java.util.*;
/* 
Approach : Count charcters using one array
Time Complexity: O(n)
 */
class AnagramEff{
    public static void main(String[] args) {
        String a = "allergy ";
        String b = "allergic";
        if(areAnagram(a.toCharArray(), b.toCharArray()))
            System.out.println("YES");
        else            
            System.out.println("NO");
        
    }
    static boolean areAnagram(char[] str1, char[] str2) 
    { 
        int  NO_OF_CHARS = 256;
        int i; 
        
        // Create a count array and initialize all values as 0 
        int count[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count, 0); 
        

        // If both strings are of different length.  like "aaca" and "aca"
        if (str1.length != str2.length) 
            return false; 


        // For each character in input strings, increment count in the corresponding count array 
        for (i = 0; i < str1.length && i < str2.length; i++) { 
            count[str1[i]]++; 
            count[str2[i]]--; 
        } 

        // See if there is any non-zero value in count array 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count[i] != 0) 
                return false; 

        return true; 
    } 
}
