class MaxDifferenceTrickySolution{
	public static void main(String[] args) {
		
		int[] a = {80, 2, 6, 3, 100} ;
		getMaxDiff(a);
	}
	private static void getMaxDiff(int[] a){

		int diff = a[1] - a[0];     //eg 78
		int currentSum = diff;		//78
		int maxSum = currentSum;	//78


		for (int i=1; i<a.length-1; i++) {
			
			diff = a[i+1] - a[i];		//Calculate diff 6-2= 4  //6-3=3  //100-3=97

			if(currentSum > 0){			//78 + 4 = 82	// 82+3 = 85
				System.out.println("Cu: "+ currentSum);
				currentSum = currentSum + diff;
			}	
			else{
				System.out.println("ELSE");
				currentSum = diff;
			}


			if(currentSum >  maxSum)	//82    //85
				maxSum = currentSum;
		}
		System.out.println("Max Diff is: "+ maxSum);
	}
}