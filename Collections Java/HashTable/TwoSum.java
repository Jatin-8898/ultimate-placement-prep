import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;


class TwoSum{	 //all pairs in the array that sum up to S

	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 8};
		int totalSum = 6;

		TwoSum obj = new TwoSum();
		obj.twoSum(arr,totalSum);
	}

	public void twoSum(int[] arr, int totalSum){
		ArrayList<Integer> numbers = new ArrayList<>();
		Hashtable<Integer,Integer> pair = new Hashtable<>();		

		for(int i=0;i<arr.length;i++){
			numbers.add(arr[i]);	
		}
		
		for(int i=0;  i < arr.length;  i++){
			int sumMinusElement =  totalSum - arr[i];	//eg 6-2 = 4 but we want total 6

			if(numbers.contains(sumMinusElement)){	//We found pair
				pair.put(arr[i], sumMinusElement);

				System.out.println("PUTTED IN HASHTABLE");
			}else{
				System.out.println("ELEMENT NOT FOUND");
			}
		}

		Enumeration<Integer> e = pair.elements();
			while(e.hasMoreElements()) {
	        	 System.out.print(e.nextElement() + ", ");
			}

		/*for(Map.Entry<Integer,Integer> m : pair.entrySet()){  
   			System.out.println(m.getKey()+" "+m.getValue());  
  		}  */	



	}
}