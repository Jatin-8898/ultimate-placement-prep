import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Brackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char c : expression.toCharArray()){           
            switch (c){
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;       
            }// end switch 
        }// end of for  
        if (!stack.isEmpty())
            return false;
        return true;  
     }

    
    public static void main(String[] args) throws IOException {
        
        String expression, ans, result = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE TOTAL NO OF EXPRESSIONS:");
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
        	expression = br.readLine();
            //expression = scanner.nextLine();
            
            if(isBalanced(expression)){
                 ans = "YES";
            }else{
                ans  = "NO";
            }
           
        	System.out.println(ans);
        
        }//end of for
    
    }
}

/******************ANOTHER WAY OF DOING*********************
  public static boolean isBalanced(String expression) {
	// Must be even
	if (expression.length()%2 == 1) 
	    return false;
	else {
	  char[] brackets = expression.toCharArray();
	  Stack<Character> s = new Stack<>();
	  for (char bracket : brackets)
	    switch (bracket) {
	      case '{': s.push('}'); break;
	      case '(': s.push(')'); break;
	      case '[': s.push(']'); break;
	      default :
	        if (s.empty() || bracket != s.peek())
	          return false;
	        s.pop();
	    }
	  return true;
	}
}
*/