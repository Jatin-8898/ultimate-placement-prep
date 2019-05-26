import java.util.*;
class DoMe{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set  = new HashSet<>();
        for (Character i: s.toCharArray()) {
            set.add(i);
        }
        System.out.println(set.size());

        sc.close();
    }
}