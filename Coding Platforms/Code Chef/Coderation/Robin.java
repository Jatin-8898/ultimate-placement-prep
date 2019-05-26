import java.util.*;

class Robin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int a = s.nextInt();
            int total = a / 10;
            // System.out.println(total);

            if (a % 10 != 0) {
                total += 1;
            } 
            if ((total * 10) % 100 == 0) {
                System.out.println((total * 10) + 10);
            } else {
                System.out.println(total * 10);
            }

            t--;
        }
        s.close();
    }
}
