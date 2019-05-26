import java.util.*;

class TestRobot{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            s.nextInt();

            int x = s.nextInt();
            s.nextLine();

            String in = s.nextLine();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < in.length(); i++) {
                set.add(x);

                if (in.charAt(i) == 'R') {
                    x++;
                    set.add(x);
                } else {
                    x--;
                    set.add(x);
                }
            }

            System.out.println(set.size());
            t--;
        }

        s.close();
    }
}