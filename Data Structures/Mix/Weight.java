import java.util.Scanner;
 
public class Weight
{
    static Scanner sc = new Scanner(System.in);
    
     public static void main(String []args)
     {   
         double feet = 0.0, inch = 0.0, height = 0.0, girl = 0.0, man = 0.0;
         double  gper = 0.0, mper = 0.0;
         
         feet = sc.nextDouble();
         inch = sc.nextDouble();
         
         height = ((feet * 12) + inch) - 60;
         //System.out.print  (height);
         
         //Chick weight
         girl = (100 + (height * 5));
         gper = girl * 0.15;
         System.out.println ("\nIdeal chick weight:  " + (girl-gper) + " - " + (girl+gper) + "lbs");
         
         //Man weight
         man = (106 + (6 * height));
         mper = man * 0.15;
         System.out.println ("Ideal Man weight:  " + (man-mper) + " - " + (man+mper) + "lbs");
     }
}