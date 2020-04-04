import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import javafx.util.Pair; 

public class SpecialStringAgain {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {

        int counter = n;    // initialize counter to n because each character is a palindromic string
        int consecutive = 1;     // to count conseutive characters that are the same
        int midIndex = -1;      // the middle index of a 3-character symmetry
                    
        for (int i = 1; i < n; i++) {       // compare with previous character so start with i=1
            if (s.charAt(i) == s.charAt(i-1)) {
                // Condition 1: All of the characters are the same
                // For n consecutiveutive characters that are the same,
                // we have this formula:
                // Number of palindromic strings = (n-1) + (n-2) + ... + (n-(n-1))
                counter += consecutive;
                consecutive++;
                    
                // Condition 2: All characters except the middle one are the same
                if (midIndex > 0) {
                    // check for symmetry on both sides of the midIndex
                    if ((midIndex-consecutive) >= 0 && s.charAt(midIndex-consecutive) == s.charAt(i)) 
                        counter++;
                    else 
                        // no more posibility of palindromic stringwith this midIndex
                        midIndex = -1; 
                }

            } else {
                // reset consecutiveutive chars counter to 1
                consecutive = 1;
                    
                if (((i-2) >= 0) && s.charAt(i-2) == s.charAt(i)) {  //check for a 3-character symmetry
                    counter++; // 3-char symmetry is detected
                        
                    // to check if the next characters are the same and symmetrical along the midIndex
                    midIndex = i-1;
                } else {
                    midIndex = -1;
                }
            }
        }
        return counter;
    }

    static long substrCount1(int n, String s){      
        /*Try to club the characters and assign a frequency.
            aabbaa          Internally In List we have Pairs
            a->2            [ a => 2 ]
            b->2            [ b => 2 ] 
            a->2            [ a => 2 ]  

            abab
            a->1
            b->1
            a->1
            b->1
        */
        List<Pair<Character,Integer>> list = new ArrayList<>();
        for(int i =0 ; i<n ;i++){
            int count = 1;
            char ch = s.charAt(i);
            while(i+1 < n   &&  ch == s.charAt(i+1)){   //If both same incr count & add it in Map
                count++;    
                i++;
            }
            list.add(new Pair<>(ch,count));
        }
        long result = 0;

        for(int i=0; i<list.size(); i++){ //  find special strings
            result += list.get(i).getValue() * (list.get(i).getValue() + 1)/2;  //n * (n+1) /2

            if(i+2 < list.size()        //Eg b c b      and     i=> first b
                    && list.get(i).getKey()  == list.get(i+2).getKey() 
                    && list.get(i+1).getValue()==1)
            result += Math.min(list.get(i).getValue(),  list.get(i+2).getValue());
            
        }
        return  result;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        long result = substrCount1(n, s);
        System.out.println(result);
        scanner.close();
    }
}
