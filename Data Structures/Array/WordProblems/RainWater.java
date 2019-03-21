import java.util.*;
import java.lang.*;
class RainWater{
	/*Given n non-negative integers in array representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining*/
	/*An element of array can store water if there are higher bars on left and right. We can find amount of water to be stored in every element by finding the heights of bars on left and right sides. The idea is to compute amount of water that can be stored in every element of array. For example, consider the array {3, 0, 0, 2, 0, 4}, we can store two units of water at indexes 1 and 2, and one unit of water at index 2.

	A Simple Solution is to traverse every array element and find the highest bars on left and right sides. Take the smaller of two heights. The difference between smaller height and height of current element is the amount of water that can be stored in this array element. Time complexity of this solution is O(n2).

	An Efficient Solution is to prre-compute highest bar on left and right of every bar in O(n) time. Then use these pre-computed values to find the amount of water in every array element. Below is C++ implementation of this solution*/

	/*Input: arr[]   = {2, 0, 2}
	Output: 2
	Structure is like below
	| |
	|_|
	We can trap 2 units of water in the middle gap.

	Input: arr[]   = {3, 0, 0, 2, 0, 4}
	Output: 10
	Structure is like below
	     |
	|    |
	|  | |
	|__|_| 
	We can trap "3*2 units" of water between 3 an 2,
	"1 unit" on top of bar 2 and "3 units" between 2 
	and 4.  See below diagram also.

	Input: arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
	Output: 6
	       | 
	   |   || |
	_|_||_||||||
	Trap "1 unit" between first 1 and 2, "4 units" between
	first 2 and 3 and "1 unit" between second last 1 and last 2 */

	public static void main(String[] args) {
	 	int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;		
        System.out.println("Maximum water that "+ "can be accumulated is "+ getMaximumRainWaterBetweenTower(arr, n));
	}

	private static int getMaximumRainWaterBetweenTower(int towerHeight[],int n){
		int maxSeenSoFar = 0;

		//Array for seen in right 
		int[] maxSeenRight = new int[n];
		int maxSeenLeft = 0;

		int rainWater = 0 ;

		for (int i=n-1;  i>=0; i--) {

			//if the arr[i] is greater than we have seenSOfar then 
			//Initailise seenSoFar with the towerHeight n put in seenRight[]
			if(towerHeight[i]  > maxSeenSoFar){
				maxSeenSoFar = towerHeight[i];
				maxSeenRight[i] = maxSeenSoFar; 
			
			}else{	//if not greater put seensofar in seenRight[]
				maxSeenRight[i] = maxSeenSoFar;
			}

		}

		for (int i=0; i<n; i++) {
			//Take the min from (left,right - towerheight) and then take
			//Max from the (above,0)
			rainWater += Math.max(Math.min(maxSeenLeft, maxSeenRight[i]) - towerHeight[i], 0);

			//if towerheight > leftSeen then store it in Seenleft 
			if(towerHeight[i] > maxSeenLeft)
				maxSeenLeft = towerHeight[i];
		}

		return rainWater;
	}
}

/*Space optimized solution

static int findWater(int arr[], int n)
    {
        // initialize output
        int result = 0;
          
        // maximum element on left and right
        int left_max = 0, right_max = 0;
          
        // indices to traverse the array
        int lo = 0, hi = n-1;
          
        while(lo <= hi) 
        {
            if(arr[lo] < arr[hi])
            {
                if(arr[lo] > left_max)
     
                // update max in left
                left_max = arr[lo];
                else
     
                // water on curr element = 
                // max - curr
                result += left_max - arr[lo];
                lo++;
            }
            else
            {
                if(arr[hi] > right_max)
                 
                // update right maximum
                right_max = arr[hi];
                 
                else
                result += right_max - arr[hi];
                hi--;
            }
        }
          
        return result;
    }*/