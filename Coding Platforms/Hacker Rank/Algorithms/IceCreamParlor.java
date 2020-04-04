import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IceCreamParlor {

    //Similar to TWO SUM PROBLEM

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int t = scan.nextInt();

        for(int i=0; i<t; i++) {

            int money = scan.nextInt();
            int flavors = scan.nextInt();

            int[] prices = new int[flavors];
            
            for (int j=0; j<flavors; j++) {
                prices[j] = scan.nextInt();
            }
            

            // Key = price that will solve the problem, 
            //Value = the flavor id (base 0) having money - neededPrice

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(flavors/2);
           
            for (int k=0; k < flavors; k++) {
                
                if (prices[k]  <  money) {
                
                    if (map.containsKey(prices[k])) {            // solution found
                        System.out.println((map.get(prices[k]) + 1) + " " + (k + 1));
                        break;
                
                    } else { // add as possible solution
                        map.put(money - prices[k],  k);
                    }
                }
            }
        }
        scan.close();
    }
}
