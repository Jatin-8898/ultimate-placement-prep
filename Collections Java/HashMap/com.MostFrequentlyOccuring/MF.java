import java.util.HashMap;

public class MF {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 3.
        int[] array1 = {1, 3, 1, 3, 2, 1, 2, 2 ,3 ,3 ,3 ,3 ,3};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {0};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        MF obj = new MF();
        int ans = 0;
        ans = obj.mostFreqent(array1);
        System.out.println(ans);
        ans = obj.mostFreqent(array2);
        System.out.println(ans);
        ans = obj.mostFreqent(array3);
        System.out.println(ans);
        ans = obj.mostFreqent(array4);
        System.out.println(ans);
        ans = obj.mostFreqent(array5);
        System.out.println(ans);
    }

    // Implement your solution below.
    public  Integer mostFreqent(int[] givenArray) {

        Integer maxCount = -1, maxItem = null;
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (int i : givenArray) {
            
            if (count.containsKey(i)) {             //When the new value is found 
                Integer newVal = count.get(i) + 1;     //Then increase the count by 1
                count.put(i, newVal);
            
            } else {
                count.put(i, 1);                //Else put the count as 1
            }
            
            if (count.get(i) > maxCount) {  //if count is greater than -1
                maxCount = count.get(i);    //Get the count
                maxItem = i;                //Store it in MaxItem
            }

        }
        return maxItem;
    }
}
