import java.io.*;
import java.util.*;
public class Edge {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int a[] = new int[N];
        for(int i=0; i<N; i++)
        {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int val = 0;
        int sum = 0;

        for(int i=0; i<N-1; i++)
        {
            int U = sc.nextInt();
            int V = sc.nextInt();
        
            if(map.containsKey(a[U-1])){
                val = map.get(a[U-1]);
                sum = a[U-1]  + val + a[V-1];
                //System.out.println(sum + " IN IF");
                if(sum >= K){
                    count++;
                    //System.out.println("COUNT in IF "+ count);
                }
                
            }else{
                map.put(a[U-1] , a[V-1]);
                //System.out.println(a[U-1] + a[V-1] + " IN ELSE");
                if(a[U-1] + a[V-1] >= K){
                    count++;
                    //System.out.println("COUNT in ELSE "+ count);
                }
            }

        }
        System.out.println(count);

    }
}