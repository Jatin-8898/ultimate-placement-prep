
import java.util.*;

class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t > 0) {
            int a = s.nextInt();
            int lastDigit = a % 10;

            int firstDigit = Integer.parseInt(Integer.toString(a).substring(0, 1));

            System.out.println(firstDigit + lastDigit);

            t--;
        }
        s.close();
    }

    /* Alternative method
        int last = a % 10;      eg 1234  = 4
        
        
        while(a>0){         KEEP ON DIVIDING & GET THE COUNT
            n = n / 10;
            c++;
        }
                            Eg 1234 ie (1234 / 100) gives "1"

        int first = a / Math.pow(10, c-1);    
    */
}