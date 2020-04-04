import java.util.List;
import java.util.ArrayList;


class GasStation{
	/*There are N gas stations along a circular route, where the amount of gas at station i 
	is gas[i].

	You have a car with an unlimited gas tank and it costs cost[i] of gas to travel 
	from station i to its next station (i+1). You begin the journey with an empty tank at
	 one of the gas stations.

	Return the minimum starting gas station’s index if you can travel around the circuit once,
	 otherwise return -1.

	You can only travel in one direction. i to i+1, i+2, ... n-1, 0, 1, 2..
	Completing the circuit means starting at i and ending up at i again.

	Input :
      Gas :   [1, 2]
      Cost :  [2, 1]

	Output : 1 

	*/
	public static void main(String[] args) {
		List<Integer> gas = new ArrayList<Integer>();
		List<Integer> cost = new ArrayList<Integer>();
		gas.add(1);
		gas.add(2);
		cost.add(2);
		cost.add(1);
		int res = canCompleteCircuit(gas,cost);
		System.out.println("RESULT: "+res);
	}


	public static int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
	    
	    if (gas == null || gas.size()==0 || cost == null || cost.size()==0)
	        return -1;
	        
	    int start = 0;
        int end = 1%(gas.size());
        int current_petrol = gas.get(start) - cost.get(start);
         
        // If current amount of petrol in truck becomes less than 0, then
        // remove the starting petrol pump from tour
        while(end != start || current_petrol < 0)
        {
             
            // If current amount of petrol in truck becomes less than 0, then
            // remove the starting petrol pump from tour
            while(current_petrol < 0 && start != end)
            {
                // Remove starting petrol pump. Change start
                current_petrol -= gas.get(start) - cost.get(start);
                start = (start + 1) %(cost.size());
                 
                // If 0 is being considered as start again, then there is no
                // possible solution
                if(start == 0)
                    return -1;
            }
            // Add a petrol pump to current tour
            current_petrol += gas.get(end) - cost.get(end);
             
            end = (end + 1)%(cost.size());
        }
         
        // Return starting point
        return start;
	}
}



/*
This Uses sliding window technique to solve this problem.
TC: O(n);
SC: O(1)*/