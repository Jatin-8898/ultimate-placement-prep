import java.util.*;

class LuckyFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            String digit = s.next();
            int count = 0;
            for (int i = 0; i < digit.length(); i++) {

                char ch = digit.charAt(i);

                if (ch == '4')
                    count++;
            }
            System.out.println(count);
        }
        s.close();
    }
}