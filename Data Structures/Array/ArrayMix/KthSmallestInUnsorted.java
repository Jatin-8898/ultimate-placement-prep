import java.util.*;
import java.io.*;

class KthSmallestInUnsorted {
    /*
     * IP: 3        0 1 0  1 1 1 1  0 0 1
     *     4        9 3 2 7 2 5 3 8
     * 
     * OP: NULL 
     *     7
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        
        String[] strs = s.nextLine().split(" ");
        int[] a = new int[strs.length];
        
        for (int i = 0; i < strs.length; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }
        KthSmallestElement(a, n);
        //getSmallest(a, n);
        s.close();

    }
    private static void KthSmallestElement(int[] a, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : a){
            if(!list.contains(i))
                list.add(i);
        }
        Collections.sort(list);
        if(k > list.size()){
            System.out.println("null");
            return;
        }
        System.out.println(list.get(k-1));
    }


    
    //comparator to create max heap
    static class MaxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return b.compareTo(a);
        }
    }

    public static void getSmallest(int[] input, int k) {
        MaxHeapComparator maxHeapComparator = new MaxHeapComparator();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, maxHeapComparator);

        //Loop Invariant: If heap size is k, compare top element with next 
        //element in the array. If element is smaller than the top element, 
        //remove the top integer and insert element from array. 
        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() < k) {
                maxHeap.add(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                maxHeap.remove();
                maxHeap.add(input[i]);
            }
        }

        //print values 
        for (int i : maxHeap) {
            System.out.print(i + " ");
        }
    } 
}