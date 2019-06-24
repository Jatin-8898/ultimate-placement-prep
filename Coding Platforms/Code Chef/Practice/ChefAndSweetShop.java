import java.util.*;
class ChefAndSweetShop{
	/*Chef opened a new sweet shop. His Astrologer predicted for N consecutive days how much sale will he have, he also has to spend a specific amount of money everyday to keep the shop open. Chef believed in the words of astrologer so he decided to keep the shop closed on some days (maybe zero) such that he gets maximum profit.

	Help chef determine total profit he will have after N days. 

	Note: It does not cost anything to keep the shop closed for a day.


	Input
	The first line of the input contains an integer T denoting the number of test cases. 
	The description of T test cases follows.

	The first line of each test case contains a two space separated integers N and K 
	denoting the number of days and amount of money required to keep shop open for a day respectively

	The second line contains N space-separated integers A1, A2, ..., AN 
	where Ai means predicted sale on ith day

	Output
	For each test case, output a single line containing maximum profit chef can have in a separate line.

	Constraints
	1 ≤ T ≤ 103

	1 ≤N ≤105

	1 ≤K ≤109

	1 ≤Ai ≤109

	Example
	Input:
	1
	5 5
	10 20 4 2 1


	Output:
	20
*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF TC:");
		int t = s.nextInt();


		while(t!=0){
			System.out.println("ENTER THE NUMBER OF DAYS:");
			int days = s.nextInt();
			System.out.println("ENTER THE COST:");
			int cost = s.nextInt();

			int[] arr = new int[days];
			for (int i=0; i<days; i++) {
				arr[i] = s.nextInt();		//Scan the days in array
			}

			//This days array arr[i] contains the SP earned in that day
			//NOw the cost of running the house ie CP
			//So we need to find the PROFIT ie SP-CP

			int profit = 0;
			for (int j=0; j<arr.length; j++) {
				
				if(arr[j] < cost){
					j++;
				}
				else if(arr[j] > cost){
					profit = profit +  (arr[j] - cost);

				}
			}

			System.out.println("PROFIT EARNED IS: " +profit);

        }
        s.close();
	}
}