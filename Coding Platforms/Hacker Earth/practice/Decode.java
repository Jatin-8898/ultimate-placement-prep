import java.io.*;
import java.util.*;
/*Given an encrypted message, Erwin encodes it the following way:

Removes the median letter of the word from the original word and appends it to the end of the encrypted word and repeats the process until there are no letters left.

A median letter in a word is the letter present in the middle of the word and if the word length is even, the median letter is the left one out of the two middle letters.

Given an encoded string, write a program to decode it.

Input Format:

The first line of input contains T, the number of test cases. 
Each test case contains a String S, denoting the encoded word.

Output Format:

Print the decoded word for each test case in a separate line.
SAMPLE INPUT 
2
wrien
reen

SAMPLE OUTPUT 
erwin
eren*/

public class Decode {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String s = br.readLine();

            String out_ = decode(s);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }

    static String decode(String s){
        int i;
        int l=s.length();
        
        String str="";

        for(i=l-2;  i>=0;   i=i-2)
        {
            str=str+s.charAt(i);
            
        }


        if(l%2==0){
            for(i=1;i<l;i=i+2)
            str=str+s.charAt(i);
    
        }else{
            for(i=0;i<l;i=i+2)
            str=str+s.charAt(i);
        }

        return str;
    }
}
