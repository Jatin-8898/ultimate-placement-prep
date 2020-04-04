import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FradulentActivity {

    
    static int activityNotifications(int[] expenditure, int d) {

        int count = 0;
        // create freq array as exp <= 200 always
        //maintain a queue to find ontgoing and incoming expget median from freq array
        int freq[] = new int[201];
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0; i<expenditure.length; i++)
        {
            while(i<d)
            {
                q.add(expenditure[i]);
                freq[expenditure[i]] = freq[expenditure[i]]+1;
                i++;
            }

            float median = getMedian(freq,d);
            if(expenditure[i] >= 2*median)
                count++;

            int elem = q.remove();              // removing outing going element freq
            freq[elem] = freq[elem] - 1;

            q.add(expenditure[i]);      // adding incoming element to freq
            freq[expenditure[i]] = freq[expenditure[i]]+1;
        }

        return count;
    }

    private static float getMedian(int[] freq,int d)
    {
        if(d % 2 == 1)
        {
            int center = 0;
            for(int i=0;i<freq.length;i++)
            {
                center = center + freq[i];
                if(center > d/2)
                    return i;
            }
        }else{
            int count = 0;
            int first = -1;
            int second = -1;
            for(int i=0; i<freq.length; i++)
            {
                count = count + freq[i];
                if(count == d/2)
                    first = i;
                else if(count > d/2)
                {
                    if(first < 0 ) 
                        first = i;
                    second = i;
                    return ((float)first + (float)second)/2; 
                }
            }
        }
        return 0f;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] expenditure = new int[n];
        String[] expenditureItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }
        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        scanner.close();
    }
}
/* 
// Complete the activityNotifications function below.
    static int activityNotifications(int[] a, int d) {
        int count = 0;
        Integer[] nums = new Integer[d];
        int j = d;

        int k = 0;
        while(k <  d){
            nums[k] = a[k];
            k++;
        }

        for(int i=0; i < (a.length - d); i++){
            
            for(int z: nums) System.out.print(z+" ");
            System.out.println();
            double median = findMedian(nums, nums.length);
    
            if( (double)a[j] >= (2.0 * median)) 
                count++;
        
            List<Integer> l = new LinkedList<Integer>(Arrays.asList(nums));
            l.remove(0);
            l.add(new Integer(a[j]));
            System.out.println(l+ " list");
            nums = l.toArray(new Integer[l.size()]);
            j++;
        }
        return count;

    }
    public static double findMedian(Integer a[], int n) 
    { 
        Integer b[] = a;
        Arrays.sort(b); 
        if (n % 2 != 0) 
            return (double)b[n / 2]; 
      
        return (double)(b[(n - 1) / 2] + b[n / 2]) / 2.0; 
    } 
 */