import java.util.HashMap;

class TwoSum{	 //all pairs in the array that sum up to S
    
    /*It turns out we can do it in one-pass. While we iterate and inserting elements
	 into the table, we also look back to check if current element's complement
	 already exists in the table. 
	If it exists, we have found a solution and return immediately.*/
	public static void main(String[] args) {
		int[] arr = {2,3,5,1,4,8};
		int sum = 8;

		TwoSum obj = new TwoSum();
		int found[] = obj.twoSum(arr,sum);
		for(int i : found)
			System.out.print (i+" ");
	}

	public int[] twoSum(int[] arr, int sum){
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i=0; i<arr.length; i++) {
			
			int complement = sum - arr[i];

			if(map.containsKey(complement))
				return new int[]{map.get(complement),i};

			map.put(arr[i],i);	
		}
		throw new IllegalArgumentException("NOT FOUND");
    }
    
	/*Time complexity : O(n). We traverse the list containing nn elements only once.
	 Each look up in the table costs only O(1) time.

	Space complexity : O(n). The extra space required depends on the number of items
	 stored in the hash table, which stores at most nn elements.*/
	}
