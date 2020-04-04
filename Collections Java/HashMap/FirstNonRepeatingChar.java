import java.util.HashMap;

/*This runs in O(n) */

class FirstNonRepeatingChar{
	public static void main(String[] args) {
		System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("xaabbdbc")); // should return 'x'
	}

	static Character nonRepeating(String s){
		HashMap<Character, Integer> map = new HashMap<>();

		for(char c : s.toCharArray()){
			if(map.containsKey(c)){						//eg if a is present
				Integer incrCount = map.get(c) + 1;		//incr the count and store it.
				map.put(c, incrCount);					//put key and count as count+1
			}else
				map.put(c,1);							//else came first time so Count is 1
		}

		for(char c: s.toCharArray())
			if(map.get(c) == 1)
                return c;
                
		return null;
	}
}