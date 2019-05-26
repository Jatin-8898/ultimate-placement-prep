import java.util.*;

class KeenGrasp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {

            String s = sc.nextLine();
            int answer = 0;
            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i) - '0';

                if (c == 0 || c == 4 || c == 6 || c == 9) {
                    answer++;
                } else if (c == 8) {
                    answer += 2;
                }
            }
            System.out.println(answer);

            t--;
        }
        sc.close();
    }
}
