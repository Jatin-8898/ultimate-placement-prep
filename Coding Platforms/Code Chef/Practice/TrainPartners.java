/*Rahul and Rashi are off to the wedding of a close relative. This time they have to travel without their guardians. Rahul got very interested in the arrangement of seats inside the train coach.

The entire coach could be viewed as an arrangement of consecutive blocks of size 8.


Berth Number   	Compartment

 1 -  8               1  
 9 - 16               2  
17 - 24               3  
... and so on
Each of these size-8 blocks are further arranged as:


 1LB,  2MB,  3UB,  4LB,  5MB,  6UB,  7SL,  8SU  
 9LB, 10MB, ...
 ...   
 ...
Here LB denotes lower berth, MB middle berth and UB upper berth.
The following berths are called Train-Partners:


3UB   |  6UB  
2MB   |  5MB  
1LB   |  4LB  
7SL   |  8SU  
and the pattern is repeated for every set of 8 berths.

Rahul and Rashi are playing this game of finding the train partner of each berth. Can you write a program to do the same?

Input
The first line of input contains a single integer T, denoting the number of test cases to follow.

Each of the next T lines contain a single integer N, the berth number whose neighbor is to be found out.

Output
The output should contain exactly T lines each containing the berth of the neighbor of the corresponding seat.

Constraints
Subtasks
Subtask #1 (50 points):

1 ≤ T ≤ 8
1 ≤ N ≤ 8
Subtask #2 (50 points):

1 ≤ T ≤ 100
1 ≤ N ≤ 500
Example
Input:
3
1
5
3

Output:
4LB
2MB
6UB*/

import java.util.*;
class TrainPartners{

	//Make the string arrray of the seats
	private static final String[]  seats =  new String[] 
	{"SL",     "LB", "MB", "UB",     "LB", "MB", "UB",    "SU"};


	//Make the string array of the neigbours
	private static final int[] neighbours = new int[]{-1,    3, 3, 3,    -3, -3, -3,    1};


	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int t = s.nextInt();



		while(t!=0){

			System.out.println("Enter the number of berth");
			int n = s.nextInt();	//Eg 4

			int rem = n % 8;	//Since it repeats after every 8 seats


			//Add the n with the neigbour of 4 ie   -3+4 =   1
			//Add the 1 with the seat of 4th ie LB        so final ans is 1LB
			String ans = ((n + neighbours[rem]) + seats[rem]);

			System.out.println("THE TRAIN PARTNER IS " + ans); 

			t--;
		}
	}

}