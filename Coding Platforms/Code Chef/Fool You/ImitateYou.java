import java.util.*;

class ImitateYou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '.')
                System.out.println(count);

            else if (s.charAt(i) == '+' && open == 0)
                count++;

            else if (s.charAt(i) == '-' && open == 0)
                count--;

            else if (s.charAt(i) == '[')
                open++;

            else if (s.charAt(i) == ']') {
                open--;
                count = 0;
            }

        }

        sc.close();
    }
}