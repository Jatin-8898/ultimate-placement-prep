import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/*
Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output

true
true
true
false
false
false
*/
class ValidIP{

	/*
	000.12.12.034
	121.234.12.12
	23.45.12.56
	Some invalid IP address:

	000.12.234.23.23
	666.666.23.23
	.213.123.23.32
	23.45.22.32.
	I.Am.not.an.ip
	*/

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    /*
        1) \\d{1,2} catches any one or two digit number

        2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.

        3) 2[0-4]\\d catches numbers between 200 and 249.

        4) 25[0-5] catches numbers between 250 and 255.

        Note that \d represents digits in regular expressions, same as [0-9]
    */
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
    
}