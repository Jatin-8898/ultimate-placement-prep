import java.util.*;
/* 
Time Complexity: O(nLogn)
 */
class Anagram{
    public static void main(String[] args) {
        String a = "allergy ";
        String b = "allergic";
        if(isAnagram(a, b))
            System.out.println("YES");
        else            
            System.out.println("NO");
        
    }
    private static boolean isAnagram (String A, String B){
        int n1, n2, i;
        n1 = A.length();
        n2 = B.length();

        if(n1 != n2)
            return false;
        
        char tempArray[] = A.toCharArray(); 
        Arrays.sort(tempArray); 
        
        char tempArray2[] = B.toCharArray(); 
        Arrays.sort(tempArray2); 
       
        for(i = 0 ; i < n1 ; i++)
        {
            if( tempArray[i] != tempArray2[i] )
                return false;
        }
       return true;
    }
}