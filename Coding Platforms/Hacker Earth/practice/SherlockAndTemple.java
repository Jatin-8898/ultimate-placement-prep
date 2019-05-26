import java.util.*;
/*There is a mysterious temple in Mysteryland. The door of the temple is always closed.It can only be opened by a unique procedure.There are two boxes and N items outside the temple.Sherlock holmes visits the temple many times.Each time Sherlock holmes visits the temple,the number of items N outside the door of the temple is changed but each time he anyhow manages to know the cost of those N items.The door of the temple can only be opened if those "N items" are distributed in those two boxes such that the sum of cost of items in one box is equal to the sum of cost of items in other box.Sherlock holmes is trying to do such a distribution so as to open the door of the temple.you have to tell whether the door the temple can be opened or not.

INPUT

the first line contain the number of test cases i.e the number of time sherlock holmes visits the temple. Next lines contains the description of those test cases.For the first line contain number of items "N".The second line contains cost of those N items.

OUTPUT

output "YES" if the door of the temple can be opened otherwise output "NO".*/
class SherlockAndTemple{

	/*Given an integer "N". 
The second line contains cost of those N items.

output "YES" if the door of the temple can be opened otherwise output "NO". 
(Door could be open in case if the costs of items in both boxes are equal).

Pre-requisites: Dynamic Programming Skills.

Difficulty Level: Medium.

Hints: If the summation of items costs is odd, then print "NO", 
else implement a DP with 2 states,  ,  in one box.

Detailed Editorial:

This Question depends on your Dynamic Programming Skills.

Firstly:

You should find the summation of costs for all items, 
then you will 2 cases:

A) If the summation of costs is odd:

Print("NO"), as there is no way to divide the items in 
2 boxes with equal costs.

B) If the summation of costs is even:

Then you should apply a DP:

1) DP States:

A)  for traversing the items.
B) Summation of costs of items in the first box.

Note: There is no need to store a state for the summation of
costs in the second box, as you can deduce it:

Costs in second box = total costs of items - costs in first box.

2) DP Transition:

You will have 2 transitions:

A) Add the cost of this box to the costs of first box.
B) Don't add the cost of this box to the costs of first box,
(that means you add the cost to second box).

rec(index + 1, tot + arr[index]);
rec(index + 1, tot);
3) Base Case:

When you end traversing the boxes:

if(index == n){                     // base case

    if(tot == sum / 2) flag = true;     //valid case
    return;
}
Time Complexity: .O(n3)

Memory Space Complexity: .O(n3)*/

	static boolean flag = false;
	static boolean visited[][] = new boolean[100+5][1000+5];
	static int[] arr = new int[100+5];


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while(t!=0){
			int n = s.nextInt();
			int sum = 0;
			
			for (int i=0; i<n ; i++) {
				arr[i] = s.nextInt();
				sum = sum+arr[i];
			}

			if(sum%2 !=0)
				System.out.println("NO\n");

			else{
				recur(0, 0,sum, n);
				if(flag)
					System.out.println("YES\n");
				else
					System.out.println("NO\n");
			}
			t--;
			
		}
	}


	private static void recur(int index,int total,int sum,int n){
		
		if(index == n){	// base case
			if(total == sum/2)
				flag  = true;	//valid case
			return;
		}

		 if(visited[index][total])              // check if this state visited befor
		 	return;

		recur(index + 1, total + arr[index] ,sum, n);       // add this item to first box
	    recur(index + 1, total ,sum,n);                    // add this item to second box
	    visited[index][total] = true;                 // mark this state is visited	

	}
}