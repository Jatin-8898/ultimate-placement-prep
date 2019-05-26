import java.util.*;

class Rain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int te = s.nextInt();

        while (te > 0) {
            int n = s.nextInt();
            int q = s.nextInt();
            int[] a = new int[n];
            int[] t = new int[q];

            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            s.nextLine();

            for (int i = 0; i < q; i++) {
                t[i] = Integer.parseInt(s.nextLine());
            }

            for (int j = 0; j < q; j++) {

                int count = 0;
                int index = 0;
                int sum = 0;

                for (int i = 0; i < a.length; i++) {

                    sum += a[i];

                    if (sum > t[j]) {
                        sum = a[i];
                        count++;
                        index = i;
                    }
                    
                    if (index < 0) {
                        index = 0;
                    }
                }
                System.out.println(count + " " + index);
            }

            te--;
        }
        s.close();
    }
}