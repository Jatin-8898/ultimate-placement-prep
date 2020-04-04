import java.util.Scanner;
import java.util.*;
public class RansomNote {

    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    

    public RansomNote(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        
        for (String word : magazine.split(" ")) {
            Integer i = magazineMap.get(word);
            
            if (i == null) {
                magazineMap.put(word, 1);
            } else {
                magazineMap.put(word, i + 1);
            }
        }
        
        for (String word : note.split(" ")) {
            Integer i = noteMap.get(word);
            
            if (i == null) {
                noteMap.put(word, 1);
            } else {
                noteMap.put(word, i + 1);
            }
        }
    }
    
    public boolean solve() {
        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            Integer i = magazineMap.get(entry.getKey());
            
            if (i == null) {
                return false;
            } else {
                if (entry.getValue() > i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First String Magazine:");//Scan first string
		String a = in.next();			
		System.out.println("Enter the Second String Note:");//Scan second string 
		String b = in.next();
			
		RansomNote obj = new RansomNote(a,b);
        if(obj.solve()){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }		
		//System.out.println("The Total number of deletions required to make Both strings Anagram is :"+ deletionRequired(a, b));
	}

}