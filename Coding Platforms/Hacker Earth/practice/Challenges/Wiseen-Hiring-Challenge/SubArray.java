
import java.util.*;

class SubArray {
    public static void main(String args[]) throws Exception {
        // Scanner
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Reading input from STDIN
        int a[] = new int[n+1];
        String res = "";
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        double di = 0.0;
        double rem = 0.0;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                di = (a[i] + a[j]) / j;
                rem = (j+1) / (i+1);

                if ( di >  rem) {
                    count++;
                    res += (i+1) + " " + (j+1) + "\n";
                }
            }
        }

        System.out.println(count); // Writing output to STDOUT
        System.out.print(res);

        s.close();
    }
}
