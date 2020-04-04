import java.util.*;
public class Lucky{
 
     public static void main(String []args){
        
        int money, userMoney; //userMoney is the amount user started with. Money is the total after the rolls
        int die1, die2, sum;
        int i = 1, roll = 0; // i is the counter, roll will hold the value of the counter when needed
        
         Scanner scan = new Scanner(System.in);
         Random generator = new Random();
         
         money = scan.nextInt();
         userMoney = money;
         
         System.out.println ("You have how much cash?: " + money);
         
         while( money > 0){  //when your money runs out game is over
             i++;
             
             die1 = generator.nextInt(6) + 1; 
             die2 = generator.nextInt(6) + 1;
             
             sum = die1 + die2;
             
             if (sum == 7){
                 money += 4;
             } else {
                 money -= 1;
             }
             
             if (userMoney < money){ 
                 roll = i;           // roll is storing what roll u had the highest amount of $ on
                 userMoney = money;  //userMoney will store the value of the max $ amount
             }
         }
         
        System.out.println ("You are broke after " + i + " rolls !!");
        
        if (roll == 0){
            System.out.println ("You should have quit before you started! HAHAH"); // displays this if user never made more $ than when he/she started
        }else{
           System.out.println ("You should have quit after " + (roll) + " rolls when you had $" + (userMoney)); //shows when user had the highest amount of money and what roll it was on
            
        }
     }
}