import java.util.*;
/*Two friends Kunal and Satyam are playing an interesting game. They take turns drawing a ball from a bag which initially contains R red balls and G green balls. Each player draws a ball alternatively and never put it back. The person who is the first to draw a red balls wins. Satyam always draws first. If there are no more balls in the bag and nobody has drawn a red ball, the satyam wins.

What is the probability of the Satyam winning?
Input:
The first line will contain the number of test cases T.
The first line of each test case will contain a number R (number of red balls) and G(number of green balls )
SAMPLE INPUT 
3
2 1
1 1
10 0
SAMPLE OUTPUT 
0.666667
0.500000
1.000000
*/ 
 
class WinTheGame {
    public static void main(String args[] ) throws Exception {
       
       Scanner s=new Scanner(System.in);
       int test=s.nextInt();
       while(test-->0)
       {
           double r=s.nextDouble();
           double b=s.nextDouble();
           
           if((r==0 && b==0 )|| (r==0 && b!=0))
           {
        	   System.out.println("1.000000");
           }
           else
           {
           
           double game=GetProb(r,b,r+b);
           
           System.out.printf("%.6f",game);
           System.out.println();
           }
        }
    }
    
   static double GetProb(double noOfRb,double noOfGb,double total){

		double ans = noOfRb/total;

		if(noOfGb>2){
			ans += (noOfGb/total)  *  ((noOfGb-1)/(total-1)) * GetProb(noOfRb,  noOfGb-2, total-2);
		}

		return ans;
	}
}




