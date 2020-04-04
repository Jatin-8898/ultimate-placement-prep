import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class JesseCookies {

    /*
     * Complete the cookies function below.
     */
    static int cookies(int k, int[] A) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int operations = 0;
        
        //Initialize priority queue
        for(int a : A) {
            pq.add(a);
        }
         while(pq.size() > 1) {
            
            if(pq.peek() >= k) {
                return operations;
            
            } else {
                int cookie1 = pq.poll();
                int cookie2 = pq.poll();
                int newCookie = cookie1 + cookie2 * 2;
                pq.add(newCookie);
                operations++;
            }
        }
        if(pq.size() > 0 && pq.peek() >= k) {
            return operations;
        } else {
            return -1;
        }

        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
