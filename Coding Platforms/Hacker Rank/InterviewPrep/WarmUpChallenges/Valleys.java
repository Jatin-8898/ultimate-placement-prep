
/*
	Print a single integer that denotes the number of valleys Gary walked through during his hike.

Sample Input

8
UDDDUDUU
Sample Output

1
Explanation

If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
He enters and leaves one valley

*/
import java.util.*;
class Valleys{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        String s = scanner.nextLine();
        int result = countingValleys(n, s);
	}

	static int countingValleys(int n, String s) {
        
        int level = 0;
        int valleys = 0;
        
        for(char c: s.toCharArray()){
            if(c == 'U')		//if goes up increment the level
                level++;
            
            if(c == 'D')		//if goes down decrment the level
                level--;
            
            
            //if its sea level
            if(level==0 && c=='U')		//wen he is at sea level by coming up ie He has visited 1 valley
                valleys++;
        }
        
        return valleys;

    }
}