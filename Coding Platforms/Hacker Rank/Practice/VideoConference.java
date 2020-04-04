/*Bob is making a video conference software. Whenever a new person joins the conference, Bob displays the person's name in the interface.

However, displaying full name is tedious and takes much space. So he decided to display the shortest prefix which doesn't match with any prefix of any person who has joined earlier.

Let's suppose the first person to enter the conference is alvin.

image

Now suppose next person to join is alice. The shortest prefix of alice that doesn't match with any prefix of alvin is ali.

image

If the full name of a new person matches completely with the full name of any person who has joined earlier, he will display the full name and add a suffix which indicates how many times the same name has occurred in the list so far. For example, if another person name alvin joins, the list will look like this:

image

You are given the list of the persons who have joined the call in the chronological order. Your task is to figure out how the final list looks like.

Input Format

The first line contains an integer .

The subsequent  line contains a string  denoting the name of the  person to join the call.

Constraints

 will contain only lower-case english letters.
Subtask

 for  of the maximum score
Output Format

Return a string array with  items, the  line should contain the prefix of name of the  person which doesn't match with any other person who has joined earlier.

Sample Input 0

3
alvin
alice
alvin
Sample Output 0

a
ali
alvin 2
Sample Input 1

6
mary
stacy
sam
samuel
sam
miguel
Sample Output 1

m
s
sa
samu
sam 2
mi*/

import java.util.*;
class VideoConference{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER TOTAL NO OF STRINGS :");
		int n = s.nextInt();
		String[] names  = new String[n];

		System.out.println("ENTER ONE BY ONE TILL n-1: ");
		for (int i=0; i<n; i++) {
			names[i] = s.nextLine();
		}
		

		List<String> wordList = Arrays.asList(names);
		
		List<String> res = new ArrayList<String>();
		res = solve(wordList);

		for(String a : res)
			System.out.println(a);
	}

	public static List<String> solve( List<String> names) {
        HashSet<String>  hashset = new HashSet<>();
        HashMap<String, Integer> hashmap = new HashMap<>();
        List<String>   l = new ArrayList<>();

        for (String name : names) {
            
            if (hashmap.containsKey(name)) {						//if it containsKey for eg alice
            
                int n = hashmap.get(name);							//Just  get it & incr the count
                hashmap.put(name, n+1);
                l.add(name + " " + Integer.toString(n+1));			//add it in list as alice 2
            
            } else {

                hashmap.put(name, 1);								//Insert it for 1st time
                
                String t = "";
                boolean inserted = false;

                for (char c : name.toCharArray()) {					//for findingthe prefix
                    t = t + c;											//eg alice append char by char
                    
                    if (!inserted   &&   !hashset.contains(t)){		//if its not inserted & !hashset
                        inserted = true;							//insert it for first time eg a
                        l.add(t);		
                    }

                    hashset.add(t);
                
                }
                
                if (!inserted) 								//if some remaining and still not inserted
                	l.add(t);
            }
        }
        return l;
        
    }

    /*ANOTHER SOLN*/
    public static List<String> solve2(List<String> names) {
        Map<String,Integer> data = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(String name : names){
            
            boolean isPrefixFound = false;
            
            for(int i = 1; i < name.length(); i++){
                String prefix = name.substring(0,i);
                
                if(!isPrefixFound && !data.containsKey(prefix)){
                    isPrefixFound = true;
                    result.add(prefix);
                }
                
                if(!data.containsKey(prefix)){
                    data.put(prefix,0);
                }
            }
            
            int occures = data.getOrDefault(name,0);
            
            if(!isPrefixFound){
              String proccessed = (occures==0)?name:name + " " + (occures+1);
              result.add(proccessed);
            }
            
            data.put(name,occures+1);
        }
        
        return result;
    }

}