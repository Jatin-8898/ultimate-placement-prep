import java.io.*;
import java.util.*;


class CountPrefix{
    
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         long[] A = new long[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Long.parseLong(arr_A[i_A]);
         }
         int Q = Integer.parseInt(br.readLine().trim());
         while(Q-->0)
         {
              int L = Integer.parseInt(br.readLine().trim());
              int R = Integer.parseInt(br.readLine().trim());
              long K = Long.parseLong(br.readLine().trim());

              long out_ = solve(A, Q, K, R, L);
              System.out.println(out_);
         }
         wr.close();
         br.close();
         */
         
         
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long[] a = new long[n];
        
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
    
        int q = s.nextInt();
        
        while(q-- > 0){
            int l = s.nextInt();
            int r = s.nextInt();
            int k = s.nextInt();
            
            long out_ = solve( a, q, k, r, l);
            System.out.println(out_);
        }    
        
    }
    static long solve(long[] A, int Q, long K, int R, int L){
        // Write your code here
        
        Q--;
            
        int  check = L-1;
    
        if(A[check] % K != 0){
            return -1;
        }else{
    
            for(check=L;   check<R && (A[check] % K) == 0;   check++){
                continue;
            }
            return (long)check;
        }
    
    }
}