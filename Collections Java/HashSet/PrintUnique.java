import java.util.HashSet;

class PrintUnique{
	
	public static void main(String[] args) {
		int arr[]  = {10, 5, 3, 4, 3, 5, 6};
		printDistinct(arr);
	}
	
	static void printDistinct(int arr[]){
		int n = arr.length;
		HashSet<Integer> set = new HashSet<Integer>();		

		for (int i=0; i<n; i++) {
			
			if(!set.contains(arr[i])){
				set.add(arr[i]);
				System.out.print(arr[i] + " ");
			}
		}
	}
}