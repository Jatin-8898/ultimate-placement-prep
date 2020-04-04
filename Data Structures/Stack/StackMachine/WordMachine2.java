import java.util.*;
 
public class Solution {

    public int solution(String S){

        String[] arr = S.split("\\s");
        Stack<Integer> stack = new Stack<Integer>();

        for (int i=0; i<arr.length; i++) {
            switch (arr[i])
            {
                case "DUP":
                    if(stack.isEmpty()) 
                        return  -1 ;
                    
                    stack.push(stack.peek());
                    break;
                
                case "POP":
                    if(stack.isEmpty()) 
                        return  -1 ;
                    stack.pop();
                    break;

                case "+":
                    if(stack.size() < 2) 
                        return -1 ;
                    
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    if(stack.size() < 2) 
                        return -1 ;

                    stack.push(stack.pop() - stack.pop());
                    break;

                default:
                    stack.push(Integer.parseInt(arr[i]));
                    break;
            }
        }

        if(stack.size() < 1) 
            return -1 ;
        else
            return stack.pop();
    }
}