import java.util.*;
 
public class Usernames {
 
    public static void main(String[] args) {
    
        String first, last, username;
        int randomNum;
        
        // Scan in first and last name
        Scanner scan = new Scanner(System.in);
        first = scan.nextLine();    //enter 1 initial char
        last = scan.nextLine();     //enter 5 chars
        
        // Create random number 10-99
        // add 10 so the lowest number generated is 10
        // randomize 90 numbers because 0 counts as a number
        Random generator = new Random();
        randomNum = generator.nextInt(90) + 10;
        
        // Display custom username
        username = first.charAt(0) + last.substring(0, 5) + randomNum;
        System.out.println(username);
    }
}