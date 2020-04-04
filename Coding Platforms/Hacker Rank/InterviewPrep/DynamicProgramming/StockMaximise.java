import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class StockMaximise {
    public static long getMaxProfit(Integer[] prices) {
        long profit = 0L;
        int maxSoFar = 0;
        for (int i = prices.length - 1; i > -1 ; i--) {
            if (prices[i] >= maxSoFar) 
                maxSoFar = prices[i];

            profit += maxSoFar - prices[i];
            //System.out.println("PROFIT: "+profit);
        }
        return profit;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] pricesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> prices = new ArrayList<>();

            for (int i = 0; i < n; i++) 
                prices.add(Integer.parseInt(pricesTemp[i]));
        
            Integer[] arr = new Integer[prices.size()]; 
            arr = prices.toArray(arr); 
            long result = getMaxProfit(arr);
            System.out.println(result);
        }
        bufferedReader.close();
    }
}
