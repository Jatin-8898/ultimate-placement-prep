class MineSweeper{
	
	/*We r given a bomb area eg 02 means at this pos bomb is there so we need to increment the neighbouring area by 1.
	*/
	public static void main(String[] args) {
 		
 		int[][] bombs1 = {{0, 2}, {2, 0}};
        // mineSweeper(bombs1, 3, 3) should return:
        // [[ 0,   1,  -1],
        //  [ 1,   2,   1],
        //  [-1,  1,   0]]
        int row = 3;
        int col = 3;

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        // mineSweeper(bombs2, 3, 4) should return:
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        // mineSweeper(bombs3, 5, 5) should return:
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]

        /*Print the result*/
        int[][] res = mineSweeper(bombs1, row, col);
        for ( int i= 0 ; i < row ; i++ ){
	            for (int j = 0 ; j < col; j++)
	               System.out.print(res[i][j] + "\t");
	 
	            System.out.print("\n");
	         }
	}

	private static int[][] mineSweeper(int[][] bombs, int numRows, int numCols){
		int[][] field = new int[numRows][numCols];

		/*The idea is to first mark the bomb which we recieved as -1*/
		for (int[] bomb : bombs) {

				int row = bomb[0];		//02 pos
				int col = bomb[1];		//20 pos

				field[row][col]  = -1;	//mark it -1


				/*Then take the adjacant pairs by making the area around the bomb
				If its not -1 and i<numRows n j<numCols then increment itby 1*/

				for (int i=row-1;   i<row + 2 ;   i++) {
					for (int j=col-1;  j<col+2; j++) { 
						
						if(0 <= i && i<numRows &&  0 <= j  && j<numCols && field[i][j] != -1)
							field [i][j] = field[i][j] + 1;
					}
				}
				
		}
		return field;
	}
}