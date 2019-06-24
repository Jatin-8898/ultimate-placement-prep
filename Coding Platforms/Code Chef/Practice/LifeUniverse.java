
import java.util.*;

class LifeUniverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int found = s.nextInt();

            if (found == 42)
                break;

            System.out.println(found);
        }

        s.close();
    }
}