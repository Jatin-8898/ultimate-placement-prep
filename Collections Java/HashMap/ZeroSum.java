import java.util.HashMap;
import java.util.Arrays;
class ZeroSum{

	/*The problem is to find the elements  which sum upto Zero in an array if it exists*/

	public static void main(String[] args) {
		int[] arr = {1, 2,-5, 1, 1, -1};
		int[] res = getZeroSum(arr);
		System.out.println("\n");	
		for (int i: res ) {
			System.out.print(i +  " ");
		}
	}


	private static int[] getZeroSum(int[] arr){
		HashMap<Integer,Integer> map = new HashMap<>();

		int sum = 0;		//Since we want the sum as 0

		for (int i=0; i<=arr.length ; i++) {
			
			Integer oldIndex = map.get(sum);	//get the Index
			System.out.println(map);			

			if(oldIndex == null && i == arr.length)		//this will work until i reaches last element
				return null;


			else if(oldIndex == null){	//first time oldIndex is null so put in MAP				
				map.put(sum, i);		//sum is 0    and   i is 0
				sum  = sum + arr[i];    //Inc the sum with the element eg 0+1  = 1
				//System.out.println(map);


			}else {                            //startindex   endIndex
				return Arrays.copyOfRange(arr,   oldIndex,     i);
				
			}

		}
		return null;
		
	}
}