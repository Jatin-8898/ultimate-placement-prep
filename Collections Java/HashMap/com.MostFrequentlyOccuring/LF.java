import java.util.HashMap;
import java.util.Collections;
public class LF {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1,1,2,2,2,2,3};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        LF obj = new LF();
        int ans = obj.leastFreqent(array1);
        System.out.println(ans);
    }

    // Implement your solution below.
    public static Integer leastFreqent(int[] givenArray) {
        Integer minCount = -1, maxItem = null , min=0;
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (int i : givenArray) {
            
            if (count.containsKey(i)) {             //When the value is found 
                Integer newVal = count.get(i) + 1;     //Then increase the count by 1
                count.put(i, newVal);
            } else {
                count.put(i, 1);                //Else put the count as 1
            }
            
            if (count.get(i) > minCount) {  //if count is greater than -1
                minCount = count.get(i);    //Get the count
                maxItem = i;                //Store it in MaxItem
            }
            
        }
        min = Collections.min(count.values());
        return min;
    }
}
