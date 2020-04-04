import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MostFrequentIntegerInAnArray {

    public static void main(String[] args) {
        int[] items = new int[]{2 , 1, 43, 1, 6, 73, 5, 4, 65 ,1 ,3 ,6 ,1 ,1 };
        System.out.println("Most common item Count is = "+getMostFrequentInt(items));
    }

    //Time Complexity = O(N)
    //Space Complexity = O(N)
    public static int getMostFrequentInt(int[] items){
        Map<Integer, Integer> itemsMap = new HashMap<Integer, Integer>(items.length);
        for(int item : items){
            if(!itemsMap.containsKey(item))
                itemsMap.put(item, 1);
            else
                itemsMap.put(item, itemsMap.get(item)+1);
        }

        System.out.println(itemsMap);
        int maxCount = Integer.MIN_VALUE;
        int ans;

         Set<Map.Entry<Integer,Integer>> set = itemsMap.entrySet();

        for( Map.Entry<Integer, Integer> it: set){
            
            if(it.getValue() > maxCount)
                maxCount = it.getValue();
                ans = it.getKey();
                System.out.print (it.getValue() + " ");
                System.out.println("" +ans + " ");
            }
            

        return maxCount;
    }
}