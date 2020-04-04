import java.util.*;
import java.io.*;
class InsertIfEvenOdd{
    /*  IP OP            21462675756            214*6*2*67-5-7-56 
                        98676555533             98*6765-5-5-5-3-3
        If the CONSECUTIVE numbers are even put * if numbers are odd put -
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        insertStarsAndMinus(str);
        s.close();
    }
    private static void insertStarsAndMinus(String s){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length()-1; i++) {
            
            sb.append(s.charAt(i));

            if(s.charAt(i) % 2 == 0  && s.charAt(i+1) % 2 == 0)
                sb.append("*");

            else if(s.charAt(i) % 2 != 0  && s.charAt(i+1) % 2 != 0)
                sb.append("-");
        }
        sb.append(s.charAt(s.length() - 1));
        System.out.println(sb.toString());
    }
}