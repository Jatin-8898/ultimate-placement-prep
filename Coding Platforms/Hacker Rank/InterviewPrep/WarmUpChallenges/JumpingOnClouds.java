/*
1 represents danger and 0 represents valid move 

Print the minimum number of jumps needed to win the game.

Sample Input 0

7
0 0 1 0 0 1 0
Sample Output 0

4
Explanation 0: 
Emma must avoid  and . She can win the game with a minimum of  jumps:

jump(2).png

Sample Input 1

6
0 0 0 0 1 0
Sample Output 1

3
Explanation 1: 
The only thundercloud to avoid is . Emma can win the game in  jumps:

jump(5).png
*/
class JumpingOnClouds{
	/*	SOlution is try moving by 2 moves if it leads to valid state take it else go with
								1 move
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int clouds[] = new int[n];

		for (int i=0; i<n; i++) {
			clouds[i] = scanner.nextInt();		
		}

        int result = jumpsRequired(n, clouds);
	}

	static int jumpsRequired(int n, int[] clouds){
		int jumps = 0;
        int i=0;

        while(i < clouds.length-1){
            
            if(i+2<clouds.length && clouds[i+2] != 1) {	//if we can take 2 steps take it.
                jumps++;
                i = i+2;
            }
            else{									//else go by 1 step.
                jumps++;
                i++;
            }    
        }
        return jumps;
	}
}