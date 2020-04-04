import java.util.*;
import java.io.*;
class ToggleCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s.length());
        
        for(char c: s.toCharArray()){
            
            if(Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));    
            else
                sb.append(Character.toUpperCase(c));
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}