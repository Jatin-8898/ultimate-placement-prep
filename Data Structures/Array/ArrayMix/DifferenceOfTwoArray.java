class DifferenceOfTwoArray{
	/*
	NOT COMPLETE CODE

	*/
	public static void main(String[] args) {
		int[] a1 = {5,6,7,8,9};
		int[] a2 = {10,12,3,4,5,6,7,7,8,8,9,9};
		/*int[] b = {5,6,7,8,9};
		int[] g = {5,5,7,7,7};
		int n = b.length;
		int i=0,j=0;

		int[] newArray = new int[n];

		while(i < n && j< n){
			int diff = g[j] - b[i];
			int res =+ Math.abs(diff);
			newArray[i] = res;
			System.out.println(diff + "          "+ res);
			i++;
			j++;
		}

		int finalans = 0;
		for(int k : newArray){
			 finalans = finalans + k;
		}
		System.out.println("THE TOTAL DIFFERENCE BETWEEN THE TWO ARRAY IS: "+finalans);

		*/
		int n = a1.length;
		int[] res = new int[n];
		
		for (int i=0; i<n; i++) {
			int e = a1[i];
			 res = checkForClosest(a1,a2,e);
			

		}
		for(int j:res)
				System.out.println(j);

	}

	private static int[] checkForClosest(int a1[], int a2[], int e){
		int n = a1.length;
		int diff = Integer.MAX_VALUE;
		int closest  = -1;
		int[] temp = new int[n*n];

						//5,6,7,8,9				//10,12,3,4,5,6,7,7,8,8,9,9
		int i = 0;
		for (int j=0; j<a2.length; j++) {

			if(e < a2[j] && a2[j] - e < diff){
				diff = a2[j] - e;
				closest = j;
				System.out.println("HEI "+closest);
				
			}
			temp[i] = closest;
				i++;
		}
		

			
	
		return temp;

	}
}