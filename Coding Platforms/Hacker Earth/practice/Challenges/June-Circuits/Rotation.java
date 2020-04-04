import java.util.*;

class Rotation {
    public static void main(String args[] ) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();                 // Reading input from STDIN
        String t = sc.nextLine();                 // Reading input from STDIN
        int count = 0;
        boolean isRotated = false;  

        String concat = s + s; 
        isRotated = concat.contains(t);

        if(isRotated){
            count = concat.indexOf(t);
            System.out.println(count);
        }    
        else
            System.out.println(0);

        sc.close();
    }
}
