import java.util.HashMap;

class CountPairsWithGivenSum{	 //all pairs in the array that sum up to S
    
	public static void main(String[] args) {
        int[] arr = {3,5,4,4};
        int sum = 8;
		//int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		//int sum = 11;
		

		int found = countPairsWithSum(arr,sum);
		System.out.println(found);
	}

    static int countPairsWithSum(int[] arr, int sum) 
    { 
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int i=0; i<arr.length; i++){        // Store counts of all elements in map
            
            if(!map.containsKey(arr[i]))        // initializing value to 0, if key not found 
                map.put(arr[i],0); 
                
            map.put(arr[i], map.get(arr[i])+1); 
        } 

        int twice_count = 0; 

        //iterate through each element and increment the count(Notice that every pair iscounted twice
        for (int i=0; i<arr.length; i++) 
        { 
            if(map.get(sum - arr[i]) != null) {
                
                twice_count += map.get(sum - arr[i]); 
                //System.out.println("Map get "+map.get(sum - arr[i]) + " count "+ twice_count);
            }
            
            // if (arr[i], arr[i]) pair satisfies the condition,then we need to ensure that the count is decreased by one such that the (arr[i], arr[i]) pair is not considered 
            if (sum - arr[i] == arr[i]){         //When same element eg 4 4 two times 
                twice_count--; 
                //System.out.println(twice_count + " Decr twice_count");
            }
        } 

        return twice_count/2;   // return the half of twice_count 
    } 
        
	/*Time complexity : O(n). We traverse the list containing nn elements only once.
	 Each look up in the table costs only O(1) time.

	Space complexity : O(n) The extra space required depends on the number of items
	 stored in the hash table, which stores at most nn elements.*/
	}
