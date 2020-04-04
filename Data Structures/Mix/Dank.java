import java.util.Scanner;

public class Dank
{
    static Scanner sc = new Scanner(System.in);
    
     public static void main(String []args)
     {   
        
        final int ONE_GAL = 350;
        double width = 0.0, length = 0.0, height = 0.0, total = 0.0;
        double windowtotal = 0.0, doortotal = 0.0;
     
       
        //inputs for square foot of wall
        width = sc.nextDouble();
        length = sc.nextDouble();
        height = sc.nextDouble();
        
        //inputs for number of windows and doors
        windowtotal = sc.nextDouble();
        doortotal = sc.nextDouble();
        
        windowtotal *= 15.0;
        doortotal *=20.0;
     
        //Square foot of room
        total = (width * height * 2) + (length * height * 2) - (windowtotal + doortotal);
        System.out.println ("\nTotal =" + total);
        
        //Gallons of paint needed
        total /= ONE_GAL;
        total = Math.ceil(total);
        System.out.println("Gallons needed: " + total);
        
        
     }
}