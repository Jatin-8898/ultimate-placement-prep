import java.util.Arrays;

class a{
    public static void main(String[] args) {
        char[] a = {65,66,67};
        for(char i: a){
            System.out.print(i+ " ");
        }
        String s = String.valueOf(a);
        System.out.println(s);
        
        
        int[] b = {65,66,67};
        for(int i: b){
            System.out.print(i+ " ");
        }
        System.out.println(Arrays.toString(b));
        
    }
}