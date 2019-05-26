import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PerfectNotPerfect {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = Long.parseLong(s.nextLine());

        //long temp = 0;
       /*  for (long i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        } */
        long sum = 1; 

        // Find all divisors and add them 
        for (long i=2; i*i<=n; i++) 
        { 
            if (n%i==0) 
            { 
                if(i*i!=n) 
                    sum = sum + i + n/i; 
                else
                    sum=sum+i; 
            } 
        } 
        // If sum of divisors is equal to 
        // n, then n is a perfect number 
        if (sum == n && n != 1) 
            System.out.println("Perfect");        
         else {
            System.out.println("Not Perfect");
        }
        s.close();
    }

    /*
     * public static void main(String[] args) { Scanner s = new Scanner(System.in);
     * String n = s.nextLine(); stringContainsNumber(n); s.close(); }
     * 
     * public static void stringContainsNumber(String s) { if
     * (Pattern.compile("[1]").matcher(s).find()) System.out.println("Not Perfect");
     * else System.out.println("Perfect"); }
     */
}