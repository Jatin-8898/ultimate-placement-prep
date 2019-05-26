import java.util.*;
class Kingdom{


	/*The task is to take the Matrix of any rows and col and Calculate Capital
		1. Represents Land
		0. Represents Water
	All the Adjacent land can be considered as one Large Area.
	SO the task is to find the largest Area which can be declared as Capital
	Return the number of largest area
	*/


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NO OF ROWS N COLS: ");
		int rows = s.nextInt();
		int cols = s.nextInt();
		int i,j;

		int kingdom[][] = new int[rows][cols];
		System.out.println("ENTER THE ELEMENTS OF MATRIX: ");
		for( i=0; i<rows; i++)
			for( j=0; j<cols; j++)
				kingdom[i][j] = s.nextInt();



		System.out.println("ENTERED MATRIX IS: ");
		for( i=0;i<rows;i++){
			for( j=0;j<cols;j++)
				System.out.print(kingdom[i][j] + "\t");
			System.out.print("\n");
		
		}


		int res = getCapital(kingdom,rows,cols);
		System.out.println("LARGEST CAPITAL AREA : "+ res);
	}


	private static int getCapital(int kingdom[][],int rows, int cols){
		int i,j,count = 0;

		for (i=0; i<rows; i++) {
			for (j=0; j<cols; j++) {

				if(kingdom[i][j] == 1){
					if((i==0 || kingdom[i-1][j]==1)   &&   (j==0 || kingdom[i][j-1]==1))
						count++;
				}
			}
		}

		return count;
		

	}



}