import java.io.*;
import java.util.*;


 class MaxMul {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());

        for(int t_i=0; t_i<T; t_i++)
        {   int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            
            int[] A = new int[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            
            long out_ = solve(A,N);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static long solve(int[] A,int N){
        //Write your code here
        long prod1 = 0;
        long prod2 = 0;

        if (N == 1) 
		    return (long)A[0]; 

        if (N == 2) {
            return (Math.abs(A[0]) * Math.abs(A[1])); 
        } 

        Arrays.sort(A);

        prod1 = Math.abs(A[N-2]) * Math.abs(A[N-1]);
        prod2 = Math.abs(A[0]) * Math.abs(A[1]);

        if(prod1 > prod2){
            return prod1;
        }else{
            return prod2;
        }
         
    }
}