import java.util.*;

class MatrixSpiral{

	/*The task is to traverse in right ,down left, up ie clockwise direction
	Eg: 1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
    O:P 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
    */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NO OF ROWS N COLS: ");
		int rows = s.nextInt();
		int cols = s.nextInt();
		int i,j;

		int mat[][] = new int[rows][cols];
		System.out.println("ENTER THE ELEMENTS OF MATRIX: ");
		for( i=0; i<rows; i++)
			for( j=0; j<cols; j++)
				mat[i][j] = s.nextInt();


		System.out.println("ENTERED MATRIX IS: ");
		for( i=0;i<rows;i++){
			for( j=0;j<cols;j++)
				System.out.print(mat[i][j] + "\t");
			System.out.print("\n");
		
		}

		System.out.println("MATRIX IN SPIRAL FORM IS:\n");
		MakeSpiral(rows,cols,mat);

	}
	private static void MakeSpiral(int endRow,int endCol,int mat[][]){
		/*
			endRows: ending row index
			endCols: ending col index
			startRows : starting row index
			startCols : starting col index
			i : iterator
		*/
		int i, startRow = 0 , startCol = 0;	
		while(startRow < endRow && startCol < endCol){

			//Print the First Row ie left to right
			for(i=startCol; i<endCol; ++i){
				System.out.print(mat[startRow][i]+" ");
			}
			startRow++;


			//Print the Last col ie Right to bottom
			for (i=startRow; i<endRow ; ++i) {
				System.out.print(mat[i][endCol-1]+" ");
			}
			endCol--;


			//Print the last row ie right to left
			if(startRow < endRow){
				for (i=endCol-1; i>=1; --i) {
					System.out.print(mat[endRow-1][i]+" ");
				}
				endRow--;
			}


			//Print the First col ie left to top
			if(startCol < endCol){
				for (i=endRow-1; i>=startRow; --i) {
					System.out.print(mat[i][startCol]+" ");
				}
				startCol++;
			}




		}


	}
}