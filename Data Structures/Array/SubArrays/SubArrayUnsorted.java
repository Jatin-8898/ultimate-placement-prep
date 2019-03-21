import java.util.ArrayList;

class SubArrayUnsorted{
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,  15,12,18,11,13,14,6,  7,8,9,10};
		int n = a.length;
		int res = UnsortedIndex(a,n);
	}

	private static int UnsortedIndex(int a[],int n){
		int start = 0, i,p;
		//int current = a[0];
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		System.out.println(arr);
		for (i=1; i<n; i++) {

			while(a[start] < a[i]){
				//System.out.println("sorted found: "+a[start]+" < " + a[i]);
				start++;		
			}

			while(a[start]  > a[i]){
				//System.out.print("found unsorted:");
				p = start;
				start++;
				System.out.println("FOUND UNSORTED BETWEEN: "+p+" and "+ start);
			}
		}
		
		//System.out.println("NO UNSORTED INDEXES FOUND");
		return 0;
	}
}