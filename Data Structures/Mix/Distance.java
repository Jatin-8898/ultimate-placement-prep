import java.util.*;
 
public class Distance
{
    public static void main(String[] args)
    {
        int x1, y1;
        int x2, y2;
        int inside, distance;
        
        Scanner scan = new Scanner(System.in);
        
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        
        //equation inside of the square root
        inside = (int)Math.pow((x2-x1), 2) + (int)Math.pow((y2-y1), 2);
        //sqaure root of the inside
        distance = (int)Math.sqrt(inside);
        
        System.out.println (distance);
        
        
    }
}