import java.util.*;
import java.io.*;
/* 
    The problem is to check for the element
    which occurs 
    Eg 1 2 2 1 5 1
    So 1 occurs 3 times Therefore calculate its index
    
    for Index 0 ->    |0-3| + |0-5| = 8 
    Similarly for every index

    so final ans -> 8 1 1 5 0 7
*/
class Restaurtant{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(1);
        l.add(5);
        l.add(1);

        List<Long> ans = findMinCost(l);
        for(Long i: ans){
            System.out.print(i + " ");
        }
    }

    private static List<Long> findMinCost(List<Integer> r){
        List<Long> l = new ArrayList<>();
        int x = 0, y=0 , res = 0;
        
        for(int i=0; i<r.size(); i++){

            res = 0;
            
            for(int j=0; j<r.size(); j++){
            
                x = r.get(i);
                y = r.get(j);
            
                if(x == y){
                    res += Math.abs(j-i);
                }
            }
            
            l.add((long)res);       //Other way Long.valueOf(res)   OR new Long(res);
        }
        return l;
    } 
}