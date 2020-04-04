import java.util.*;
import java.io.*;
class MaxLenEvenWord{
    public static void main(String[] args) {
        //String s = "time to write great code";
        //String s = "Write code for a great time";
        //String s = "Are you alright is it okay";
        String s = "Many happy men are roaming around in garden";
        evenLenWord(s);
    }
    private static void evenLenWord(String s){
        int max = 0;
        int index = -1;
        int currLen = 0;
        int i = 0;

        while(i < s.length()){
            
            if(s.charAt(i)== ' '){      //When found space calculate the len till now
                
                if(currLen % 2 == 0){
                    if(max < currLen){
                        max = currLen;
                        index = i - currLen;
                    }
                }
                currLen = 0;            //Encountered space so now reset the currLen to 0
            }                           //If not a space add the currLen++
            else
                currLen++;

            i++;            //Since i wil increment everytime 
        }

        if (currLen % 2 == 0)   // Check length of last word.  
        {  
            if(max < currLen){
                max = currLen;
                index = i - currLen;
            }
        }  
    
        if (index == -1){       // If no even length word is present then return -1.  
            System.out.println("OO");   System.exit(0);
        }    

        System.out.println(s.substring(index, index + max));
    }
}