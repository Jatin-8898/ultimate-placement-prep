import java.util.*;
/*Mojtaba is a police commander. A thief wants to escape. Mojtaba is standing at 0, The thief is standing at X on the x-axis. The thief starts to run with speed  to right, and Mojtaba starts to cache him with speed . When he catches the thief, he comes back to 0 with speed , how much time it takes from Mojtaba to cache the thief and back to the police station?

Your answer will be considered correct if the absolute difference between the jury solution and your solution is 
Input Format

The first line contains three space separated integers  -- 
	1.the position of the thief, 
	2.speed of Mojtaba and 
	3.speed of thief.

Output Format

Print how much time it takes from Mojtaba to cache the thief and back to the police station. Your answer will be considered correct if the absolute difference between the jury solution and your solution is  If Mojtaba can never catch thief, print -1

SAMPLE INPUT 
2 2 1
SAMPLE OUTPUT 
4.000000

Explanation
Mojtaba caches the thief in  then he comes back to police station.

*/
class Police{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int count = 0;
        int source = 0;
        
        int policeLoc = 0;
        int theifLoc = s.nextInt();
        int policeSpeed = s.nextInt();
        int theifSpeed = s.nextInt();
    
    
       if (theifLoc == 0) {			///Base case
			System.out.println(0);
		}

		if(policeSpeed <= theifSpeed){		//police cant catch then
			System.out.println(-1);
		}

		double ans = (double) theifLoc / (policeSpeed - theifSpeed);

        System.out.println(ans + (thiefLoc + ans * theifSpeed) / policeSpeed);
	}
}