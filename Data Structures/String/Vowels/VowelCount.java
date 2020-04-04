/* IMPORTANT: Multiple classes and nested static classes are supported */


//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class VowelCount {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        String s = sc.nextLine();
        for (int i=0; i<t; i++){
            
            //System.out.println(s);
            int res = VowelCheck(s);
            System.out.println(res);
        }
    }
    
    private static int VowelCheck(String s){
        int count = 0;
        
        char[] str = s.toCharArray();
        
        
        for(int i=0;  i<str.length;  i++){
            
            if(isVowel(str[i])){
                count++;
            }
        }
        return count;
    }
    
    private static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        else 
            return false;
    }
    
    
}
