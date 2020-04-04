
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Fact {
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner s = new Scanner(System.in);
        int  t = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    
        while(t > 0){
            int n = s.nextInt();
            
            int[] fact = new int[n+1]; 
            
            
            
            fact[0] = 1;
            
            for(int i=1; i<= n;i++){
                fact[i] = i * fact[i-1];
            }
            
            System.out.println(fact[n]);
            
            t--;
        }
    }
}
