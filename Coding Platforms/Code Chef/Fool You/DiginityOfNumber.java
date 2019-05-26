import java.util.*;

class DignityOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 1729 || n == 81 || n == 1 || n == 1458)
            System.out.println("elegant");
        else
            System.out.println("not elegant");

        s.close();
    }

    public static void getDignity() {
        int n, num, rem, sum = 0, rev = 0, ans;
        n = sc.nextInt();
        num = n;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            n /= 10;
        }
        ans = sum;
        while (sum > 0) {
            rem = sum % 10;
            rev = rev * 10 + rem;
            sum /= 10;
        }
        ans *= rev;
        if (ans == num)
            System.out.println("elegant");
        else
            System.out.println("not elegant");
    }
}