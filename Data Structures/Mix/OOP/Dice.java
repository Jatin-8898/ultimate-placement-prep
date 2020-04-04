import java.util.*;
public class Dice
{
     public static void main(String []args)
     {
        int die1, die2;
        
        // Random number generator
        Random generator = new Random();
        
        die1 = generator.nextInt(6) + 1;
        die2 = generator.nextInt(6) + 1;
      
        System.out.println ("Die 1: " + die1 + "\nDie 2: " + die2 + "\ntotal: " + (die1 + die2) );
    
     }
}