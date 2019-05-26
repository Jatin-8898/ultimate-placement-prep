import java.io.IOException;
import java.util.*;

class Noob {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int area = s.nextInt();
            int l1 = s.nextInt();
            int l2 = s.nextInt();
            s.nextLine();
            int p = Integer.parseInt(s.nextLine());

            int h = 0;
            h = (area * 2) / l2;
            // System.out.println("HEI "+ h);

            double newA = (0.5) * l1 * h;
            // System.out.println("NEW ARE "+ newA);

            if (l1 == p) {
                double ans = (newA) + (h * p);
                System.out.println(Math.round(ans));
            
            } else {
                double ans = (newA * p) + (h * p);
                System.out.println(Math.round(ans));
            }
            t--;
        }
        s.close();
    }
}