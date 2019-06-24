
import java.util.*;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int a = s.nextInt();
            int rem = 0, res = 0;
            int num = a;
            while (num > 0) {
                rem = num % 10;
                res += rem;
                num /= 10;
            }
            System.out.println(res);

            t--;
        }
        s.close();
    }
}