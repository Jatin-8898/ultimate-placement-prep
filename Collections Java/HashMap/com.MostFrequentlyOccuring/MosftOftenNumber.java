public class MosftOftenNumber {

    // for O(N) + map O(1) = O(N) 
    public static int mostOftenNumber(int[] a)
    {
        Map m = new HashMap<Integer,Integer>();
        int max = 0;
        int element = 0;

        for(int i=0; i<a.length; i++){
            //initializing value for the map the value will have the counter of each element
            //first time one new number its found will be initialize with zero 
            if (m.get(a[i]) == null)
                m.put(a[i],0);

            //save each value from the array and increment the count each time its found
            m.put(a[i] , (int)m.get(a[i]) + 1);

            //check the value from each element and comparing with max
            if ((int)m.get(a[i])>max){
                max = (int) m.get(a[i]);
                element = a[i];
            }

        }
        return element;
    }

    public static void main(String args[]) {
//      int[] array = {1,1,2,1,1};
//      int[] array = {2,2,1,2,2};
        int[] array = {2,2,1,3,3,5,5,6,6,7,7,9,9,10,10,10,10,11,12,13,14,15,15,1,15,15,1,15,15};
        System.out.println(mostOftenNumber(array));
    }


}