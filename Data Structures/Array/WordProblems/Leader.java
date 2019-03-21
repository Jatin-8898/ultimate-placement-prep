import java.util.Scanner;

class Leader{
	/*Write a program to print all the LEADERS in the array. An element is leader if it is 
	greater than all the elements to its right side. The rightmost element is always a leader. */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER NO OF TEST CASES:");
		int t = s.nextInt();

		while(t-->0){
			System.out.println("ENTER THE TOTAL NO OF ELEMENTS:");
			int n = s.nextInt();
			int[] array = new int[n];

			System.out.println("ENTER THE ELEMENTS:");			
			for(int j = 0; j<n; j++){
				array[j] = s.nextInt();
			}

			findLeader(array,n);
			System.out.println();

			/*for(int k : array){
				System.out.println(k);
			}*/
		}
	}

	private static void findLeader(int[] arr,int n){
		for (int i=0; i<n; i++) {

			int j;
			for (j=i+1; j<n; j++) {

				//If the element is lesss or equal BREAK
				if(arr[i] <= arr[j])
					break;

			}
			//We then traverse till the end of the array
			//if the j pointer reaches the end ie n means its greater than 
			//all the elements in the right side
			if(j == n){
				System.out.print("LEADER ELEMENTS ARE: "+arr[i]+ " ");
			}
		}
	}
}