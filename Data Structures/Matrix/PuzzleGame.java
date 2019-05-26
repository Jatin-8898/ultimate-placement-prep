import java.util.*;
class PuzzleGame{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NO OF TEST CASES:");
		int n = s.nextInt();
		int row = 3;
		int col = 3;
		int first[][] = new int[row][col];
		int second[][] = new int[row][col];
		int i,j;

		for ( i=0; i<n; i++) {


			for( i=0; i<row; i++)
			for( j=0; j<col; j++)
				first[i][j] = s.nextInt();

			for( i=0; i<row; i++)
			for( j=0; j<col; j++)
				second[i][j] = s.nextInt();
		}

		System.out.println("ENTERED MATRIX IS: ");
		for( i=0;i<row;i++){
			for( j=0;j<col;j++)
				System.out.print(first[i][j] + "\t");
			System.out.print("\n");
		
		}
	}

}