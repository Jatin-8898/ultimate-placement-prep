import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class SumofArray{ 
    
    static int simpleArraySum(int[] array) {
        int sum = 0;    //Initialize to null
        for(int i = 0; i < array.length; i++){     //Iterate 
            sum += array[i];                       //Add the sum
            //System.out.println(sum);
        }
        return sum;     
    }

  void add(){ 
    try{
        int i,j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE VALUE OF NUM:");
        int num = Integer.parseInt(br.readLine());

        System.out.println("ENTER THE ELEMENTS OF ARRAY:");
        int[] array = new int[num];
        
        for(i=0; i<num; i++)
        {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        int result = simpleArraySum(array);

        System.out.println("THE SUM IS:");
        System.out.println(result);
        
        
    }catch (Exception e){}
}//end of func

    public static void main(String  args[]) 
    {
        SumofArray obj = new SumofArray();
        obj.add();
    }
}
