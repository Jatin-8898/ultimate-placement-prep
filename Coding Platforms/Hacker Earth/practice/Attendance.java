
import java.util.*;
/*
Raghav lives in Strangeland and studies in a college where it is mandatory to maintain a minimum of 75% attendance in each subject or else you are not allowed to appear for the exam of that subject. Consider the subject AI (Artificial Intelligence) for which the total number of classes held till the present date equals . ​Raghav has only attended  out of these  classes. Find minimum how many extra classes should be held so that he is allowed to appear for the AI exam. Assume that he attends all the extra classes
SAMPLE INPUT 
5
7 6
9 1
6 3
10 5
2 1
SAMPLE OUTPUT 
0
23
6
10
2

*/
class Attendance {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        while (t> 0){
            int x = s.nextInt();
            int y= s.nextInt();
            
            int ans = 3 * x  - 4 * y;       //Since we want 75% so, 3 
            
            if(ans < 0)
                System.out.println(0);
            else
                System.out.println(ans);
            
            t--;
        }
       

    }
}
