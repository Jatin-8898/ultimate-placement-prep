import java.util.*;
class A{
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0){
            int a  = s.nextInt();
            
            System.out.println(a);
            t--;
        }
        s.close();
    }
}