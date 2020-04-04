// Java program to find out the second 
// most repeated word 
import java.util.*;

class SecondMostRepeatedWord {

    public static void main(String[] args) {
        String arr[] = { "ccc", "aaa", "ccc", "ddd", "aaa", "aaa" , "ddd", "aaa"};
        List<String> seq = Arrays.asList(arr);
        secondMostRepeatedWord(seq);
    }

    private static void secondMostRepeatedWord(List<String> list){
        Map<String, Integer> map = new TreeMap<String, Integer>(Collections.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
    
			if(map.containsKey(list.get(i))){						//eg if a is present

				Integer incrCount = map.get(list.get(i)) + 1;		//incr the count and store it.
				map.put(list.get(i), incrCount);					//put key and count as count+1

			}else{
				map.put(list.get(i), 1);				//else came first time so Count is 1
			}
		}
        
        //System.out.println(map);

        String lastKey = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            lastKey = entry.getKey();
        }
        map.remove(lastKey);

        ///System.out.println(map);
        String SecondLastKey = "";
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            SecondLastKey = entry.getKey();
        }
        System.out.println(SecondLastKey);
    }
}
