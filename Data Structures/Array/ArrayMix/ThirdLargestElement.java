class ThirdLargestElement{
	public static void main(String[] args) {
		int[] arr = {6,14,8,9,16,2,20};
		System.out.println(findThirdLargest(arr));
	}
	private static int findThirdLargest(int arr[]){

		int first  = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i=1; i<arr.length; i++) {
			
			if(arr[i] > first){	//if we found element greater then all get updated seqentially

				third  = second;
				second = first;
				first  = arr[i];


			}else if(arr[i] > second){		//if greater than second so update third and second as max
				third = second ; 
				second = arr[i];

			
			}else if(arr[i] > third){		//if greater than third just updated third
				third = arr[i];
			}

		}
		return third;

	}
}