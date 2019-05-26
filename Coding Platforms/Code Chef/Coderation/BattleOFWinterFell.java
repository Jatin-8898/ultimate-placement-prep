import java.util.*;
import java.lang.*;
import java.io.*;

class BattleOFWinterFell{

	public static void main (String[] args) throws java.lang.Exception{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		
		while(t-- > 0){
		    int row = s.nextInt();
		    int col = s.nextInt();
		    int newRow = s.nextInt();
		    int newCol = s.nextInt();
		    
		    int res = (row - newRow + 1) * (col - newCol + 1);
		    System.out.println(res);
        }
        s.close();
	}
}
