import java.util.*;


public class Ransom{


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        boolean flag = true;

        Map<String,Integer> magazineMap = new HashMap<>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){

            magazineMap.merge(in.next(), 1L, Integer::sum) ;
        
        }

        //Prepared only one map of magazines & not ransom words to to have memory efficiency 
        // Ransom note stoarge is not needed

        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String ransomWord = in.next();

            if(!magazineMap.containsKey(ransomWord) || magazineMap.get(ransomWord) == 0) {
                flag = false;
                break;
            }else {
                Integer newfrequency = magazineMap.get(ransomWord).longValue()-1L;
                magazineMap.put(ransomWord, newfrequency);
            }
        }



        if(flag)
            System.out.println("Yes");
        else 
            System.out.println("No");

        in.close();

    }
}