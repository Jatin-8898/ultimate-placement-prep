import java.util.Scanner;
import java.util.*;
class MinPlatform{
	/*Given arrival and departure times of all trains that reach a railway station, find the minimum number of platforms required for the railway station so that no train waits.
	We are given two arrays which represent arrival and departure times of trains that stop*/
	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
    	int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
    	int n = arr.length;
    	System.out.println("Minimum Number of Platforms Required = "+findPlatform(arr, dep, n));

	}
	private static int findPlatform(int arr[],int dep[],int n){
		//Sort the array in the ascending order
		Arrays.sort(arr);
		Arrays.sort(dep);


		//Platform needed minimum 1 
		int plat_needed = 1 ;
		int result = 1;
		int i=1, j=0;

		//Similar to Merge we will merge and increase Platform need if arr[i]<= dep[j]
		while(i<n  &&  j<n){

			if(arr[i]   <  dep[j]){
				plat_needed++;
				i++;

				//Update the result ie Store the max Element
				if(plat_needed > result)
					result = plat_needed;
			
			}else{		//arr[i]   >  dep[j]
				plat_needed--;
				j++;
			}
		}

		return result;
	}
}