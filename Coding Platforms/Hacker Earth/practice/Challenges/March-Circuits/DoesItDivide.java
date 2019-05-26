import java.util.*;
import java.math.BigInteger;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class DoesItDivide {
    
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner s = new Scanner(System.in);
        
        int  t = s.nextInt();                 // Reading input from STDIN
    
        while(t > 0){
            try {
            
                int n = s.nextInt();
                int sum = 0;

                int[] fact = new int[n+1]; 
                fact[0] = 1;
                
                for(int i=1; i<=n;i++)
                    fact[i] = i * fact[i-1];

               /*  BigInteger inc = new BigInteger("1");
                BigInteger fact = new BigInteger("1");

                for(int i=1;i<=n;i++)
                {
                    fact=fact.multiply(inc);
                    inc=inc.add(BigInteger.ONE);
                } */
                
                for (int i = 1; i <= n; i++) 
                    sum += i;
            
                if(fact[n] % sum == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            
                } catch (Exception e) {
                System.out.println("Caught" + e);
            }        
            t--;
        }
        s.close();
    }
}

