import java.util.*;
import java.io.*;
class StockBuySellOnce{
    /*  Given an array of stock prices, 
        find the maximum profit that can be earned by doing a single 
        transaction of buy and sell in the given period of time. */
    public static void main(String[] args) {
        int[] arr = {100, 80, 120, 130, 70, 60, 100, 125};
        System.out.println(MaxProfitOnce(arr));
    }
    private static int MaxProfitOnce(int[]  stockPrice){
        int profit  = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < stockPrice.length; i++) {
            //Find the min price    eg 80, 100
            minPrice = Math.min(stockPrice[i], minPrice);

            //Find the max profit       eg 120 - 80
            profit = Math.max(profit, stockPrice[i] - minPrice);
            
        }
        return profit;
    }
}