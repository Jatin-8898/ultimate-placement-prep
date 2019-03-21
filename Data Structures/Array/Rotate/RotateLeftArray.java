import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RotateLeftArray{ 
    
    static int[] rotLeft(int[] array, int rotate , int num) {

        for(int i = 0; i < rotate; i++){

            int j, temp;
            temp = array[0];        //Store the 1st element in temp
                for(j=0; j < num-1; j++){ 
                    array[j] = array[j+1];      //Move the element one by one
                }
            array[j] = temp;        //Store the first element in last position
        }
        return array;       //Return the array
    }   

  void add(){ 
    try{
        int i,j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE TOTAL NO OF ELEMENTS:");
        int num = Integer.parseInt(br.readLine());

        System.out.println("ENTER THE ELEMENTS OF ARRAY ONE BY ONE:");
        int[] array = new int[num];
        
        for(i=0; i<num; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("ENTER THE VALUE TO BE LEFT ROTATED BY:");
        int rotate = Integer.parseInt(br.readLine());

        int[] result = rotLeft(array, rotate , num);
        
        System.out.println("SORTED ARRAY:");
        for (i = 0; i < result.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(result[i]);
      }

        
    }catch (Exception e){
        System.out.println(e);
    }
}//end of func

    public static void main(String  args[]){
        RotateLeftArray obj = new RotateLeftArray();
        obj.add();
    }
}
