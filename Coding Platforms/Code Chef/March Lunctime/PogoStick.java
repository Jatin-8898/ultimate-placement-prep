import java.util.*;

class PogoStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {   //eg  3 6 4 7 2    ,  m = 2
                
                if ((i - m) < 0){    //If curr i - jump < 0 skip the iterations
                    continue;
                
                }    

                int k = a[i] + a[i - m];    //We are now at 7 ie i=3 so k = 7+6= 13

                if (k >= a[i])              // If 13 ie > 7
                    a[i] = k;               //Update 7 as 13
            }

            int max = Integer.MIN_VALUE;

            //For finding max & returning it
            for (int i = n - m; i < n; i++) {   //5-2= 3 ie i is pointing at 7      
                if (i < 0)
                    continue;
                max = Math.max(max, a[i]);
            }

            System.out.println(max);
            t--;
        }
        sc.close();
    }
}
/*
 * if(a[i+1] > a[i]){ index = i+1;
 * 
 * if(a[index + 1] > a[index]){ res = a[index+1] + a[index]; }
 * 
 * }else{ index = a[i]; }
 */