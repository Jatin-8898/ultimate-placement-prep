import java.util.*;
class MajorityElement{
	/*To find the Majority Element which occure n/2 times in an array
		Moore voting algorithm
	*/

	public static void main(String[] args) {
		int[] arr = {1, 3, 1, 1, 2, 1};
		printMajority(arr, arr.length);
        System.out.println("THE MAJORITY ELE: " + majorityElement(arr));

	}
	
	/* Function to print Majority Element */
    static void printMajority(int a[], int size) 
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority */
        if (isMajority(a, size, cand))
            System.out.println("Majority Element is : " + cand + " ");
        else
            System.out.println("No Majority Element");
    }


    /*Function to find the Candidate*/
	private static int findCandidate(int[] a ,int n){
		int index = 0, count=0;

		for (int i=1; i<n; i++) {	//1, 3, 1, 1, 2, 1

			if(a[index] == a[i])	//eg 1 with 3 not equl so count--; then 1 with 1 so count = 0 
				count++;
			else
				count--;

			if(count == 0 ){
				index = i;		//i is 2 so index is at 2
				count = 1;		//count becomes 1
			}
		}
		System.out.println(a[index]);		//since at index 2,  1 is der so returned 1.
		return a[index];

	}



	 /* Function to check if the candidate occurs more than n/2 times */
    static boolean isMajority(int a[], int size, int foundcandidate) 
    {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == foundcandidate)
                count++;
        }
        if (count > size / 2) 
            return true;
        else
            return false;
    }


    /*FASTEST SOLUTION  in O(N) and O(1)space*/
     static int majorityElement(int[] num) {
        int major = num[0], count = 1;
        
        for(int i=1; i<num.length; i++){    //1, 3, 1, 1, 2, 1
            
            if(count == 0){     //Wen found 0 store that elemnt
                count++;
                major = num[i];            

            }else if(major == num[i])      //if major element and arr[i] is same incr count
                count++;
            
            else              //if count is greater than zero means we found other ele so decr
                count--;
        }
        return major;
    }


    /* Using Hashmap) : This method is somewhat similar to Moore voting algorithm in terms of time complexity, but in this case there is no need of second step of Moore voting algorithm.But as usual, here space complexity becomes O(n).
    In Hashmap(key-value pair), at value,maintain a count for each element(key) and whenever count is greater than half of array length, we are just returning that key(majority element).

    Time Complexity : O(n)
    Auxiliary Space : O(n)
 */
    private static void findMajority(int[] arr)  
    { 
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
  
        for(int i = 0; i < arr.length; i++) { 
            if (map.containsKey(arr[i])) { 
                int count = map.get(arr[i]) +1; 
                if (count > arr.length /2) { 
                    System.out.println("Majority found :- " + arr[i]); 
                    return; 
                } else
                    map.put(arr[i], count); 
            } 
            else
                map.put(arr[i],1); 
            } 
            System.out.println(" No Majority element"); 
    } 
}




