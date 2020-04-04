import java.util.*;


public class MakeBinaryAlternate{
	
	/*Given a binary string, the task is to find minimum number of characters 
	to be removed from it so that it becomes alternate. 
	A binary string is alternate if there are no two consecutive 0s or 1s.*/
	
	public static void main(String[] args) {
		System.out.println("ENTER THE BINARY STRING:");	//eg 000110011 it should be 0101
		Scanner s = new Scanner(System.in);				//op 2+1+1+1 ie 5 chars should be removed 
		String str = s.nextLine(); 
		
		StringBuffer buffer = new StringBuffer(str);

		int deletions = checkForAlternative(buffer);
		System.out.println("5 Deletions are required: "+deletions);
	}


	private static int checkForAlternative(StringBuffer s){
		
		int result = 0;
 
        for (int i = 0;  i < (s.length() - 1);  i++){
 
            // if two alternating characters of string are same
            if (s.charAt(i) == s.charAt(i + 1)){
                result++; // then need to delete a character        
                //s.deleteCharAt(i);
                //s.delete(i,i+1);
            }
 		}
 		//System.out.println("THE STRING IS : "+s);
        return result;










		/*char[] items = s.toCharArray();

		int current = items[0];
		int next = current + 1;
		int deletions = 1;
		
		for(int i=0; i<items.length; i++){
			System.out.println(items[i]);	
		}

		for(int i=0;  i<items.length;  i++){
			if(current != next){	//No need to perform operation
				current++;
				next++;
				System.out.println("NEXT:"+ next + "CURRNET:" +current);
			}else{
				int temp = next;
				deletions++;
				System.out.println("NEXT:"+ next + "CURReNT:" +current + "DEL:"+deletions);
			}
		}
		return deletions;*/
	}

}