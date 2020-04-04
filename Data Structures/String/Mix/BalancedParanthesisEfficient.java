// Java program to check if 
// sequence obtained by
// concatenating two bracket 
// sequences is balanced or not.
import java.io.*;
 
class BalancedParanthesisEfficient
{
 
// Check if given string
// is balanced bracket 
// sequence or not.
static boolean isBalanced(String s){
     
    // To store result of comparison 
    // of count of opening brackets 
    // and closing brackets.
    int count = 0;
    int n = s.length();
    for (int i = 0; i < n; i++) 
    {
         
        // If current bracket is  an opening bracket, 
        // then increment count.
        if (s.charAt(i) =='(')
        {
            count ++;
        }
         
        // If current bracket is a closing bracket, then
        // decrement count and check
        // if count is negative.
        else
        {
            count--;
            if (count < 0)
                return false;
        }
    }
 
    // If count is positive then
    // some opening brackets are
    // not balanced.
    if (count > 0)
        return false;
     
    return true;
}
 
// Function to check if string 
// obtained by concatenating 
// two bracket sequences is
// balanced or not.
static boolean isBalancedSeq(String s1, String s2){
 
    // Check if s1 + s2 is
    // balanced or not.
    if (isBalanced(s1 + s2))
        return true;
     
    // Check if s2 + s1 is
    // balanced or not.
    return isBalanced(s2 + s1);
}
 
// Driver code
public static void main(String [] args)
{
    String s1 = ")()(())))";
    String s2 = "(()(()(";
     
    if (isBalancedSeq(s1, s2))
    {
        System.out.println("Balanced");
    }
    else
    { 
        System.out.println("Not Balanced");
    }
}
}