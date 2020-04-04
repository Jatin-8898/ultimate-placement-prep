// Java program to count number of steps to reach a point 
import java.io.*; 
class ReachDestination 
{ 
    /* 
    From any vertex we can go to :
    (current source + last step +1) and
    (current source – last step -1)
 */
	
	// source -> source vertex 
	// step -> value of last step taken 
	// dest -> destination vertex 
	static int destination(int source, int step, int dest) 
	{ 
		if (Math.abs(source) > (dest))      // base cases 
			return Integer.MAX_VALUE; 
	
		if (source == dest) 
			return step; 

		// at each point we can go either way 
		int pos = destination(source + step + 1,    step + 1, dest);     // if we go on positive side 
        
		int neg = destination(source - step - 1,     step + 1, dest); // if we go on negative side 
        
		return Math.min(pos, neg);      // minimum of both cases 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		int dest = 3; 
        System.out.println("No. of steps required"+ " to reach " + dest + " is " 
                                        + destination(0, 0, dest)); 
	} 
} 
