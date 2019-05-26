import java.util.*;
class FriendOrGirlFriend{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t =  Integer.parseInt(sc.nextLine());

        while(t > 0){
            int n  = Integer.parseInt(sc.nextLine());
            String line  = sc.nextLine();
            String[] values = line.split(" ");

            char[] letters = values[0].toCharArray();
            char[] x = values[1].toCharArray();
            
            int count = 0;

            for (int i = 0; i < letters.length; i++) {
                
                if(letters[i] == x[0]){
                    count += (n-i);
                    System.out.println("IN IF "+ count);
                
                }else{
                    for (int j = i + 1; i < letters.length; i++) {
                        if(letters[j] == x[0]){
                            count += (n-j);
                            System.out.println("BREAK "+ count);
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
            t--;
           
        }
        sc.close();
    }
}