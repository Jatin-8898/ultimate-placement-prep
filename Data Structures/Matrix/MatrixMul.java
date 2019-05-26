import java.util.*;
class MatrixMul{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NO OF ROWS N COLS OF FIRST MATRIX:");
		int row1 = s.nextInt();
		int col1 = s.nextInt();

		int first[][] = new int[row1][col1];
		int i,j,k,sum=0;

		System.out.println("ENTER THE ELEMENTS OF FIRST MATRIX:");
		for( i=0; i<row1; i++)
			for( j=0; j<col1; j++)
				first[i][j] = s.nextInt();




		System.out.println("ENTER THE NO OF ROWS N COLS OF SECOND MATRIX:");
		int row2 = s.nextInt();
		int col2 = s.nextInt();			

		int second[][] = new int[row2][col2];

		System.out.println("ENTER THE ELEMENTS OF SECOND MATRIX:");
		for( i=0; i<row2; i++)
			for( j=0; j<col2; j++)
				second[i][j] = s.nextInt();




		if(row1 != row2)
			System.out.println("Matrices with entered orders can't be multiplied with each other");
		else{

			int multiply[][] = new int[row1][col2];

			for (i=0; i<row1 ; i++ ){
	            
	            for (j=0; j<col2 ; j++ ){   
	               
	               for (k=0; k<row2 ; k++ ){

	                  sum  +=  first[i][k] * second[k][j];
	               }	 
	               
	               multiply[i][j] = sum;
	               sum = 0;
	            }
	         }


	        System.out.println("PRODUCT OF THE MATRIX: ");
	        for ( i = 0 ; i < row1 ; i++ ){
	            for ( j = 0 ; j < col2 ; j++ )
	               System.out.print(multiply[i][j] + "\t");
	 
	            System.out.print("\n");
	         }




		}//end of else	
	
	}

}