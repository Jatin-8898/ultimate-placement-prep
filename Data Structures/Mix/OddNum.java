import java.util.Scanner;
public class OddNum{

     public static void main(String []args){
        
        int num;
        int odd = 0, even = 0, zero = 0;
        
        Scanner scan = new Scanner(System.in);
        
        num = scan.nextInt();
        
        System.out.println (num);
        
        while (num >= 1) {
            
            if (num % 10 == 0) {
                zero += 1;
            } else if (num % 2 == 0) {
                even += 1;
            } else if (num % 2 != 0){
                odd += 1;
            }
            
            num /= 10;
        }
        
        System.out.println ("odds = " + odd + "\n even = " + even + "\n zero = " + zero);
     }
}