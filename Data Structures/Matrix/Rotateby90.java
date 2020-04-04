class Rotateby90{
	/*U r given a square matrix eg 3X3 
		1 2 3
		4 5 6
		7 8 9

	your task is to rotate it by 90 degrress
		7 4 1 
		8 5 2 
		9 6 3
	*/

	public static void main(String[] args) {
		 int a1[][] = {  {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}  };
        // rotate(a1, 3) should return:
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]
        int n = 3;
        int[][] res = rotateArray(a1,n);
        for ( int i= 0 ; i < n ; i++ ){
            for (int j = 0 ; j < n; j++)
               System.out.print(res[i][j] + "\t");
 
            System.out.print("\n");
	    }


        /*int a2[][] = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16}};*/
        // rotate(a2, 4) should return:
        // [[13, 9, 5, 1],
        //  [14, 10, 6, 2],
        //  [15, 11, 7, 3],
        //  [16, 12, 8, 4]]
	}

	private static int[][] rotateArray(int[][] a, int n){
		
		//Create a new Array
		int[][] rotated = new int[n][n];

		for(int i=0; i<n; i++){		//rows
			for (int j=0; j<n; j++) {	//cols
				
				rotated[j][ n-1-i ] = a[i][j];
			}
		}

		/*The whole idea is to find the points refer video in stuffs
			The col will become the new row  ie [j]
			and to find the new col we 
			need to decrement by 1 and remove the row count from it ie i
			so it becomes [n-1-i] 
	
		*/


		return rotated;
	}
		
}