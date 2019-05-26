
import java.util.*;

class BackToChildhood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t > 0) {
            String str = s.nextLine();
            int br = 0, mul = 0, flag = -1;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '/')
                    br++;
                else
                    mul++;

                if (br < mul) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Irregular since Childhood.");
            else
                System.out.println("Regular since Childhood.");
            t--;
        }
        s.close();
    }
}