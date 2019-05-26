import java.util.*;

class TwoGreat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            long a = s.nextLong();
            int b = s.nextInt();

            System.out.println(a >> b);

            t--;
        }
        s.close();
    }
}