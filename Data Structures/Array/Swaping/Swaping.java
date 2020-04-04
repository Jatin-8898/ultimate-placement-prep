import java.io.*;
class Swaping
{
     public static void main(String args[]) 
     {
         String name="jatin";
         int len=name.length();

         char[] c = name.toCharArray();
         
         for(int i=0;i<len-1;i=i+2)
         {
             char temp= c[i];
             c[i]=c[i+1];
             c[i+1]=temp;
         }

         System.out.println("Swapping string is: ");
         System.out.println(c);

    }
}