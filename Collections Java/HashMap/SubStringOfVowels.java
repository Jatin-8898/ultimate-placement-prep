import java.util.HashMap;

/*i dont know  why is the size not returning 1*/

class SubStringOfVowels{
	
	public static void main(String[] args) {
		String s = "aeoibsddaeiouudb";
		findSubString(s);
	}

	private static void findSubString(String s){
		HashMap<Integer, Character> map = new HashMap<>();

		char[] cs = s.toCharArray();
		int start = 0;

		for (int i=0; i<cs.length; i++) {
			System.out.println("VAL OF I "+i);

			if(isVowel(cs[i]) == true){
				map.put(i, cs[i]);
				//System.out.println("INSERTED");
				System.out.println(map + " " + map.size());
			}
			if(map.size() > 5){
				System.out.println("HERE");
				String temp = s.substring(start, i-start+1);
				System.out.println(temp + " ");
			
			}else{
				start = i + 1;
				System.out.println("IN ELSE " + start);
				map.clear();
			}


		}

	}

	private static boolean isVowel(char c){
		return (c =='a' || c=='e' || c=='i' || c=='o'  || c=='u' );
	}





}