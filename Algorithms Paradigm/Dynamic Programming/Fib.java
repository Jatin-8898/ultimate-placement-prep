import java.util.*;
import java.io.*;
class Fib {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int  t = s.nextInt();                 
    
        while(t > 0){
            int n = s.nextInt();
            
            int[] fib = new int[n+1]; 
            
            if(n < 1){
                System.out.println(1);
            }
            
            fib[0] = 1;
            fib[1] = 1;
            for(int i=0; i< n;i++){
                fib[i] = fib[i-1] + fib[i-2];
            }
            
            System.out.println(fib[n]);
            
            t--;
        }
    }
}
