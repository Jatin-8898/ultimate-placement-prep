import java.util.HashMap;
class SubArrayWithNegSum{
	
	/*Find subarray with given sum | Set 2 (Handles Negative Numbers)
	Given an unsorted array of integers, find a subarray which adds to a given number. 
	If there are more than one subarrays with sum as the given number, print any of them.*/
	
	/*An efficient way is to use a HASHMAP. The idea is to maintain sum of elements encountered 
	so far in a variable (say curr_sum). Let the given number is sum. Now for each element, 
	we check if curr_sum – sum exists in the map or not. If we found it in the map that means, 
	we have a subarray present with given sum, else we insert curr_sum into the map and proceed 
	to next element. If all elements of the array are processed and 
	we didn’t find any subarray with given sum, then subarray doesn’t exists.*/

	public static void main(String[] args) {
		int a[] = {10, 2, -2, -20, 10};
		int n = a.length;
		int sum = -10;
		SubArrayWithNegSum(a,n,sum);

	}

	private static void SubArrayWithNegSum(int arr[],int n,int sum){
		//Create a HashMap
		HashMap<Integer, Integer> map = new HashMap<>();
		int current_sum = 0;
		int start = 0; 
        int end = -1; 
  
        for (int i = 0; i < n; i++) { 
            current_sum = current_sum + arr[i]; 

            //check whether current_sum sum=0, if 0 it means sub array is starting from index 0,so stop 
            if (current_sum - sum == 0) { 
                start = 0; 
                end = i; 
                break; 
            }

            //if map already has the value, means we already  have subarray with the sum - so stop 
            if (map.containsKey(current_sum - sum)) { 
                start = map.get(current_sum - sum) + 1; 
                end = i; 
                break; 
            } 
            

            map.put(current_sum, i); 		//if value is not present then add to hashmap 
  
        } 


        
        if (end == -1) { 		// if end is -1 : means we have reached end without the sum 
            System.out.println("No subarray with given sum exists"); 
        } else { 
            System.out.println("Sum found between indexes " + start + " to " + end); 
        } 

		
	}
}



