import java.util.*;
public class HiLowGame{
 
    public static void game(){
        int num, play, guess, i = 1;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();    //Random obj
        
        System.out.println("[1] Play\n[2] Quit");
        play = scan.nextInt();  
     
        while ( play <= 2 ){            /* Only if number is less than or equal to 2 */
        
            if (play == 1){
                System.out.println ("Guess a number 1 to 100");   
                num = generator.nextInt(100) + 1;
                //System.out.println(num);
                
                while (play == 1){        //Until its playing
                    i++;
                    guess = scan.nextInt();
            
                    if (guess == num){ 
                        System.out.println ("Nice, You got it! \nIt took you " + (i - 1) + " tries to guess the number " + num );
                        break;

                     }else if (guess < num){ 
                        System.out.println ("Too Low");
                        System.out.println ("[1] Guess Again  [2] Quit");
                        play = scan.nextInt();
                        if (play == 2){
                            System.exit(1);
                        } else if (play==1){
                            System.out.println ("Guess Again:");
                            continue;
                        }
                        
                     }else if (guess > num){ 
                        System.out.println ("Too High");
                        System.out.println ("[1] Guess Again  [2] Quit");
                        play = scan.nextInt();
                        if (play == 2){
                            System.exit(1);
                         }else if (play==1){
                            System.out.println ("Guess Again:");
                            continue;
                        }
                    }
                }
                    
        
            }else if (play == 2) {
               System.exit(1);
            }
            
            System.out.println("[1] Play Again \n[2] Quit");
            play = scan.nextInt();
        
      }  
    }

     public static void main(String []args){
        game();
   }


   /*This is an Example of static block 
   Which can be acessed without creating the object of the class*/
}  	