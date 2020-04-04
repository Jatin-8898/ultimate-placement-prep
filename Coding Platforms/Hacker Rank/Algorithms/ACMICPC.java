import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int topicsMax = -1;
        int teams = 0;
        int noTopics = 0;
        int count = 0;
        
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }

        for(int j = 0; j < n; j++) {    //First line 10101
        
            for(int k = j + 1; k < n; k++) {    //Second line 11100
        
                count = 0;
        
                
                for(int i = 0; i < m; i++) {    //comparing 1 with 1 & so on
        
                    if((topic[k].charAt(i) != topic[j].charAt(i)) 
                        || (topic[k].charAt(i) == '1' && topic[j].charAt(i) == '1')) {
                        count++;
                    }                 
                } 
        
                if(count > topicsMax) { //To find the max out of all & incr team count
                    topicsMax = count;
                    teams = 1;
                }
        
                else if(count == topicsMax) {   //eg 5 and 5 came twice so INCR teams
                    teams++;             
                }
            }
        }
        System.out.println(topicsMax);
        System.out.println(teams);
    }
}