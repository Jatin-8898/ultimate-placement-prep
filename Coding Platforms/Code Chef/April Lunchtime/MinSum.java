import java.util.*;
class MinSum{
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0){
            int n  = s.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            int min = Integer.MAX_VALUE;

            /*  TLE SOLUTION

            Calculate xor with every element & return min  O(n^2) 
            
                for (int j = 0; j < n; j++) {

                    int sum = 0;
                    
                    for (int k = 0; k < n; k++) 
                        sum += a[k] ^ a[j];

                    if (sum < min) 
                        min = sum;
                }
            */
            int sum1, sum2, ans=0, total=0;
            for(int i=0; i<31; i++) {
                sum1=0;
                sum2=0;

                for(int j=0;j<n;j++)
                    if(a[j] & (1 << i))
                        sum1++;
                    else
                        sum2++;
                
                    if(sum1>sum2)
                        total += 1<<i;
            }
            for(int i=0;i<n;i++)
                ans+=a[i]^total;

            System.out.println(ans);
            t--;
        }
        s.close();
    }
}