import java.util.*;
class ATM{
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int withdraw = s.nextInt();
        double bal  = s.nextDouble();

        if(withdraw % 5 == 0){  //if multiple

            if(withdraw + 0.5 <= bal){  //if sufficient funds
                
                double res = bal - withdraw - 0.50;
                System.out.println(res);
            
            }else
                System.out.println(bal);
        }else
            System.out.println(bal);

        s.close();
    }
}