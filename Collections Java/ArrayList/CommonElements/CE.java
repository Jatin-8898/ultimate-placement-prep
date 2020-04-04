import java.util.*;

public class CE{
	public static void main(String[] args){
		Integer[] result; 
		int[] array1 = {1, 3, 1, 3, 2, 1, 2, 22 ,3 ,32 ,3 ,38 ,3};
		int[] array2 = {1, 2, 6, 3, 10, 11, 22, 42 ,13 ,32 ,31 ,39 ,38};

		int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
	
		CE obj = new CE();
		result = obj.commonElements(array1B, array2B);
		System.out.println(Arrays.toString(result));
	}

	//NOTE: Remember to return an Integer array, not an int array.
	public  Integer[] commonElements(int[] a, int[] b){
		int p1 = 0;
		int p2 = 0;	//Declare the 2 pointers

		ArrayList<Integer> result = new ArrayList<>();

		while(p1 < a.length && p2 < b.length){

			if(a[p1] == b[p2]){
				result.add(a[p1]);
				p1++;
				p2++;			
				
			}else if(a[p1]  > b[p2]){
				p2++;

			}else{
				p1++;
			}
		}
		// Convert the result to a regular array.
        Integer[] resultInArray = new Integer[result.size()];
        return result.toArray(resultInArray);


	}
}//end of class