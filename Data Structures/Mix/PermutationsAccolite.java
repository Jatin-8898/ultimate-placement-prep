import java.util.*;
class PermutationsAccolite {
 
    public static void main(String[] args) {
        int n = 4321;
        String s = Integer.toString(n); 
        List<Integer> ans = permute(s, 2);  //Make permutations of size 2
        for(Integer i: ans)     System.out.println(i);
    }

    public static List<Integer> permute(String s, int limit) {
        
        List<Integer> list = new ArrayList<>();       //Eg 1 2 3
        backtrack(list, s, new String(), limit);
        return list;
    }

    private static void backtrack(List<Integer> list, String s, String str, int limit){
        
        if(str.length() == limit)         //If tempList has 3 element add to Main List
            list.add(Integer.parseInt(str));
        
        else{
            
            for(int i = 0; i < s.length(); i++){ 

                if(str.indexOf(s.charAt(i)) > 1)        // element already exists, skip
                    continue; 

                str += s.charAt(i);
                backtrack(list, s, str, limit);

                str.replace(str.charAt(str.length()-1), ' ');       //To remove 1 2 3 after 1 iteration
            }
        }
    }
}