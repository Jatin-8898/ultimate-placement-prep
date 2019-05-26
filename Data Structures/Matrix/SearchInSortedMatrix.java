class SearchInSortedMatrix{
	public static void main(String[] args) {
		
		int mat[][] = { {10, 20, 30, 40}, 
                        {15, 25, 35, 45}, 
                        {27, 29, 37, 48}, 
                        {32, 33, 39, 50} }; 
              
        search(mat, 4, 29); 
         
	}

	private static void search(int[][] mat, int n, int find){
		int i=0, j = n-1;				/*We kept j at last eleement of 1st row ie 40*/
		
		while(i<n && j>=0){				/*While i is within the matrix and j reaches the 00 element*/

			if(mat[i][j] == find){
				System.out.println("FOUND AT: "+ i + " "+ j);
				return;
			}
			else if(mat[i][j] > find){
				j--;						/*MOVE LEFT eg find 20 */
			
			}else{							/*if its greater move down ie i++*/
				i++;
			}
		}
		System.out.println("NOT FOUND: ");
	}

}